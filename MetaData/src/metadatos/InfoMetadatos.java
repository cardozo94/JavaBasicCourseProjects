package metadatos;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InfoMetadatos {

	public static void main(String[] args) {
		mostrarInfoBBDD();
		mostrarInfoTablas();
		mostrarInfoColumnas();
	}

	public static void mostrarInfoBBDD() {
		Connection conn = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");

			DatabaseMetaData metadata = conn.getMetaData();

			System.out.println("Gestor de base de datos: " + metadata.getDatabaseProductName());
			System.out.println("Versi�n del gestor: " + metadata.getDatabaseProductVersion());
			System.out.println("Nombre del driver: " + metadata.getDriverName());
			System.out.println("Versi�n del driver: " + metadata.getDriverVersion());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void mostrarInfoTablas() {
		Connection conn = null;
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");

			DatabaseMetaData metadata = conn.getMetaData();

			System.out.println("Lista de tablas");
			rs = metadata.getTables(null, null, null, null);
			while(rs.next()) {
				System.out.println(rs.getString("TABLE_NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void mostrarInfoColumnas() {
		Connection conn = null;
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");

			DatabaseMetaData metadata = conn.getMetaData();

			System.out.println("\nLista de columnas");
			rs = metadata.getColumns(null, null, null, null);
			while(rs.next()) {
				System.out.println(rs.getString("COLUMN_NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
