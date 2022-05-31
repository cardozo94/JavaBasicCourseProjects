package graficos7;

import java.awt.Color;

import javax.swing.JFrame;

public class MarcoFuente extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoFuente() {
		setBounds(200,200, 500,500);
		setTitle("Prueba Fuentes");
		LaminaFuentes myPanel = new LaminaFuentes();
		add(myPanel);
		//define el color de todo lo que se dibuje en la lamina
		myPanel.setForeground(Color.BLUE);
	}

}
