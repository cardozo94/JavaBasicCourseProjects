package cuadrostexto;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LaminaTexto extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField campo1;
	private JLabel resultado;
	
	public LaminaTexto() {
		setLayout(new BorderLayout());
		JPanel myPanel2 = new JPanel();
		//para centrarel texto del label
		resultado = new JLabel("",JLabel.CENTER);
		JLabel texto = new JLabel("Email: ");
		myPanel2.add(texto);
		campo1 = new JTextField(20);
		myPanel2.add(campo1);
		myPanel2.add(resultado, BorderLayout.CENTER);
		JButton miBoton = new JButton("Comprobar");
		
		DameTexto evento = new DameTexto();
		miBoton.addActionListener(evento);
		myPanel2.add(miBoton);
		add(myPanel2, BorderLayout.NORTH);
		add(resultado, BorderLayout.CENTER);
		
	}
	
	private class DameTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int correcto = 0;
			String email = campo1.getText().trim();
			
			for (int i = 0; i < email.length(); i++) {
				if(email.charAt(i)=='@')
					correcto++;
			}
			
			if(correcto == 1)
				resultado.setText("Email es correcto");
			else
				resultado.setText("Email invalido");
			
			System.out.println(campo1.getText().trim());			
		}
		
	}

}
