package swingavanzado;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.table.AbstractTableModel;

public class ResultSetModeloTabla extends AbstractTableModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ResultSet rs;
	private ResultSetMetaData rsmeta;
	
	public ResultSetModeloTabla(ResultSet rs) {
		this.rs = rs;
		try {
			this.rsmeta = rs.getMetaData();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int getRowCount() {	

		try {
			rs.last();
			return rs.getRow();
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int getColumnCount() {

		try {
			return rsmeta.getColumnCount();
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		try {
			rs.absolute(rowIndex+1);
			return rs.getObject(columnIndex+1);
		}catch (Exception e) {
			System.out.println("row " +rowIndex+" column "+columnIndex);
			e.printStackTrace();
			return null;
		}
	}
	
	public String getColumnName(int column) {
		try {
			return rsmeta.getColumnName(column+1);
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
