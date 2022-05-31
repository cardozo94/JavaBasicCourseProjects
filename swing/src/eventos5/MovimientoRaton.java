package eventos5;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MovimientoRaton implements MouseMotionListener {

	@Override
	public void mouseDragged(MouseEvent arg0) {
		System.out.println("Estas arrastrando");
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		System.out.println("Estas moviendo libre");
	}

}
