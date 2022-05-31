package modelo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import controlador.LoadPropertiesDB;

public class DBHandler {

	private Connection conn;
	private String databaseName;
	
	public DBHandler() throws IOException {
		try {
			LoadPropertiesDB properties = new LoadPropertiesDB();
			databaseName = properties.getDatabaseName();
			conn = DriverManager.getConnection(properties.getUrl(), properties.getUser(), properties.getPassword());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public DBHandler(String path) {
		try {
			LoadPropertiesDB properties = new LoadPropertiesDB(path);
			databaseName = properties.getDatabaseName();
			conn = DriverManager.getConnection(properties.getUrl(), properties.getUser(), properties.getPassword());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<String> loadTables() {
		List<String> tablas = new ArrayList<>();
		ResultSet rs = null;
		
		try {
			DatabaseMetaData metadatos= conn.getMetaData();
			String[] array ={"TABLE"};
			rs = metadatos.getTables(databaseName, null, null, array);
			while(rs.next()) {
				tablas.add(rs.getString("TABLE_NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return tablas;
	}
	
	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<String> getColumnNames(String nombreTabla) {
		ArrayList<String> campos = new ArrayList<String>();
		String sql = "SELECT * FROM "+ nombreTabla+" LIMIT 1";
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			ResultSetMetaData rsBD = rs.getMetaData();
			for (int i = 1; i < rsBD.getColumnCount(); i++) {
				campos.add(rsBD.getColumnLabel(i));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return campos;
	}
	
	public ArrayList<String> getRowsFromTable(String nombreTabla, ArrayList<String> columnas) {
		ArrayList<String> rows = new ArrayList<String>();
		String sql = "SELECT * FROM "+ nombreTabla;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				StringBuilder row = new StringBuilder();
				for (String campo : columnas) {
					row.append(rs.getString(campo)+" ");
				}
				rows.add(row.toString());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}
}
