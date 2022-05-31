package applets.calculadora.emergente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Calculadora extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame marco;
	
	public void init() {
		
		marco = new JFrame();
		marco.setSize(500, 300);
			
		LaminaPrincipal myPanel = new LaminaPrincipal();
		marco.add(myPanel);
		
		JButton botonCalculadora = new JButton("Calculadora");
		botonCalculadora.addActionListener(new EventosBoton());
		add(botonCalculadora);
	}
	
	private class EventosBoton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			marco.setVisible(!marco.isVisible());
		}
		
	}

}
