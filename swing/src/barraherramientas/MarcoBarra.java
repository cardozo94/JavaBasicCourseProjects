package barraherramientas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class MarcoBarra extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel lamina;
	
	public MarcoBarra() {
		
		setTitle("Multiples fuentes de eventos");
		setBounds(100, 100, 600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		lamina = new JPanel();
		add(lamina);
		
		AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("resources/graphics/yellow.gif"),
				Color.YELLOW);
		AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("resources/graphics/blue.gif"), Color.BLUE);
		AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("resources/graphics/red.gif"), Color.RED);
		
		Action accionSalir = new AbstractAction("Salir", new ImageIcon("resources/graphics/close.gif")) {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		};

		JMenu menu = new JMenu("Color");
		
		menu.add(accionAzul);
		menu.add(accionAmarillo);
		menu.add(accionRojo);
		
		JMenuBar barraMenu = new JMenuBar();
		
		barraMenu.add(menu);
		
		setJMenuBar(barraMenu);
		
		JToolBar barraHerramienta = new JToolBar();
		barraHerramienta.add(accionRojo);
		barraHerramienta.add(accionAzul);
		barraHerramienta.add(accionAmarillo);
		barraHerramienta.addSeparator();
		barraHerramienta.add(accionSalir);
		
		add(barraHerramienta, BorderLayout.NORTH);
	}
	
	private class AccionColor extends AbstractAction {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public AccionColor(String nombre, Icon icon, Color colorBoton) {
			putValue(NAME, nombre);
			putValue(SMALL_ICON, icon);
			putValue(SHORT_DESCRIPTION, "Poner la lámina de color " + nombre);
			putValue("ColorDeFondo", colorBoton);
		}

		@Override
		public void actionPerformed(ActionEvent e) {

			Color c = (Color) getValue("ColorDeFondo");
			lamina.setBackground(c);
			System.out.println("Nombre boton: " + getValue(NAME) + " Descripción: " + getValue(SHORT_DESCRIPTION));
		}
	}
}
