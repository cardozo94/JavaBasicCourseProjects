package jars.recursos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class LaminaRecursos extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextArea texto;
	JButton dale;
	
	public LaminaRecursos() {
		setLayout(new BorderLayout());
		texto = new JTextArea();
		add(texto, BorderLayout.CENTER);
		
		URL rutaIcono = LaminaRecursos.class.getResource("../../blue.gif");
		
		dale = new JButton("Dale", new ImageIcon(rutaIcono));
		dale.addActionListener(new ActionBoton());
		add(dale, BorderLayout.SOUTH);
	}
	
	private class ActionBoton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			texto.setText("El botón "+dale.getText()+" funciona!");
			
		}
		
	}
}
