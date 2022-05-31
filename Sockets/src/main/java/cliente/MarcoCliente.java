package cliente;

import javax.swing.JFrame;

public class MarcoCliente extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoCliente() {
		
		setBounds(600, 300, 280, 350);
		LaminaMarcoCliente panel = new LaminaMarcoCliente();
		add(panel);
		setVisible(true);
		addWindowListener(new EnvioOnline());
		
	}

}
