package checkbox;

import javax.swing.JFrame;

public class MarcoCheckBox extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoCheckBox() {
		setBounds(550, 300, 550, 350);
		LaminaCheck myPanel = new LaminaCheck();
		add(myPanel);
		setVisible(true);
	}
}
