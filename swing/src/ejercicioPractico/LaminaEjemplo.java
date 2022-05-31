package ejercicioPractico;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class LaminaEjemplo extends JPanel {
	
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(0, 0, getWidth(), getHeight());
		g2.setPaint(Color.YELLOW);
		g2.fill(rectangulo);
	}
}
