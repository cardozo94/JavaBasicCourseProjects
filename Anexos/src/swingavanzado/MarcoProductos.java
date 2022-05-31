package swingavanzado;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MarcoProductos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox<String> nombreTablas;

	public MarcoProductos() {
		setTitle("Productos");
		setBounds(500, 300, 800, 400);

		JPanel superior = new JPanel();
		nombreTablas = new JComboBox<String>();
		DBHandler db = new DBHandler();
		try {
			db.getTableNames().stream().forEach(table -> nombreTablas.addItem(table));
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		nombreTablas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String nombreTabla = (String) nombreTablas.getSelectedItem();
				ResultSetModeloTabla modelo = db.getDataTable(nombreTabla);
				JTable tabla = new JTable(modelo);
				add(new JScrollPane(tabla), BorderLayout.CENTER);
				validate();
			}
		});
		superior.add(nombreTablas);
		add(superior, BorderLayout.NORTH);

	}

}
