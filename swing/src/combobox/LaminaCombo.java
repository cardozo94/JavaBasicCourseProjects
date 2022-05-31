package combobox;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LaminaCombo extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel texto;
	private JComboBox<String> combo;
	
	public LaminaCombo() {
		setLayout(new BorderLayout());
		texto = new JLabel("En un lugar de la Macha de cuyo nombre...");
		texto.setFont(new Font("Serif", Font.PLAIN, 18));
		add(texto, BorderLayout.CENTER);
		
		JPanel laminaNorte = new JPanel();
		combo = new JComboBox<String>();
		combo.setEditable(true);
		
		combo.addItem("Serif");
		combo.addItem("SanSerif");
		combo.addItem("Monospaced");
		combo.addItem("Dialog");
		
		laminaNorte.add(combo);
		add(laminaNorte, BorderLayout.NORTH);
		
		combo.addActionListener(new EventoCombo());
	}
	
	private class EventoCombo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			texto.setFont(new Font((String)combo.getSelectedItem(), Font.PLAIN, 18));
			
		}
		
	}
}
