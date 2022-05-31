package controlador;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.JComboBox;

import vista.VentanaPrincipal;

public class InitialLoader extends WindowAdapter {

	private VentanaPrincipal ventana;

	public InitialLoader(VentanaPrincipal ventana) {
		this.ventana = ventana;
	}

	@Override
	public void windowOpened(WindowEvent e) {
		loadCombox(getTables(), ventana.getTablas());
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		ventana.getDb().close();
		super.windowClosing(arg0);
	}

	public void loadCombox(List<String> items, JComboBox<String> comboBox) {
		for (String item : items) {
			comboBox.addItem(item);
		}
	}

	public List<String> getTables() {
		List<String> tables = ventana.getDb().loadTables();
		return tables;
	}
}
