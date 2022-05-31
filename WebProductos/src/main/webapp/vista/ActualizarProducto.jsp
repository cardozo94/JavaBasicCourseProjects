<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Actualiza Producto</title>
	</head>
	<body>
		<h1 style="text-align: center">Actualizar Registro</h1>
		<form name ="from2" method="get" action="ControladorProductos">
			<input type="hidden" name="instruccion" value="actualizarBBDD">
			<input type="hidden" name="codigoArt" value="${producto.codigo}">
			<table style="width:50%; border=0;">
			<tr>
				<td width="27%">Código Artículo</td>
				<td width="73%">
<!-- 					<label for="codigo"></label> -->
					<%= request.getParameter("codigo") %>
				</td>
			</tr>
			<tr>
				<td>Sección</td>
				<td>
					<label for="seccion"></label>
					<input type="text" name="seccion" id="seccion" value="${producto.seccion}">
				</td>
			</tr>
			<tr>
				<td>Nombre Artículo</td>
				<td>
					<label for="nombre"></label>
					<input type="text" name="nombre" id="nombre" value="${producto.nombre}">
				</td>
			</tr>
			<tr>
				<td>Fecha</td>
				<td>
					<label for="fecha"></label>
					<input type="text" name="fecha" id="fecha" value="${producto.fecha}">
				</td>
			</tr>
			<tr>
				<td>Precio</td>
				<td>
					<label for="precio"></label>
					<input type="text" name="precio" id="precio" value="${producto.precio}">
				</td>
			</tr>
			<tr>
				<td>Importado</td>
				<td>
					<label for="importado"></label>
					<input type="text" name="importado" id="importado" value="${producto.importado}">
				</td>
			</tr>
			<tr>
				<td>País de Origen</td>
				<td>
					<label for="paisOrigen"></label>
					<input type="text" name="paisOrigen" id="paisOrigen" value="${producto.paisOrigen}">
				</td>
			</tr>
			<tr>
				<td><input type="submit" name="actualiza" id="actualiza" value="Actualizar"></td>
				<td><input type="reset" name="borrar" id="borrar" value="Restablecer"></td>
			</tr>
			</table>
		</form>
	</body>
</html>