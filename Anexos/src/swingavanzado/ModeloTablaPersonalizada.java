package swingavanzado;

import javax.swing.table.AbstractTableModel;

public class ModeloTablaPersonalizada extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public int getRowCount() {
		
		return 3;
	}

	@Override
	public int getColumnCount() {
		
		return 5;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		int z = rowIndex+1;
		int y = columnIndex+2;
		return " "+z+" "+y;
	}
	
	public String getColumnName(int column) {
		return "Columna "+column;
	}

}
