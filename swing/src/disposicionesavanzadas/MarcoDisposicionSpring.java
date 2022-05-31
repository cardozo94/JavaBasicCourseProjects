package disposicionesavanzadas;

import javax.swing.JFrame;

public class MarcoDisposicionSpring extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoDisposicionSpring() {
		setBounds(600, 300, 200, 200);
		setTitle("Prueba Disposicion avanzada - Muelle (Spring)");
		LaminaMuelle myPanel = new LaminaMuelle();
		add(myPanel);
		setVisible(true);
	}

}
