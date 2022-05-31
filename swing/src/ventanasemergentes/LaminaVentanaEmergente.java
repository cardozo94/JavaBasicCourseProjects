package ventanasemergentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LaminaVentanaEmergente extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton boton1;
	JButton boton2;
	JButton boton3;
	JButton boton4;

	public LaminaVentanaEmergente() {
	
		boton1 = new JButton("boton 1");
		boton2 = new JButton("boton 2");
		boton3 = new JButton("boton 3");
		boton4 = new JButton("boton 4");
	
		boton1.addActionListener(new AccionBotones());
		boton2.addActionListener(new AccionBotones());
		boton3.addActionListener(new AccionBotones());
		boton4.addActionListener(new AccionBotones());
		
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
	}
	
	private class AccionBotones implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==boton1)
				JOptionPane.showMessageDialog(LaminaVentanaEmergente.this, "Has pulsado del botón 1", "Atención", 1);
			else if(e.getSource()== boton2)
				JOptionPane.showInputDialog(LaminaVentanaEmergente.this, "Has pulsado el botón 2","Responde", 3);
			else if(e.getSource()== boton3)
				JOptionPane.showConfirmDialog(LaminaVentanaEmergente.this, "Has pulsado el botón 3", "Confirma", 1);
			else
				JOptionPane.showOptionDialog(LaminaVentanaEmergente.this, "Has pulsado el botón 4", "Elige", 1, 1, null, null, null);
			
		}
		
	}
}
