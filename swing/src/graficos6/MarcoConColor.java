package graficos6;

import java.awt.SystemColor;

import javax.swing.JFrame;

public class MarcoConColor extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoConColor() {
		setTitle("Prueba con colores");
		setBounds(300, 200, 500, 500);
		LaminaColores myPanel = new LaminaColores();
		add(myPanel);
		//para darle color de fondo a al lamina
//		myPanel.setBackground(Color.CYAN);
		//deja el fondo por defecto según el sistema operativo
		myPanel.setBackground(SystemColor.window);
	}
}
