package eventos5;

import javax.swing.JFrame;

public class MarcoRaton extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoRaton() {
		setVisible(true);
		setTitle("Eventos de ratón");
		setBounds(200, 200, 350, 350 );
		EventoRaton mouse = new EventoRaton();
		addMouseListener(mouse);
		MovimientoRaton moveMouse = new MovimientoRaton();
		addMouseMotionListener(moveMouse);
	}
}
