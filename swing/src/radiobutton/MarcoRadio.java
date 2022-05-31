package radiobutton;

import javax.swing.JFrame;

public class MarcoRadio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoRadio() {
		setVisible(true);
		setBounds(550, 300, 500, 300);
		LaminaRadio myPanel = new LaminaRadio();
		add(myPanel);
	}
}
