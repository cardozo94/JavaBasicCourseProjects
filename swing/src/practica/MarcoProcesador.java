package practica;

import javax.swing.JFrame;

public class MarcoProcesador extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoProcesador() {
		setBounds(500, 300, 550, 420);
		LaminaProcesador myPanel = new LaminaProcesador();
		add(myPanel);
		setVisible(true);
	}
}
