package eventos6;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LaminaFoco extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField cuadro1, cuadro2;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//para no tene ubicación por defecto
		setLayout(null);
		cuadro1 = new JTextField();
		cuadro2 = new JTextField();
		cuadro1.setBounds(120, 10, 150, 20);
		cuadro2.setBounds(120, 50, 150, 20);
		add(cuadro1);
		add(cuadro2);
		
		LanzaFocos foco = new LanzaFocos();
		cuadro1.addFocusListener(foco);
	}
	
	private class LanzaFocos implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			String email = cuadro1.getText();
			boolean comprobacion = false;
			for (int i = 0; i < email.length(); i++) {
				if(email.charAt(i)=='@')
					comprobacion= true;
			}
			if(comprobacion)
				System.out.println("Correcto!");
			else
				System.out.println("Incorrecto!");
		}

	}
}
