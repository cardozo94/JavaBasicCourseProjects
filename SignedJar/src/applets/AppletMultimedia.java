package applets;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JApplet;

public class AppletMultimedia extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image logo;
	
	public void init() {
		logo = getImage(getDocumentBase(), "pildoras.jpg");
		
	}
	
	public void paint(Graphics g) {
		g.drawImage(logo, 50, 50, this);
	}
}
