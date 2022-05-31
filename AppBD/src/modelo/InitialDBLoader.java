package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class InitialDBLoader {

	private ConexionDB conn;
	private Statement stmt;

	public InitialDBLoader() {
		try {
			conn = new ConexionDB();
			stmt = conn.getConnection().createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<String> getStringColumnValues(String column) {
		String consulta = String.format(Queries.SELECT_A_COLUMN_PRODUCTS, column);
		List<String> rows = new ArrayList<String>();
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(consulta);
			while (rs.next()) {
				rows.add(rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return rows;
	}
	
	public void close() {
		try {
			conn.getConnection().close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
