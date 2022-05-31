package radiobutton2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class LaminaRadio extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel texto;
	private JRadioButton boton1, boton2, boton3, boton4;
	
	public LaminaRadio() {
		setLayout(new BorderLayout());
		texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");
		add(texto, BorderLayout.CENTER);
		
		ButtonGroup grupo = new ButtonGroup();
		boton1 = new JRadioButton("Pequeño", false);
		boton2 = new JRadioButton("Mediano", true);
		boton3 = new JRadioButton("Grande", false);
		boton4 = new JRadioButton("Muy grande", false);
		
		JPanel laminaRadio = new JPanel();
		
		RadioEventos evento = new RadioEventos();
		boton1.addActionListener(evento);
		boton2.addActionListener(evento);
		boton3.addActionListener(evento);
		boton4.addActionListener(evento);
		
		grupo.add(boton1);
		grupo.add(boton2);
		grupo.add(boton3);
		grupo.add(boton4);
		
		laminaRadio.add(boton1);
		laminaRadio.add(boton2);
		laminaRadio.add(boton3);
		laminaRadio.add(boton4);
		
		add(laminaRadio, BorderLayout.SOUTH);
	}
	
	private class RadioEventos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()== boton1)
				texto.setFont(new Font("Serif", Font.PLAIN, 10));
			else if (e.getSource() == boton2)
				texto.setFont(new Font("Serif", Font.PLAIN, 12));
			else if (e.getSource() == boton3)
				texto.setFont(new Font("Serif", Font.PLAIN, 18));
			else if (e.getSource() == boton4)
				texto.setFont(new Font("Serif", Font.PLAIN, 24));
		}
		
	}
}
