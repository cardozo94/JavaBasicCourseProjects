package graficos8;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class LaminaImagenes extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image imagen;
	
	public LaminaImagenes() {
		//carga imagen
				File imageFile = new File("resources/graphics/images.png");
				try {
					imagen = ImageIO.read(imageFile);
				} catch (IOException e) {
					System.out.println("La imagen no se encuentra");
				}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
 		//pone la imagen dentro del panel
		g.drawImage(imagen, 0, 0, null);
		int widthImage =imagen.getWidth(this);
		int heightImage = imagen.getHeight(this);
		//hace mosaico
		for (int i = 0; i < this.getParent().getWidth(); i+=widthImage) {
			for (int j = 0; j < this.getParent().getHeight(); j+=heightImage) {
				if(i+j>0) {
					g.copyArea(0, 0, widthImage, heightImage, i, j);
				}
			}
		}
	}

}
