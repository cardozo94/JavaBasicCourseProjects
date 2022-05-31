package jars.calculadora;

import javax.swing.JApplet;

public class Calculadora extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init() {
		
		LaminaPrincipal myPanel = new LaminaPrincipal();
		add(myPanel);
	}

}
