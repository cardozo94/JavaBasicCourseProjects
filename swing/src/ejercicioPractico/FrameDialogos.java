package ejercicioPractico;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FrameDialogos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LaminaBotones laminaTipo, laminaConfirmar, laminaTipoMensaje, laminaOpcion, laminaMensaje, laminaEntrada;
	private String message = "Mensaje";
	private Icon iconMessage = new ImageIcon("resources/graphics/blue.gif");
	private Object objectMessage = new Date();
	private Component panelComponet = new LaminaEjemplo();

	public FrameDialogos() {
		setTitle("Prueba de diálogos");
		setBounds(250, 250, 600, 350);
		setLayout(new BorderLayout());

		JPanel laminaCuadricula = new JPanel();
		laminaCuadricula.setLayout(new GridLayout(2, 3));

		String[] tipo = { "Mensaje", "Confirmar", "Opción", "Entrada" };
		String[] Confirmar = { "DEFAULT_OPTION", "YES_NO_OPTION", "YES_NO_CANCEL_OPTION", "OK_CANCEL_OPTION" };
		String[] tipoMensaje = { "ERROR_MESSAGE", "INFORMATION_MESSAGE", "WARNING_MESSAGE", "QUESTION_MESSAGE",
				"PLAIN_MESSAGE" };
		String[] opcion = { "String[]", "Icon[]", "Object[]" };
		String[] mensaje = { "Cadena", "Icono", "Componente", "Otros", "Object[]" };
		String[] entrada = { "Campo de texto", "Combo" };

		laminaTipo = new LaminaBotones("Tipo", tipo);
		laminaConfirmar = new LaminaBotones("Confirmar", Confirmar);
		laminaTipoMensaje = new LaminaBotones("Tipo de Mensaje", tipoMensaje);
		laminaOpcion = new LaminaBotones("Opción", opcion);
		laminaMensaje = new LaminaBotones("Mensaje", mensaje);
		laminaEntrada = new LaminaBotones("Entrada", entrada);

		laminaCuadricula.add(laminaTipo);
		laminaCuadricula.add(laminaTipoMensaje);
		laminaCuadricula.add(laminaMensaje);
		laminaCuadricula.add(laminaConfirmar);
		laminaCuadricula.add(laminaOpcion);
		laminaCuadricula.add(laminaEntrada);

		add(laminaCuadricula, BorderLayout.CENTER);

		JButton mostrar = new JButton("Mostrar");
		mostrar.addActionListener(new MostrarEvento());
		JPanel laminaInferior = new JPanel();
		laminaInferior.add(mostrar);
		add(laminaInferior, BorderLayout.SOUTH);

		setVisible(true);
	}

	public int getMessagType() {
		int msgType = 0;
		switch (laminaTipoMensaje.getSelection()) {
		case "ERROR_MESSAGE":
			break;
		case "INFORMATION_MESSAGE":
			msgType = 1;
			break;
		case "WARNING_MESSAGE":
			msgType = 2;
			break;
		case "QUESTION_MESSAGE":
			msgType = 3;
			break;
		case "PLAIN_MESSAGE":
			msgType = -1;
			break;
		default:
			break;
		}
		return msgType;
	}

	public int getOptionType() {
		int type = 0;
		switch (laminaConfirmar.getSelection()) {
		case "DEFAULT_OPTION":
			type = -1;
			break;
		case "YES_NO_OPTION":
			break;
		case "YES_NO_CANCEL_OPTION":
			type = 1;
			break;
		case "OK_CANCEL_OPTION":
			type = 2;
			break;
		default:
			type = -1;
			break;
		}
		return type;
	}

	public Object getMessage() {
		switch (laminaMensaje.getSelection()) {
		case "Cadena":
			return message;
		case "Icono":
			return iconMessage;

		case "Componente":
			return panelComponet;

		case "Otros":
			return objectMessage;

		case "Object[]":
			return new Object[] { message, iconMessage, panelComponet, objectMessage };
		default:
			return message;

		}
	}

	public Object[] getOptions() {

		switch (laminaOpcion.getSelection()) {
		case "String[]":
			return new String[] { "Amarilo", "Azul", "Rojo" };
		case "Icon[]":
			return new Object[] { new ImageIcon("resources/graphics/yellow.gif"),
					new ImageIcon("resources/graphics/blue.gif"), new ImageIcon("resources/graphics/red.gif") };
		case "Object[]":
			return new Object[] { message, iconMessage, panelComponet, objectMessage };
		default:
			return new String[] { "Amarilo", "Azul", "Rojo" };
		}
	}
	
	public void selectInputDialog(Object msg, int msgType) {
		String tipo = laminaEntrada.getSelection(); 
		if(tipo.equals("Campo de texto"))
			JOptionPane.showInputDialog(this, msg, "Entrada", msgType);
		else if(tipo.equals("Combo"))
			JOptionPane.showInputDialog(this, msg, "Entrada", msgType, null, new String[] {"Amarrillo", "Azul", "Rojo"}, "Azul");
	}

	private class MostrarEvento implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int msgType = getMessagType();
			Object message = getMessage();
			String tipo = laminaTipo.getSelection();
			if (tipo.equals("Mensaje"))
				JOptionPane.showMessageDialog(FrameDialogos.this, message, "Mensaje", msgType);
			else if (tipo.equals("Confirmar"))
				JOptionPane.showConfirmDialog(FrameDialogos.this, message, "Confirmar", getOptionType(), msgType);
			else if (tipo.equals("Entrada"))
				selectInputDialog(message, msgType);
			else if (tipo.equals("Opción"))
				JOptionPane.showOptionDialog(FrameDialogos.this, message, "Opción", 0, msgType, null, getOptions(), null);
		}

	}
}
