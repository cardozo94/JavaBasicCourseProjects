<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
	String alumnos[] = {"Antonio", "Sandra", "Maria", "Paco"};
	
	pageContext.setAttribute("losAlumnos", alumnos);
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			//recorrer array sin tags
			for(String alumno: alumnos){
				out.print(alumno+"<br>");
			}
		%>
		<c:forEach var="alumno" items="${losAlumnos}">
			${alumno}<br>
		</c:forEach>
	</body>
</html>