package applets.parametros;

import javax.swing.JApplet;

public class GraficoApplet extends JApplet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init() {
//		int barra1 = Integer.parseInt(getParameter("barra.1"));
//		int barra2 = Integer.parseInt(getParameter("barra.2"));
//		int barra3 = Integer.parseInt(getParameter("barra.3"));
//		LaminaGrafico panel = new LaminaGrafico(barra1, barra2, barra3);
		int cantidad = Integer.parseInt(getParameter("graficos"));
		int[] infoBarra = new int[cantidad];
		for (int i = 0; i < infoBarra.length; i++) {
			infoBarra[i] = Integer.parseInt(getParameter("barra."+(i+1)));
		}
		LaminaGrafico panel = new LaminaGrafico(infoBarra);
		add(panel);
	}

}
