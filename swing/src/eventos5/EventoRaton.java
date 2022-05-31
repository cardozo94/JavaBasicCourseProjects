package eventos5;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventoRaton implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Has hecho clic");
		//para ver las coordenadas donde se hizo clic
		System.out.println("Coordenada x: "+e.getX()+" Coordenada Y:"+e.getY());
		//para ver el núemro de clic seguidos que se hace
		System.out.println(e.getClickCount());
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Acabas de entrar");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Acabas de salir");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Acabas de presionar");
		//para saber que boton hizo clic
		if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK)
			System.out.println("Haz pulsado el boton izquierdo");
		else if(e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK)
			System.out.println("Haz pulsado la rueda");
		else if (e.getModifiersEx() ==  MouseEvent.BUTTON3_DOWN_MASK)
			System.out.println("Haz pulsado el boton derecho");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Acabas de levantar");
	}

}
