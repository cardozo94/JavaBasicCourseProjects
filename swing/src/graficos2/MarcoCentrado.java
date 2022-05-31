package graficos2;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MarcoCentrado extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoCentrado() {
		Toolkit myScreen = Toolkit.getDefaultToolkit();
		//para conocer el tamaño de la ventana
		Dimension size = myScreen.getScreenSize();
		int widthScreen = size.width;
		int heightScreen = size.height;
		//ventana de la mitad de la pantalla
		setSize(widthScreen/2, heightScreen/2);
		//ventana en el centro de la pantalla
		setLocation(widthScreen/4, heightScreen/4);
		setTitle("Center Frame");
		//establecer imagen de incono en la esquina superior izquierda de la ventana, se carga al imagen
		Image myIcon = myScreen.getImage("resources/graphics/images.png");
		//coloca la imagen
		setIconImage(myIcon);
		
	}

}
