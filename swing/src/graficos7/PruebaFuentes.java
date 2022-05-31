package graficos7;

import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

public class PruebaFuentes {

	public static void main(String[] args) {
		MarcoFuente myFrame = new MarcoFuente();
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		para ver que fuentes hay instaladas en el SO
		String[] fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for (String string : fuentes) {
			System.out.println("nombre fuente: "+string);
		}
	}

}
