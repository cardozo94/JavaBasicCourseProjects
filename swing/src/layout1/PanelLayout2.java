package layout1;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelLayout2 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelLayout2() {
		setLayout(new BorderLayout());
		add(new JButton("Rojo"), BorderLayout.WEST);
		add(new JButton("Verde"), BorderLayout.EAST);
		add(new JButton("Negro"), BorderLayout.CENTER);
	}
}
