package graficos4;

import java.awt.Graphics;

import javax.swing.JPanel;

public class LaminaConFiguras extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//Graphics birnda los métodos para dibujar diversas figuras
		g.drawRect(50, 50, 200, 200);
		
		g.drawLine(250, 250, 300, 300);
		g.drawArc(174, 50, 148, 1701, 45, 45);
		g.drawLine(50, 250, 300, 300);
	}

}
