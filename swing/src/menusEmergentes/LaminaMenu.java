package menusEmergentes;

import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class LaminaMenu extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LaminaMenu() {
		JPopupMenu emergente = new JPopupMenu();
		
		JMenuItem opcion1 = new JMenuItem("Opcion1");
		JMenuItem opcion2 = new JMenuItem("Opcion2");
		JMenuItem opcion3 = new JMenuItem("Opcion3");
		//loq eu va a mostrar
		emergente.add(opcion1);
		emergente.add(opcion2);
		emergente.add(opcion3);
		// sobre que componete va funcionar
		setComponentPopupMenu(emergente);
	}
}
