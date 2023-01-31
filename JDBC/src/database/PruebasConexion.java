package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PruebasConexion {

	private final static String format = "%-7s%-12s%-20s%-10s%-11s%-10s%-12s%-5s%n";

	public static void main(String[] args) {

		try {
			// crea conexi�n
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
			// crea statement
			Statement stmt = conn.createStatement();
			select(conn, stmt);

//			String insert ="INSERT INTO productos(codigo, seccion, nombre, precio, fecha, importado, pais_origen)"+
//					" values (16, 'CONFECCI�N', 'PANTAL�N', 25.35, '2022-03-31', false, 'COLOMBIA')";
//			String updateSql = "UPDATE productos SET precio = precio*2 WHERE codigo = '16'";
//			String deleteSql = "DELETE FROM productos WHERE codigo ='16'";
			// ejecutar query
//			int result = stmt.executeUpdate(deleteSql);
//			System.out.println("Filas modificadas "+result);
			sentenciasPreparadas(conn);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error conexi�n");

		} finally {

		}
	}

	public static void select(Connection conn, Statement stmt) throws SQLException {
		// ejecutar query
		ResultSet rs = stmt.executeQuery("SELECT * FROM productos");
		// leer resultset
		System.out.printf(format, "C�digo", "Secci�n", "Nombre", "Precio", "Fecha", "Importado", "Pa�s Origen", "Foto");
		while (rs.next()) {
			System.out.printf(format, rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getDate(5),
					rs.getBoolean(6), rs.getString(7), rs.getObject(8));
		}
	}

	public static void sentenciasPreparadas(Connection conn) throws SQLException {
		// crea statement
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM productos WHERE seccion = ? AND pais_origen = ?");
		stmt.setString(1, "FERRETERIA");
		stmt.setString(2, "ESPAÑA");
		// ejecutar query
		ResultSet rs = stmt.executeQuery();
		// leer resultset
		System.out.printf(format, "C�digo", "Secci�n", "Nombre", "Precio", "Fecha", "Importado", "Pa�s Origen", "Foto");
		while (rs.next()) {
			System.out.printf(format, rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getDate(5),
					rs.getBoolean(6), rs.getString(7), rs.getObject(8));
		}
		rs.close();
	}
	

}
