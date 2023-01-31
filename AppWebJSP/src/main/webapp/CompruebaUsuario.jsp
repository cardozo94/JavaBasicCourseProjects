<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Validando Usuario</title>
	</head>
	<body>
		<%
			String usuario = request.getParameter("usuario");
			String contra = request.getParameter("contra");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(usuario);
			System.out.println(contra);
			try {
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_jsp", "root", "");
				PreparedStatement stmt = conn.prepareStatement("SELECT * FROM usuarios WHERE usuario=? AND contrasena=?", //);
				ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				stmt.setString(1, usuario);
				stmt.setString(2, contra);
				ResultSet rs = stmt.executeQuery();
				if (rs.absolute(1)) {
					out.println("ok");
				} else {
					out.println("bad");
				}
			} catch (Exception e) {
				out.println("Ha habido un error");
				e.printStackTrace();
			}
		%>
	</body>
</html>