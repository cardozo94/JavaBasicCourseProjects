<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Recoge Datos</title>
	</head>
	<body>
		<%@page import="java.sql.Statement"%>
		<%@page import="java.sql.Connection"%>
		<%@page import="java.sql.DriverManager"%>
		<%
			String nombre = request.getParameter("nombre");
			String apellido = request.getParameter("apellido");
			String usuario = request.getParameter("usuario");
			String contra = request.getParameter("contra");
			String pais = request.getParameter("pais");
			String tecnologia = request.getParameter("tecnologias");
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			try{
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_jsp", "root", "MySQLP@ss2022");
				Statement stmt = conn.createStatement();
				String sql = "INSERT INTO usuarios (nombre, apellido, usuario, contrasena, pais, tecnologia)"
				+" VALUES ('"+nombre+"','"+apellido+"','"+usuario+"','"+contra+"','"+pais+"','"+tecnologia+"')";
				stmt.executeUpdate(sql);
				out.print("Registrado con éxito");	
			}catch(Exception e){
				out.println("Ha habido un error");
			}
		%>
	</body>
</html>