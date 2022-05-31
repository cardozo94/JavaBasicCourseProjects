package jspinner;

import javax.swing.JFrame;

public class MarcoJSpinner extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoJSpinner() {
		
		setBounds(550, 350, 550, 350);
		add(new LaminaSpinner());
		setVisible(true);
	}
}
