package controlador;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.JComboBox;

import modelo.InitialDBLoader;
import vista.LaminaPrincipal;

public class InitialLoader extends WindowAdapter{
	
	private LaminaPrincipal lamina;
	
	public InitialLoader(LaminaPrincipal lamina) {
		this.lamina = lamina;
	}

	@Override
	public void windowOpened(WindowEvent e) {
		loadCombox(getListSecciones(), lamina.getSeccion());
		loadCombox(getListPais(), lamina.getPais());
	}
	

	public void loadCombox(List<String> items, JComboBox<String> comboBox) {
		for (String item : items) {
			comboBox.addItem(item);
		}
	}
	
	public List<String> getListSecciones() {
		return getListColumn("seccion");
	}

	public List<String> getListPais() {
		return getListColumn("pais_origen");
	}
	
	public List<String> getListColumn(String column) {
		InitialDBLoader dbLoader = new InitialDBLoader();
		List<String> columnValues = dbLoader.getStringColumnValues(column);
		dbLoader.close();
		return columnValues;
	}
}
