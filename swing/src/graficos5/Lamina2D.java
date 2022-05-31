package graficos5;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Lamina2D extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		g2d.draw(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2d.draw(elipse);
		
		g2d.draw(new Line2D.Double(100,100,300,250));
		
		double centrox =rectangulo.getCenterX();
		double centroy = rectangulo.getCenterY();
		double radio = Math.sqrt((Math.pow(100, 2)+Math.pow(75, 2)));
		
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(centrox, centroy, centrox+radio, centroy+radio);
		g2d.draw(circulo);
		
	}

}
