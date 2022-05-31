package graficos7;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class LaminaFuentes extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		
		//define la fuente
		Font myFont = new Font("Arial", Font.BOLD, 26);
		//la configura en la lamina
		g2d.setFont(myFont);
//		g2d.setColor(Color.BLUE);
		//al excribirla la hace con la configuración previa
		g2d.drawString("Camilo", 100, 100);
	}

}
