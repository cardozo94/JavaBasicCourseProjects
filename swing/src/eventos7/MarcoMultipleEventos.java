package eventos7;

import javax.swing.JFrame;

public class MarcoMultipleEventos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoMultipleEventos() {
		
		setTitle("Multiples fuentes de eventos");
		setBounds(100, 100, 600, 600);
		
		
		add(new PanelAction());
		setVisible(true);
	}
}
