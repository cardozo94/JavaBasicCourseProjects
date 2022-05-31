package swingavanzado;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class MarcoTablaPersonalizado extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	public MarcoTablaPersonalizado() {
		setTitle("Tabla Personalizada");
		setBounds(300, 300, 400, 200);
		TableModel modelo = new ModeloTablaPersonalizada();
		JTable tabla = new JTable(modelo);
		add(new JScrollPane(tabla));
	}

}
