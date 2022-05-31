package com.camcar.modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class ModeloProductos {

	private DataSource poolConn;

	public ModeloProductos(DataSource poolConn) {
		this.poolConn = poolConn;
	}

	public List<Producto> getProductos() throws Exception {
		List<Producto> productos = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// establecer la conexión
			conn = this.poolConn.getConnection();
			// crear sentencia sql
			stmt = conn.createStatement();
			String sql = "SELECT * FROM productos";

			// ejecutar sentencia sql
			rs = stmt.executeQuery(sql);
			// recorrer result set obtenido
			while (rs.next()) {
				productos.add(new Producto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4),
						rs.getDate(5), rs.getBoolean(6), rs.getString(7)));
			}
		} finally {
			stmt.close();
			conn.close();
		}
		return productos;
	}

	public void agregarProducto(Producto producto) throws Exception {

		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			// establecer la conexión
			conn = this.poolConn.getConnection();
			// crear sentencia sql

			String sql = "INSERT INTO productos (codigo, seccion, nombre, precio, fecha, importado, pais_origen) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?)";

			stmt = conn.prepareStatement(sql);

			stmt.setString(1, producto.getCodigo());
			stmt.setString(2, producto.getSeccion());
			stmt.setString(3, producto.getNombre());
			stmt.setDouble(4, producto.getPrecio());
			stmt.setDate(5, new Date(producto.getFecha().getTime()));
			stmt.setBoolean(6, producto.getImportado());
			stmt.setString(7, producto.getPaisOrigen());
			// ejecutar sentencia sql
			stmt.executeUpdate();
		} finally {
			stmt.close();
			conn.close();
		}

	}

	public Producto getProducto(String codigo) throws Exception {
		Producto producto = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			// establecer la conexión
			conn = this.poolConn.getConnection();
			// crear sentencia sql

			String sql = "SELECT * FROM productos WHERE codigo =?";

			stmt = conn.prepareStatement(sql);

			stmt.setString(1, codigo);
			// ejecutar sentencia sql
			rs = stmt.executeQuery();
			if (rs.next()) {
				producto = new Producto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4),
						rs.getDate(5), rs.getBoolean(6), rs.getString(7));
			} else {
				throw new Exception("No se ha encontrado el producto con código artículo = " + codigo);
			}
		} finally {
			rs.close();
			stmt.close();
			conn.close();
		}
		return producto;
	}

	public void actualizarProducto(Producto producto) throws Exception {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			// establecer la conexión
			conn = this.poolConn.getConnection();
			// crear sentencia sql

			String sql = "UPDATE productos SET seccion=?, nombre=?, precio=?, fecha=?, importado=?, pais_origen=? "
					+ "WHERE codigo=?";

			stmt = conn.prepareStatement(sql);

			stmt.setString(1, producto.getSeccion());
			stmt.setString(2, producto.getNombre());
			stmt.setDouble(3, producto.getPrecio());
			stmt.setDate(4, new Date(producto.getFecha().getTime()));
			stmt.setBoolean(5, producto.getImportado());
			stmt.setString(6, producto.getPaisOrigen());
			stmt.setString(7, producto.getCodigo());
			// ejecutar sentencia sql
			stmt.executeUpdate();
		} finally {
			stmt.close();
			conn.close();
		}

	}

	public void eliminarProducto(String codigo) throws SQLException {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			// establecer la conexión
			conn = this.poolConn.getConnection();
			// crear sentencia sql
			String sql = "DELETE FROM productos WHERE codigo=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, codigo);
			// ejecutar sentencia sql
			stmt.execute();
		} finally {
			stmt.close();
			conn.close();
		}
	}
}
