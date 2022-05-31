package areatexto1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class LaminaArea extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea area;
	
	public LaminaArea() {
		area = new JTextArea(8, 20);
		//para que tenga barra vertical el area y no cambie de tamaño
		JScrollPane laminaBarras = new JScrollPane(area);
		// para indicar si pemite los saltos de linea, con esto no se amplia a lo
		// hoirizontal si no qeu sigue en la linea inferior
		area.setLineWrap(true);
		add(laminaBarras);
		
		JButton boton = new JButton("Dale");
		boton.addActionListener(new GestionaArea());
		
		add(boton);
	}
	
	private class GestionaArea implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(area.getText());			
		}
		
	}
}
