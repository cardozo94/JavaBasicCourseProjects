package graficos6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class LaminaColores extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		//para pintar las figuras, selecciona el color a utilizar
		g2d.setPaint(Color.RED);
		//solo hace el borde
		g2d.draw(rectangulo);
		g2d.setPaint(Color.BLUE);
		g2d.fill(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		//para formar el color RGB
		g2d.setPaint(new Color(94, 94, 94));
		//para darle brillo
//		g2d.setPaint(new Color(94, 94, 94).brighter().brighter());
		//para darle oscuridad
//		g2d.setPaint(new Color(94, 94, 94).darker().darker());
//		g2d.draw(elipse);
		g2d.fill(elipse);
		
	}
}
