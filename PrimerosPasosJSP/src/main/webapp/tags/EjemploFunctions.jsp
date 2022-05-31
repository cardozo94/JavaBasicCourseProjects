<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<c:set var="datos" value="Ana,López,Directora,75000"/>
		<c:set var="arregloDatos" value="${fn:split(datos,',')}"/>
		<input type="text" value="${arregloDatos[0]}"><br>
		<input type="text" value="${arregloDatos[1]}"><br>
		<input type="text" value="${arregloDatos[2]}"><br>
		<input type="text" value="${arregloDatos[3]}"><br>
	</body>
</html>