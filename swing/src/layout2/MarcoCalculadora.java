package layout2;

import javax.swing.JFrame;

public class MarcoCalculadora extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoCalculadora() {
		setTitle("Calculadora");
		setBounds(500, 300, 450, 300);
		
		LaminaPrincipal myPanel = new LaminaPrincipal();
		add(myPanel);
		setVisible(true);
		//Frame se adapate al tammaño que los componentes que contiene
//		pack();
	}
}
