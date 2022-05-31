package graficos1;

import javax.swing.JFrame;

public class MiMarco extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MiMarco() {
		// depende de la resolucón del monitor, con toolkit se adapta a la resolución del monitor
//		setSize(500, 300);
		//definir la ubicación de la ventana, el punto 0,0 esta en la esquina izquierda superior
//		setLocation(500, 300);
		//perimite definir la ubicación y el tamaño de la ventana
		setBounds(500, 300, 550, 250);
		//para establecer si se puede modificar el tamaño de la ventana por el usuario, en este caso no
//		setResizable(false);
		//para abrir la ventana a pantalla completa por defecto
//		setExtendedState(JFrame.MAXIMIZED_BOTH);
		// para poner titutlo a la ventna
		setTitle("My First window");
	}
}
