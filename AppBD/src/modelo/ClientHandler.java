package modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import javax.swing.JOptionPane;


public class ClientHandler {
	
	public static void main(String[] args) {
//		String nombreArticulo = JOptionPane.showInputDialog("Introduce nombre artículo: ");
//		double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce Precio"));
//		ProductHandler db = new ProductHandler();
//		db.updatePrices(nombreArticulo, precio);
		ClientHandler cliente = new ClientHandler();
		cliente.setPedidos();
//		db.updateProductosPolicy();
	}
	
	public void getClientsByCity() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "MySQLP@ss2022");
			CallableStatement sentecia = conn.prepareCall("{call muestra_clientes_por_poblacion}");
			ResultSet rs = sentecia.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void setPedidos() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "MySQLP@ss2022");
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			String sql = "INSERT INTO clientes (codigo, empresa, direccion) VALUES ('CT84', 'EJEMPLO', 'P BOTANICO')";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO pedidos (numero_pedido, codigo_cliente, fecha_pedido) VALUES ('82', 'CT84', '2000-03-11')";
			stmt.executeUpdate(sql);
			conn.commit();
			System.out.println("Datos insertados correctamente");
		} catch (SQLException e) {
			System.out.println("Error en la inserción den datos!!");
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

}
