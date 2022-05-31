package menuConImagen;

import javax.swing.JFrame;

public class MarcoMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoMenu() {
		setBounds(500, 300, 550, 400);
		LaminaMenu myPanel = new LaminaMenu();
		add(myPanel);
		setVisible(true);
	}
}
