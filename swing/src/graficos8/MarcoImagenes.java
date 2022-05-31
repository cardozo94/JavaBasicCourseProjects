package graficos8;

import javax.swing.JFrame;

public class MarcoImagenes extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoImagenes() {
		setSize(700, 500);
		setLocation(750, 300);
		setTitle("Prueba de imagenes");
		LaminaImagenes myPanel = new LaminaImagenes();
		add(myPanel);
		
	}

}
