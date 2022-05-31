package cuadrostexto;

import javax.swing.JFrame;

public class MarcoTexto extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoTexto() {
		setBounds(600, 300, 600, 350);
		setTitle("Prueba cuadros de texto");
		LaminaTexto myPanel = new LaminaTexto();
		add(myPanel);
		setVisible(true);
	}

}
