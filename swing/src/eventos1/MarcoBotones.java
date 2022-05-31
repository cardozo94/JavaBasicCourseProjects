package eventos1;

import javax.swing.JFrame;

public class MarcoBotones extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoBotones() {
		setTitle("Botones y Eventos");
		setBounds(700, 300, 500, 300);
		LaminaBotones myPanel = new LaminaBotones();
		add(myPanel);
	}

}
