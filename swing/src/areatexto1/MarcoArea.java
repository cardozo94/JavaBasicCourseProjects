package areatexto1;

import javax.swing.JFrame;

public class MarcoArea extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoArea() {
		setBounds(500, 300, 500, 350);
		LaminaArea myPanel = new LaminaArea();
		add(myPanel);
		setVisible(true);
	}
}
