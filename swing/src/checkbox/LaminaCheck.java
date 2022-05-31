package checkbox;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LaminaCheck extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel texto;
	private JCheckBox check1, check2;
	
	public LaminaCheck() {
	
		setLayout(new BorderLayout());
		Font letra = new Font("Serif", Font.PLAIN, 24);
		texto = new JLabel("En un lugar de la Mancha de cuyo nombre ...");
		texto.setFont(letra);
		JPanel laminaTexto = new JPanel();
		laminaTexto.add(texto);
		add(laminaTexto, BorderLayout.CENTER);
		check1 = new JCheckBox("Negrita");
		check2 = new JCheckBox("Cursiva");
		
		check1.addActionListener(new ManejaChecks());
		check2.addActionListener(new ManejaChecks());
		
		JPanel laminachecks = new JPanel();
		laminachecks.add(check1);
		laminachecks.add(check2);
		
		add(laminachecks, BorderLayout.SOUTH);
	}
	
	private class ManejaChecks implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int tipo = 0;
			
			if(check1.isSelected())
				tipo+=Font.BOLD;
			
			if(check2.isSelected())
				tipo += Font.ITALIC;
			texto.setFont(new Font("Serif", tipo, 24));
				
			
		}
		
	}
}
