package eventos4;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventoTeclado implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		int codigo = e.getKeyCode();
		System.out.println(codigo);

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println(e.getKeyChar());

	}

}
