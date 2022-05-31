package cliente;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import cliente.net.Mensajero;
import cliente.net.PaqueteEnvio;

public class EnvioOnline extends WindowAdapter {

	@Override
	public void windowOpened(WindowEvent arg0) {

		Mensajero mensajero = new Mensajero(7777);
		PaqueteEnvio datos = new PaqueteEnvio();
		datos.setMensaje("Online");
		mensajero.send(datos);
		mensajero.close();
		super.windowOpened(arg0);

	}

}
