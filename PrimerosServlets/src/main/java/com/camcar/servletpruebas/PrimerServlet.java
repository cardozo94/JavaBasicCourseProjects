package com.camcar.servletpruebas;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Servlet implementation class PrimerServlet
 */
public class PrimerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimerServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Especificando formato de respuesta
		PrintWriter salida = response.getWriter();
		//Generar respuesta de la petición
		salida.println("<html><body>");
		salida.println("<h1 style ='text-aling:center'>Prueba Servlet</h1>");
		salida.println("");
		salida.println("");
		salida.println("");
		salida.println("");
		salida.println("Fecha y hora actual: "+new Date());
		salida.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
