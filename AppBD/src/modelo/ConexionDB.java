package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

	private Connection conn;

	public ConexionDB() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return conn;
	}
	
	
	
}
