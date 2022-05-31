package eventos1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class LaminaBotones extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton botonAzul = new JButton("Azul");
	JButton botonAmarrillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	
	public LaminaBotones() {
		add(botonAzul);
		add(botonAmarrillo);
		add(botonRojo);
		ColorFondo amarillo = new ColorFondo(Color.YELLOW);
		ColorFondo azul = new ColorFondo(Color.BLUE);
		ColorFondo rojo = new ColorFondo(Color.RED);
		botonAzul.addActionListener(azul);
		botonRojo.addActionListener(rojo);
		botonAmarrillo.addActionListener(amarillo);
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		JButton botonPulsado;
//		if(e.getSource() instanceof JButton) {
//			botonPulsado = (JButton) e.getSource();
//			if(botonPulsado == botonAzul)
//				setBackground(Color.BLUE);
//			if(botonPulsado == botonAmarrillo)
//				setBackground(Color.YELLOW);
//			if(botonPulsado == botonRojo)
//				setBackground(Color.RED);
//		}		
//	}
	
	//ya no hay que validar con el if que botón fue oprimido
	private class ColorFondo implements ActionListener {
		
		private Color colorDeFondo;
		
		public ColorFondo(Color c) {
			colorDeFondo = c;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			setBackground(colorDeFondo);
		}

	}
}
