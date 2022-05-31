package servidor.net;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

import cliente.net.PaqueteEnvio;

public class Buzon {

	private ServerSocket server;
	private Set<String> ipClientes;
	private String localIp;

	public Buzon(int port) {
		try {
			server = new ServerSocket(port);
			ipClientes = new HashSet<String>();
			setLocalIp(InetAddress.getLocalHost().getHostAddress());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Set<String> getIpClientes() {
		return ipClientes;
	}

	public void setIpClientes(Set<String> clientes) {
		this.ipClientes = clientes;
	}

	public String getLocalIp() {
		return localIp;
	}

	public void setLocalIp(String localIp) {
		this.localIp = localIp;
	}

	public String start() {
		String mensaje;
		try {
			Socket socket = server.accept();
			DataInputStream entrada = new DataInputStream(socket.getInputStream());
			mensaje = entrada.readUTF();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
			mensaje = null;
		}
		return mensaje;
	}

	public String[] startForObject() {
		String nick = "";
		String ip = "";
		String mensaje = "";
		String[] datos = new String[3];
		PaqueteEnvio paqueteRecibido = new PaqueteEnvio();
		try {
			Socket socket = server.accept();
			ObjectInputStream entrada = new ObjectInputStream(socket.getInputStream());
			paqueteRecibido = (PaqueteEnvio) entrada.readObject();
			socket.close();
			mensaje = paqueteRecibido.getMensaje();
			if (mensaje.equals("Online")) {

				/// ---------DETECTA ONLINE-------------//
				InetAddress remoto = socket.getInetAddress();
				String ipRemota = remoto.getHostAddress();
				ipClientes.add(ipRemota);
				ipClientes.forEach(ips -> System.out.println("Online: "+ips));
				/// ---------DETECTA ONLINE-------------//
			} else if(mensaje.equals("IPs")){
				ipClientes = paqueteRecibido.getIpClientes();
			}else {
				nick = paqueteRecibido.getNick();
				ip = paqueteRecibido.getIp();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		datos[0] = nick;
		datos[1] = ip;
		datos[2] = mensaje;
		return datos;
	}

}
