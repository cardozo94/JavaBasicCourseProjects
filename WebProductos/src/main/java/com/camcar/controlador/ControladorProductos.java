package com.camcar.controlador;

import jakarta.annotation.Resource;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import com.camcar.modelo.ModeloProductos;
import com.camcar.modelo.Producto;

/**
 * Servlet implementation class ControladorProductos
 */
public class ControladorProductos extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private ModeloProductos modelo;

	@Resource(name = "jdbc/Productos")
	private DataSource pool;

	@Override
	public void init() throws ServletException {

		super.init();
		try {
			this.modelo = new ModeloProductos(this.pool);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		// Leer parámetro del formulario
		String commando = request.getParameter("instruccion");
		// si no se envía el parametro, listar productos
		if (commando == null) {
			commando = "listar";
		}
		// redirigir el flujo de ejecución al método adecuado
		switch (commando) {
		case "listar":
			obtenerProductos(request, response);
			break;
		case "insertarBBDD":
			agregarProducto(request, response);
			break;
		case "cargar":
			try {
				cargarProducto(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "actualizarBBDD":
			try {
				actualizarProducto(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "borrar":
			try {
				eliminarProducto(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		default:
			obtenerProductos(request, response);
		}

	}

	private void eliminarProducto(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// capturar código
		String codigo = request.getParameter("codigo");
		// borrar producto de la BBDD
		modelo.eliminarProducto(codigo);
		// volver al listado de productos
		obtenerProductos(request, response);
	}

	private void actualizarProducto(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// leer información del formulario
		Date fecha = null;
		try {
			fecha = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("fecha"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// crear un objeto de tipo producto
		Producto producto = new Producto(request.getParameter("codigoArt"), request.getParameter("seccion"),
				request.getParameter("nombre"), Double.parseDouble(request.getParameter("precio")), fecha,
				"true".equals(request.getParameter("importado")), request.getParameter("paisOrigen"));

		// Enviar el objeto al modelo y actualizar el objeto en la BBDD
		modelo.actualizarProducto(producto);
		// volver al listado de productos
		obtenerProductos(request, response);

	}

	private void cargarProducto(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// Leer el código articulo que viene del listado
		String codigo = request.getParameter("codigo");
		// Cargar la infromación del articulo
		Producto producto = modelo.getProducto(codigo);
		// Colocar atributo correspondiente al articulo
		request.setAttribute("producto", producto);
		// Enviar producto al fromulario de actualizar (jsp)
		RequestDispatcher reqDispatcher = request.getRequestDispatcher("/vista/ActualizarProducto.jsp");
		reqDispatcher.forward(request, response);
	}

	private void agregarProducto(HttpServletRequest request, HttpServletResponse response) {
		// leer información del formulario
		Date fecha = null;
		try {
			fecha = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("fecha"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// crear un objeto de tipo producto
		Producto producto = new Producto(request.getParameter("codigo"), request.getParameter("seccion"),
				request.getParameter("nombre"), Double.parseDouble(request.getParameter("precio")), fecha,
				"true".equals(request.getParameter("importado")), request.getParameter("paisOrigen"));

		// Enviar el objeto al modelo e insertar el objeto en la BBDD
		try {
			modelo.agregarProducto(producto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// volver al listado de productos
		obtenerProductos(request, response);

	}

	private void obtenerProductos(HttpServletRequest request, HttpServletResponse response) {
		// obtener lista de producto desde el modelo
		List<Producto> productos;
		try {
			productos = this.modelo.getProductos();
			// agregar lista de productos al request
			request.setAttribute("listaProductos", productos);
			// enviar request a la página jsp
			RequestDispatcher reqDispatcher = request.getRequestDispatcher("/vista/ListaProductos.jsp");
			reqDispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
