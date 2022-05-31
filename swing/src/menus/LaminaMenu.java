package menus;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class LaminaMenu extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LaminaMenu() {
		
		JMenuBar barraMenu = new JMenuBar();
		
		JMenu archivo = new JMenu("Archivo");
		JMenu edicion = new JMenu("Edici�n");
		JMenu herramientas = new JMenu("herramientas");
		
		JMenu opciones = new JMenu("Opciones");
		
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem guardarComo = new JMenuItem("Guardar Como");
		
		JMenuItem cortar = new JMenuItem("Cortar");
		JMenuItem copiar = new JMenuItem("Copiar");
		JMenuItem pegar = new JMenuItem("Pegar");
		
		JMenuItem generales = new JMenuItem("Generales");
		
		JMenuItem opcion1 = new JMenuItem("Opci�n 1");
		JMenuItem opcion2 = new JMenuItem("Opci�n 2");
		
		opciones.add(opcion1);
		opciones.add(opcion2);
				
		archivo.add(guardar);
		archivo.add(guardarComo);
		
		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);
		edicion.addSeparator();
		edicion.add(opciones);
		
		herramientas.add(generales);
		
		barraMenu.add(archivo);
		barraMenu.add(edicion);
		barraMenu.add(herramientas);
		
		add(barraMenu);
	}
}
