package vista;

import java.awt.Component;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VentanaSeleccion extends JFileChooser {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VentanaSeleccion() {
		super();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");

		setFileFilter(filter);
	}
	
	public String getNewFilePath(Component parent) {
		String path ="";
		int returnVal = showOpenDialog(parent);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			System.out.println("You chose to open this file" + getSelectedFile().getAbsolutePath());
			path = getSelectedFile().getAbsolutePath();
		}
		return path;
	}

}
