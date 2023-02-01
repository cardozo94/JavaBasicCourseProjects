package beans;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Esta clase pretende construir un bean para incluir imagenes
 * 
 * @author Cristian Cardozo
 *
 */
public class VisorDeImagenesBean extends JLabel {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 1L;
	private File archivo = null;

	public VisorDeImagenesBean() {
		setBorder(BorderFactory.createEtchedBorder());
	}

	/**
	 * Método clave para escoger una imagen
	 * 
	 * @param elegirImagen. Este parámetro permitirá escoger una imagen
	 */
	public void setEscogeImagen(String elegirImagen) {
		try {
			archivo = new File(elegirImagen);
			setIcon(new ImageIcon(ImageIO.read(archivo)));
		} catch (IOException e) {
			archivo = null;
			setIcon(null);
		}
	}

	/**
	 * 
	 * @return Devuelve la ruta de la imagen escogida con el método setEscogeImagen
	 */
	public String getEscogeImagen() {
		if (archivo == null) {
			return null;
		} else {
			return archivo.getPath();
		}
	}

	public Dimension getPreferredSize() {
		return new Dimension(600, 400);
	}
}
