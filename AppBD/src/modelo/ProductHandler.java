package modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ProductHandler {

	private ConexionDB conn;
	private PreparedStatement pstmt;
	private Statement stmt;

	public ProductHandler() {
		try {
			conn = new ConexionDB();
			stmt = conn.getConnection().createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Productos> getProductosPorSeccion(String seccion) {
		ResultSet rs = null;
		ArrayList<Productos> list = new ArrayList<>();
		try {
			pstmt = conn.getConnection().prepareStatement(Queries.SELECT_PRODUCTS_BY_SECCION);
			pstmt.setString(1, seccion);
			rs = pstmt.executeQuery();
			list = (ArrayList<Productos>) formatResult(rs);
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
		return list;
	}

	public List<Productos> getProductosPorPais(String pais) {
		ResultSet rs = null;
		ArrayList<Productos> list = new ArrayList<>();
		try {
			pstmt = conn.getConnection().prepareStatement(Queries.SELECT_PRODUCTS_BY_PAIS);
			pstmt.setString(1, pais);
			rs = pstmt.executeQuery();
			list = (ArrayList<Productos>) formatResult(rs);
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
		return list;
	}

	public List<Productos> getProductosPorSeccionYPais(String seccion, String pais) {
		ResultSet rs = null;
		ArrayList<Productos> list = new ArrayList<>();
		try {
			pstmt = conn.getConnection().prepareStatement(Queries.SELECT_PRODUCTS_BY_SECCION_AND_PAIS);
			pstmt.setString(1, seccion);
			pstmt.setString(2, pais);
			rs = pstmt.executeQuery();
			list = (ArrayList<Productos>) formatResult(rs);
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
		return list;
	}

	public List<Productos> getProductos() {
		ResultSet rs = null;
		ArrayList<Productos> list = new ArrayList<Productos>();
		try {
			rs = stmt.executeQuery(Queries.SELECT_PRODUCTS);
			list = (ArrayList<Productos>) formatResult(rs);
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
		return list;
	}

	public List<Productos> formatResult(ResultSet rs) throws SQLException {
		ArrayList<Productos> list = new ArrayList<Productos>();
		while (rs.next()) {
			Productos producto = new Productos();
			producto.setNombre(rs.getString(1));
			producto.setSeccion(rs.getString(2));
			producto.setPrecio(rs.getDouble(3));
			producto.setPaisOrigen(rs.getString(4));
			list.add(producto);
		}
		return list;
	}

	public void updatePrices(String articulo, double price) {
		try {
			CallableStatement sentencia = conn.getConnection().prepareCall("{call actualiza_precio_producto(?, ?)}");
			sentencia.setDouble(1, price);
			sentencia.setString(2, articulo);
			boolean rs = sentencia.execute();
			System.out.println(rs);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	public void updateProductosPolicy() {
		Connection conn = null;
		try {
			conn = this.conn.getConnection();
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			String sql = "DELETE FROM productos WHERE pais_origen = 'ITALIA'";
			String sql2 = "DELETE FROM productos WHERE precio > 300";
			String sql3 = "UPDATE productos SET precio = precio*1.15";
			if (ejecutarTransaccion()) {
				stmt.executeUpdate(sql);
				stmt.executeUpdate(sql2);
				stmt.executeUpdate(sql3);
				conn.commit();
				System.out.println("Transacción ejecutada correctamente.");
			}else {
				System.out.println("No se realizaron cambios");
			}
			
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
	
	public boolean ejecutarTransaccion() {
		String ejecucion=JOptionPane.showInputDialog("¿Ejecutamos transacción?");
		if(ejecucion.equalsIgnoreCase("si")||ejecucion.equalsIgnoreCase("sí")) {
			return true;
		}else {
			return false;
		}
	}

	public void close() {
		try {
			conn.getConnection().close();
			stmt.close();
			if (pstmt != null) {
				pstmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
