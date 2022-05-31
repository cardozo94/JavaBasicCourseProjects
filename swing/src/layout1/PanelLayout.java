package layout1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelLayout extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelLayout() {
		//para definir la posición por zonas de cada componente
//		setLayout(new BorderLayout());
		//para indicar expación de forma vertical y horizontal
//		setLayout(new BorderLayout(10,10));
		//se idica en que zona estara el componente
//		add(new JButton("Amarillo"),BorderLayout.NORTH);
//		add(new JButton("Azul"), BorderLayout.SOUTH);
//		add(new JButton("Rojo"), BorderLayout.WEST);
//		add(new JButton("Verde"), BorderLayout.EAST);
//		//si no se especifica el intenta llenar con el componente las zonas qeu falten
//		add(new JButton("Negro"));
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JButton("Amarillo"));
		add(new JButton("Azul"));
	}
}
