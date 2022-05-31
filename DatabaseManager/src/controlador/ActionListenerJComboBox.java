package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import modelo.DBHandler;
import vista.VentanaPrincipal;

public class ActionListenerJComboBox implements ActionListener {

	private VentanaPrincipal ventana;
	private DBHandler db;

	public ActionListenerJComboBox(VentanaPrincipal ventana) {
		this.ventana = ventana;
		this.db = this.ventana.getDb();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		ventana.getDisplay().setText("");
		String nombreTabla = (String) ventana.getTablas().getSelectedItem();
		if (!nombreTabla.equals("Seleccione")) {
			ArrayList<String> columnas = db.getColumnNames(nombreTabla);
			appendData(columnas, false);
			ArrayList<String> rows = db.getRowsFromTable(nombreTabla, columnas);
			appendData(rows, true);
		}
	}

	public void appendData(ArrayList<String> rows, boolean enter) {
		for (String columna : rows) {
			ventana.getDisplay().append(columna + " ");
			if (enter) {
				ventana.getDisplay().append("\n");
			}
		}
		ventana.getDisplay().append("\n");
	}

}
