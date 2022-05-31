package eventos2;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//usa clase adpatadora para solo sobresescribir los metodos que se requieran
public class MVentana extends WindowAdapter{


	@Override
	public void windowIconified(WindowEvent arg0) {
		System.out.println("Ventana minimizada");
	}
}
