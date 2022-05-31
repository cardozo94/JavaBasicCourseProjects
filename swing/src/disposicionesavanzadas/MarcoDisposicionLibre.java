package disposicionesavanzadas;

import javax.swing.JFrame;

public class MarcoDisposicionLibre extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoDisposicionLibre() {
		setBounds(600, 300, 600, 400);
		setTitle("Prueba Disposicion avanzada - Libre");
		LaminaLibre myPanel = new LaminaLibre();
		add(myPanel);
		setVisible(true);
	}

}
