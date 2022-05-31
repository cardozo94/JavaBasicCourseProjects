package eventoscuadrostexto;

import javax.swing.JFrame;

public class MarcoEventosCT extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoEventosCT() {
		setBounds(500, 300, 500, 350);
		LaminaPrueba myPanel = new LaminaPrueba();
		add(myPanel);
		setTitle("Eventos cuadros texto");
		setVisible(true);
	}
}
