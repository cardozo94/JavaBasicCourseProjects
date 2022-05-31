package jslider;

import javax.swing.JFrame;

public class FrameJSlider extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FrameJSlider() {
		setBounds(550, 400, 550, 350);
		LaminaJSlider myPanel = new LaminaJSlider();
		add(myPanel);
		setVisible(true);
	}
}
