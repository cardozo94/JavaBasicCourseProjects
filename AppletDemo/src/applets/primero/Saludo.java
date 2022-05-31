package applets.primero;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Saludo extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init() {
		
		JLabel rotulo = new JLabel("Hola mundo", SwingConstants.CENTER);
		
		add(rotulo);
	}
}
