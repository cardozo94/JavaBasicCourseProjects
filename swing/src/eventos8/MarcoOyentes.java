package eventos8;

import javax.swing.JFrame;

public class MarcoOyentes extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoOyentes() {
		setVisible(true);
		setTitle("Prueba varios oyentes");
		setBounds(1300, 100, 300, 200);
		add(new LaminaPrincipal());
	}
}
