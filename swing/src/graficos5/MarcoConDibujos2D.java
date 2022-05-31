package graficos5;

import javax.swing.JFrame;

public class MarcoConDibujos2D extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoConDibujos2D() {
		setSize(400, 400);
		setLocation(100, 200);
		
		Lamina2D myPanel = new Lamina2D();
		add(myPanel);
	}
}
