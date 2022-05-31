package graficos3;

import javax.swing.JFrame;

public class MarcoConTexto extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoConTexto() {
		setVisible(true);
		setSize(600, 450);
		setLocation(400, 200);
		setTitle("Text Frame");
		Lamina myPanel = new Lamina();
		add(myPanel);
	}

}
