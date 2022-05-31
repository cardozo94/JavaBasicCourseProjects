<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ page import="java.util.List, com.camcar.modelo.Producto" %> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Productos</title>
		<style type="text/css">
			.cabecera{
				font-size:1.2em;
				font-weight:bold;
				color: #FFFFFF;
				background-color: #08088A;
				text-align: center;
			}
			.filas{
				text-align: center;
				background-color: #5882FA;
			}
			table{
				float: left;
			}
			
			#contenedorBoton{
				margin-left: 1000px; 
			}
		</style>
	</head>
<%-- 	<% --%>
<!-- // 		//obtine los productos del controlador (servlet) -->
<!-- // 		@SuppressWarnings("unchecked") -->
<!-- // 		List<Producto> productos = (List<Producto>) request.getAttribute("listaProductos"); -->
<%-- 	%> --%>
	<body>
<%-- 		<%= productos %> --%>	
		<table border="1">
			<tr>
				<td class="cabecera">C�digo Art�culo</td>
				<td class="cabecera">Secci�n</td>
				<td class="cabecera">Nombre Art�culo</td>
				<td class="cabecera">Fecha</td>
				<td class="cabecera">Precio</td>
				<td class="cabecera">Importado</td>
				<td class="cabecera">Pa�s de Origen</td>
				<td class="cabecera">Acci�n</td>
			</tr>
			<c:forEach var="producto" items="${listaProductos}">
				<!-- Link para actualizar cada producto con su campo clave -->
				<c:url var="link" value="ControladorProductos">
					<c:param name="instruccion" value="cargar"></c:param>
					<c:param name="codigo" value="${producto.codigo}"></c:param>
				</c:url>
				<!-- Link para borrar cada producto con su campo clave -->
				<c:url var="link2" value="ControladorProductos">
					<c:param name="instruccion" value="borrar"></c:param>
					<c:param name="codigo" value="${producto.codigo}"></c:param>
				</c:url>
				<tr>
					<td class="filas">${producto.codigo}</td>
					<td class="filas">${producto.seccion}</td>
					<td class="filas">${producto.nombre}</td>
					<td class="filas">${producto.fecha}</td>
					<td class="filas">${producto.precio}</td>
					<td class="filas">${producto.importado}</td>
					<td class="filas">${producto.paisOrigen}</td>
					<td class="filas"><a href="${link}">Actualizar</a>&nbsp;<a href="${link2}">Eliminar</a></td>
				</tr>
			</c:forEach>
		</table>
		<div id="contenedorBoton">
			<input type="button" value="Insertar Registro" onclick="window.location.href='vista/InsertaProducto.jsp'"/>
		</div>
	</body>
</html>