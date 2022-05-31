package ejercicioPractico;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class LaminaBotones extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ButtonGroup grupo;
	
	public LaminaBotones(String titulo, String... opciones) {
		setBorder(BorderFactory.createTitledBorder(titulo));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		grupo = new ButtonGroup();
		for(int i =0; i< opciones.length;i++) {
			JRadioButton radio = new JRadioButton(opciones[i]);
			radio.setActionCommand(opciones[i]);
			add(radio);
			grupo.add(radio);
			radio.setSelected(i==0);
		}
	}
	
	public String getSelection() {
		return grupo.getSelection().getActionCommand();
	}
}
