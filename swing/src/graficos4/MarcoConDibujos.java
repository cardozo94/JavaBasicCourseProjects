package graficos4;

import javax.swing.JFrame;

public class MarcoConDibujos extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoConDibujos() {
		setTitle("Prueba con dibujo");
		setSize(400, 400);
		LaminaConFiguras myPanel = new LaminaConFiguras();
		add(myPanel);
	}

}
