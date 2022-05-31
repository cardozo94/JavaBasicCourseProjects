package jars.recursos.r.e.c.u.r.s.o.s;

import javax.swing.JFrame;

public class MarcoRecursos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoRecursos() {
		setTitle("Preuba de Recursos");
		setBounds(300, 300, 300, 300);
		add(new LaminaRecursos());
		setVisible(true);
	}
}
