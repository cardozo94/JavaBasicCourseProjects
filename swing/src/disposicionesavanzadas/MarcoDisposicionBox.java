package disposicionesavanzadas;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MarcoDisposicionBox extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoDisposicionBox() {
		setBounds(600, 300, 200, 200);
		setTitle("Prueba Disposicion avanzada - Caja (Box)");
		
		JLabel rotulo1 = new JLabel("Nombre");
		JLabel rotulo2 = new JLabel("Contraseña");
		
		JTextField texto1 = new JTextField(10);
		JTextField texto2 = new JTextField(10);
		
		texto1.setMaximumSize(texto1.getPreferredSize());
		texto2.setMaximumSize(texto2.getPreferredSize());
		
		Box cajaH1 = Box.createHorizontalBox();
		Box cajaH2 = Box.createHorizontalBox();
		Box cajaH3 = Box.createHorizontalBox();
		
		cajaH1.add(rotulo1);
		cajaH1.add(Box.createHorizontalStrut(10));//espacio de 10 pixeles
		cajaH1.add(texto1);
		
		cajaH2.add(rotulo2);
		cajaH2.add(Box.createHorizontalStrut(10));//espacio de 10 pixeles
		cajaH2.add(texto2);		
		
		JButton boton1 = new JButton("Ok");
		JButton boton2 = new JButton("Cancelar");
		
		cajaH3.add(boton1);
		cajaH3.add(Box.createGlue());//separación relacionada entre los componentes de la caja relativa
		cajaH3.add(boton2);
		
		Box cajaVertical = Box.createVerticalBox();
		
		cajaVertical.add(cajaH1);
		cajaVertical.add(cajaH2);
		cajaVertical.add(cajaH3);
				
		add(cajaVertical, BorderLayout.CENTER);
		
		setVisible(true);
	}

}
