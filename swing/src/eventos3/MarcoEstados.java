package eventos3;

import javax.swing.JFrame;

public class MarcoEstados extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoEstados() {
		setVisible(true);
		setTitle("Estados de ventana");
		setBounds(200, 200, 350, 350);
		CambiaEstado estado = new CambiaEstado();
		addWindowStateListener(estado);
	}
}
