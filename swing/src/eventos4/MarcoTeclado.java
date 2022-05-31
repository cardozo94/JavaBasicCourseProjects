package eventos4;

import javax.swing.JFrame;

public class MarcoTeclado extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoTeclado() {
		setVisible(true);
		setTitle("Eventos de Teclado");
		setBounds(200, 200, 350, 350);
		
		EventoTeclado tecla = new EventoTeclado();
		addKeyListener(tecla);
	}
}
