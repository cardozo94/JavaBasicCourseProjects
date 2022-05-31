package eventos2;

import javax.swing.JFrame;

public class MarcoEventosVentana extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoEventosVentana() {
		setVisible(true);
		setBounds(200, 200, 600, 600);
		setTitle("Eventos de ventana");
		//M_Ventana oyenteVentana = new M_Ventana();
		addWindowListener(new MVentana());//usando la clase qeu esxtiende de la clase adaptadora
		
	}
}
