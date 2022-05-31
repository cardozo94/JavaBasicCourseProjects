<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<%
		//leyendo datos del formulario
			String ciudadFavorita= request.getParameter("ciudad_favorita");
		//crear la cookie
			Cookie cookie = new Cookie("AgenciaViajes.CiudadFavorita", ciudadFavorita);
			cookie.setMaxAge(365*24*60*60); //un año de duración
			//Enviar al usuario
			response.addCookie(cookie); 
		%>
		Gracias por enviar tus preferencias
		<a href="AgenciaViajes.jsp">Ir a la agencia de viajes</a>
	</body>
</html>