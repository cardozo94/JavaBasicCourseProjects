package eventos8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MarcoEmergente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int contador = 0;

	public MarcoEmergente(JButton cerrar) {
		contador++;
		setTitle("Ventana " + contador);
		setBounds(40*contador, 40*contador, 300, 150);
		
		CierraTodos close = new CierraTodos();
		cerrar.addActionListener(close);
	}
	
	private class CierraTodos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//cerrar todos los objetos 
			dispose();
			contador = 0;
		}
		
	}
}
