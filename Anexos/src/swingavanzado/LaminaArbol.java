package swingavanzado;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTree;

public class LaminaArbol extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public LaminaArbol(JTree arbol) {
		setLayout(new BorderLayout());
		add(arbol, BorderLayout.NORTH);
	}

}
