package eventos2;

import javax.swing.JFrame;

public class PruebaEventosVentana {

	public static void main(String[] args) {
		MarcoEventosVentana myFrame = new MarcoEventosVentana();
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MarcoEventosVentana myFrame2 = new MarcoEventosVentana();
		myFrame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		myFrame.setTitle("Ventana 1");
		myFrame2.setTitle("ventana 2");
		
		myFrame.setBounds(300, 300, 500, 350);
		myFrame2.setBounds(900, 300, 500, 350);
	}

}
