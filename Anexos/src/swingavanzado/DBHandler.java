package swingavanzado;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBHandler {

	
	private ResultSet rs;
	private Connection conn;

	public DBHandler() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<String> getTableNames() throws SQLException {
		List<String> tablas = new ArrayList<>();
		try {
			DatabaseMetaData datosBBDD = conn.getMetaData();
			rs = datosBBDD.getTables("jdbc", null, null, null);
			while (rs.next()) {
				tablas.add(rs.getString("TABLE_NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			rs.close();
		}
		return tablas;
	}

	public ResultSetModeloTabla getDataTable(String table) {
		String consulta = "SELECT * FROM "+table;
		Statement stmt = null;
		ResultSetModeloTabla modelo = null;
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = stmt.executeQuery(consulta);
			modelo = new ResultSetModeloTabla(rs);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return modelo;
	}
}
