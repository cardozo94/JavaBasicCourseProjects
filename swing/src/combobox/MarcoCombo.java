package combobox;

import javax.swing.JFrame;

public class MarcoCombo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoCombo() {
		setBounds(550, 300, 550, 400);
		LaminaCombo myPanel = new LaminaCombo();
		add(myPanel);
		setVisible(true);
	}
}
