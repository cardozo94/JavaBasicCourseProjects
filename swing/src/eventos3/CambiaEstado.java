package eventos3;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class CambiaEstado implements WindowStateListener {

	@Override
	public void windowStateChanged(WindowEvent e) {
//		System.out.println("La ventana ha cambiado de estado");
		if(e.getNewState() == Frame.MAXIMIZED_BOTH)
			System.out.println("La ventana esta a pantalla completa");
		else if(e.getNewState() == Frame.ICONIFIED)
			System.out.println("La ventana esta minimizada");
		else if (e.getNewState() == Frame.NORMAL)
			System.out.println("LA ventana esta normal");
	}

}
