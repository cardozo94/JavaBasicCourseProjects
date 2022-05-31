package radiobutton;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class LaminaRadio extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LaminaRadio() {
		
		ButtonGroup grupo1 = new ButtonGroup();
		ButtonGroup grupo2 = new ButtonGroup();
		
		JRadioButton boton1 = new JRadioButton("Azul", false);
		JRadioButton boton2 = new JRadioButton("Rojo", true);
		JRadioButton boton3 = new JRadioButton("Verde", false);
		
		JRadioButton boton4 = new JRadioButton("Masculino", false);
		JRadioButton boton5 = new JRadioButton("Femenino", false);
		
		grupo1.add(boton1);
		grupo1.add(boton2);
		grupo1.add(boton3);
		
		grupo2.add(boton4);
		grupo2.add(boton5);
		
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
		add(boton5);
	}
}
