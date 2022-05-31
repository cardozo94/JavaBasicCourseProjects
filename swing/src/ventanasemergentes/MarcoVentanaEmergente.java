package ventanasemergentes;

import javax.swing.JFrame;

public class MarcoVentanaEmergente extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoVentanaEmergente() {
		setBounds(600, 300, 400, 350);
		setTitle("Prueba Ventana Emergente");
		add(new LaminaVentanaEmergente());
		setVisible(true);
	}

}
