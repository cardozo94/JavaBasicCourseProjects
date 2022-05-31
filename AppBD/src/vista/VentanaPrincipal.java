package vista;

import javax.swing.JFrame;

import controlador.InitialLoader;

public class VentanaPrincipal extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VentanaPrincipal() {
		setBounds(200, 200, 400, 450);
		setTitle("Consulta BBDD");
		LaminaPrincipal lamina = new LaminaPrincipal();
		add(lamina);
		addWindowListener(new InitialLoader(lamina));
		
		setVisible(true);
	}

}
