package graficos3;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Lamina extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		//que haga el trabajo original, en este momento no se notara la diferencia
		super.paintComponent(g);
		//y ademas lo que se desea agregar
		g.drawString("Estamos aprendiendo swing", 425, 408);
	}
}
