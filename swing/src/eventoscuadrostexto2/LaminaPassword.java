package eventoscuadrostexto2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class LaminaPassword extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPasswordField password;
	public LaminaPassword() {
		setLayout(new BorderLayout());
		
		JPanel laminaSup = new JPanel();
		laminaSup.setLayout(new GridLayout(2, 2));
		
		add(laminaSup, BorderLayout.NORTH);
		
		JLabel etiqueta1 = new JLabel("User");
		JLabel etiqueta2 = new JLabel("Password");
		
		JTextField usuario = new JTextField(15);
		password = new JPasswordField(15);
		
		password.getDocument().addDocumentListener(new ValidatePassword());
		
		laminaSup.add(etiqueta1);
		laminaSup.add(usuario);
		laminaSup.add(etiqueta2);
		laminaSup.add(password);
		
		JButton send = new JButton("Send");
		add(send, BorderLayout.SOUTH);
	}
	
	private class ValidatePassword implements DocumentListener{

		@Override
		public void insertUpdate(DocumentEvent e) {

			char[] pass;
			pass = password.getPassword();
			if(pass.length<8||pass.length>12) 
				password.setBackground(Color.RED);
			else
				password.setBackground(Color.WHITE);
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			char[] pass;
			pass = password.getPassword();
			if(pass.length<8||pass.length>12) 
				password.setBackground(Color.RED);
			else
				password.setBackground(Color.WHITE);
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
		}
		
	}
}
