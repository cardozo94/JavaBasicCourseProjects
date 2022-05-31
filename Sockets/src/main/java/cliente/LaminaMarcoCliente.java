package cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import cliente.net.Mensajero;
import cliente.net.PaqueteEnvio;
import servidor.net.Buzon;

public class LaminaMarcoCliente extends JPanel implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField campo1;
	private JLabel nick;
	private JComboBox<String> ip;
	private JButton boton;
	private JTextArea campoChat;
//	private static Logger logger = LogManager.getLogger(LaminaMarcoCliente.class);

	public LaminaMarcoCliente() {

		String usuario = JOptionPane.showInputDialog("Nick: ");
		JLabel nicktitle = new JLabel("Nick: ");
		add(nicktitle);
		nick = new JLabel(usuario);
		add(nick);
		JLabel texto = new JLabel("Online: ");
		add(texto);
		ip = new JComboBox<String>();
		add(ip);
		campoChat = new JTextArea(13, 25);
		add(campoChat);
		campo1 = new JTextField(20);
		add(campo1);
		boton = new JButton("Enviar");
		boton.addActionListener(new EnviaTexto());
		add(boton);
		Thread hilo = new Thread(this);
		hilo.start();
	}

	private class EnviaTexto implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			String infoToSend = campo1.getText();

			Mensajero mensajero = new Mensajero(7777);

			PaqueteEnvio datos = new PaqueteEnvio();
			datos.setNick(nick.getText());
			datos.setIp((String) ip.getSelectedItem());
			datos.setMensaje(infoToSend);

			mensajero.send(datos);
			campoChat.append("\n" + infoToSend);
			campo1.setText("");

//			System.out.println(infoToSend);
//			logger.info(infoToSend);
		}

	}

	@Override
	public void run() {
		System.out.println("Estoy escuchando");
		Buzon buzon = new Buzon(9090);

		while (true) {
			String[] datos = buzon.startForObject();
			if (!datos[2].equals("IPs")) {
				campoChat.append("\n" + datos[0] + ": " + datos[2]);
			} else {
				ip.removeAllItems();
				buzon.getIpClientes().forEach(ips -> {
						ip.addItem(ips);
					}
					);
			}
//			Mensajero mensajero = new Mensajero(datos[1], 9090);
//			PaqueteEnvio envio =  new PaqueteEnvio();
//			envio.setIp(datos[1]);
//			envio.setNick(datos[0]);
//			envio.setMensaje(datos[2]);
//			mensajero.send(envio);
//			mensajero.close();
		}

	}

}
