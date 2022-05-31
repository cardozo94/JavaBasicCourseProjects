package eventos7;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class PanelAction extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelAction() {

		AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("resources/graphics/yellow.gif"),
				Color.YELLOW);
		AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("resources/graphics/blue.gif"), Color.BLUE);
		AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("resources/graphics/red.gif"), Color.RED);

		add(new JButton(accionAmarillo));
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));
		// para hace mapa de entrada de las acciones en el teclado, cuando el foco esta
		// en la ventana y el objeto qeu recibe la accion esta en la ventana
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		//crear combinación de letras
		KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");
		KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl B");
		KeyStroke teclaRojo = KeyStroke.getKeyStroke("ctrl R");
		
		mapaEntrada.put(teclaAmarillo, "fondoAmarillo");
		mapaEntrada.put(teclaAzul, "fondoAzul");
		mapaEntrada.put(teclaRojo, "fondoRojo");
		
		//relacionar acción con la entrada
		ActionMap mapaAccion = getActionMap();
		mapaAccion.put("fondoAmarillo", accionAmarillo);
		mapaAccion.put("fondoAzul", accionAzul);
		mapaAccion.put("fondoRojo", accionRojo);
		

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
			setBackground(c);
			System.out.println("Nombre boton: " + getValue(NAME) + " Descripción: " + getValue(SHORT_DESCRIPTION));
		}
	}
}
