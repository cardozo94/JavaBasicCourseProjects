package servidor;

import java.awt.BorderLayout;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import cliente.net.Mensajero;
import cliente.net.PaqueteEnvio;
import servidor.net.Buzon;

public class MarcoServidor extends JFrame implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea areaTexto;

	public MarcoServidor() {
		setBounds(1200, 300, 280, 350);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		areaTexto = new JTextArea();
		panel.add(areaTexto, BorderLayout.CENTER);
		add(panel);
		Thread thread = new Thread(this);
		thread.start();
		setVisible(true);
		
	}

	@Override
	public void run() {
		System.out.println("Estoy escuchando");
		Buzon buzon = new Buzon(7777);

		while (true) {
//			areaTexto.append(buzon.start()+"\n");
			String[] datos = buzon.startForObject();
			areaTexto.append(datos[0] + ": " + datos[2] + " para " + datos[1] + "\n");
			PaqueteEnvio envio = new PaqueteEnvio();
			if (!datos[2].equals("Online")) {
				Mensajero mensajero = new Mensajero(datos[1], 9090);
				envio.setIp(datos[1]);
				envio.setNick(datos[0]);
				envio.setMensaje(datos[2]);
				mensajero.send(envio);
				mensajero.close();
			}else {
				Set<String> ipClientes = buzon.getIpClientes(); 
				envio.setIpClientes(ipClientes);
				envio.setMensaje("IPs");
				ipClientes.forEach(ip -> { 
					Mensajero mensajero = new Mensajero(ip, 9090);
					mensajero.send(envio);
					mensajero.close();
					});
				
			}
		}

	}

}
