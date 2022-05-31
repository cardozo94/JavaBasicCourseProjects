package eventoscuadrostexto;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public class LaminaPrueba extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField campo;
	private JLabel label1;
	private JLabel label2;
	
	public LaminaPrueba() {
		setLayout(new BorderLayout());
		campo = new JTextField(20);
		Document doc = campo.getDocument();
		doc.addDocumentListener(new EscuchaTexto());
		add(campo, BorderLayout.NORTH);
		label1 = new JLabel("", JLabel.CENTER);
		label2 = new JLabel("", JLabel.CENTER);
		add(label1, BorderLayout.CENTER);
		add(label2, BorderLayout.SOUTH);
		
	}
	private class EscuchaTexto implements DocumentListener{

		@Override
		public void insertUpdate(DocumentEvent e) {
			label1.setText(campo.getText());
			try {
				label2.setText(e.getDocument().getText(0, e.getDocument().getLength()));
			} catch (BadLocationException e1) {
				e1.printStackTrace();
			}
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			label1.setText(campo.getText());
			try {
				label2.setText(e.getDocument().getText(0, e.getDocument().getLength()));
			} catch (BadLocationException e1) {
				e1.printStackTrace();
			}
			
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			
		}
		
	}
}
