package eventos8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class LaminaPrincipal extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton botonCerrar;
	
	public LaminaPrincipal() {
		JButton botonNuevo = new JButton("Nuevo");
		add(botonNuevo);
		botonCerrar = new JButton("Cerrar todo"); 
		add(botonCerrar);
		OyenteNuevo oyente = new OyenteNuevo();
		botonNuevo.addActionListener(oyente);
		
	}
	
	private class OyenteNuevo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			MarcoEmergente marco = new MarcoEmergente(botonCerrar);	
			marco.setVisible(true);
		}
		
	}
}
