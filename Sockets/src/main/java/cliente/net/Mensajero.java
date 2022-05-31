package cliente.net;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Mensajero {
	
	private Socket socket;
	
	public Mensajero(int port){
			try {
				socket = new Socket("192.168.1.2",port);
			} catch (UnknownHostException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	}
	
	
	public Mensajero(String ip, int port) {
			try {
				socket = new Socket(ip,port);
			} catch (UnknownHostException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	}
	
	public void send(String text) {
		try {
			DataOutputStream salida = new DataOutputStream(socket.getOutputStream());
			salida.writeUTF(text);
			salida.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void send(PaqueteEnvio datos) {
		try {
			ObjectOutputStream paqueteDatos = new ObjectOutputStream(socket.getOutputStream());
			paqueteDatos.writeObject(datos);
			paqueteDatos.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void close() {
		try {
			socket.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
