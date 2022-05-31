package eventos2;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class M_Ventana implements WindowListener {

	@Override
	public void windowActivated(WindowEvent arg0) {
		System.out.println("Ventana activada");
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		System.out.println("Ventana cerrada");
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.out.println("Cerrando ventana");
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("Ventana desactivada");

	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("Ventana restaurada");
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		System.out.println("Ventana minimizada");
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		System.out.println("Ventana abierta");
	}

}
