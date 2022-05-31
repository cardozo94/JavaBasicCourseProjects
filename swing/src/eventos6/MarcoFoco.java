package eventos6;

import javax.swing.JFrame;

public class MarcoFoco extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoFoco() {
		setVisible(true);
		setTitle("Eventos de foco");
		setBounds(300, 300, 600, 450);
		add(new LaminaFoco());
	}

}
