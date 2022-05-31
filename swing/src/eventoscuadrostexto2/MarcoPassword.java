package eventoscuadrostexto2;

import javax.swing.JFrame;

public class MarcoPassword extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoPassword() {
		setBounds(400, 300, 550, 400);
		LaminaPassword myPanel = new LaminaPassword();
		add(myPanel);
		setVisible(true);
	}
}
