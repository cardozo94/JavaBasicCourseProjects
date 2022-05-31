package com.camcar.controlador;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

/**
 * Servlet implementation class ServletPruebas
 */
public class ServletPruebas extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	//Definir o establecer Data Source
	@Resource(name="jdbc/Productos")
	private DataSource pool;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPruebas() {
        super();
        // 
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		//Crear el obj PrintWriter
		PrintWriter salida = response.getWriter();
		response.setContentType("text/plain");
		//Crear conexiópn con BBDD
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = pool.getConnection();
			String sql= "SELECT * FROM productos";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String nombreArticulo= rs.getString(3);
				salida.println(nombreArticulo);
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}

}
