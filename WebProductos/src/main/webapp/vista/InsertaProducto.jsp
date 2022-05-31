<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Inserta Producto</title>
	</head>
	<body>
		<h1 style="text-align: center">Insertar Registros</h1>
		<form name ="from1" method="get" action="../ControladorProductos">
			<input type="hidden" name="instruccion" value="insertarBBDD">
			<table style="width:50%; border=0;">
			<tr>
				<td width="27%">Código Artículo</td>
				<td width="73%">
					<label for="codigo"></label>
					<input type="text" name="codigo" id="codigo">
				</td>
			</tr>
			<tr>
				<td>Sección</td>
				<td>
					<label for="seccion"></label>
					<input type="text" name="seccion" id="seccion">
				</td>
			</tr>
			<tr>
				<td>Nombre Artículo</td>
				<td>
					<label for="nombre"></label>
					<input type="text" name="nombre" id="nombre">
				</td>
			</tr>
			<tr>
				<td>Fecha</td>
				<td>
					<label for="fecha"></label>
					<input type="text" name="fecha" id="fecha">
				</td>
			</tr>
			<tr>
				<td>Precio</td>
				<td>
					<label for="precio"></label>
					<input type="text" name="precio" id="precio">
				</td>
			</tr>
			<tr>
				<td>Importado</td>
				<td>
					<label for="importado"></label>
					<input type="text" name="importado" id="importado">
				</td>
			</tr>
			<tr>
				<td>País de Origen</td>
				<td>
					<label for="paisOrigen"></label>
					<input type="text" name="paisOrigen" id="paisOrigen">
				</td>
			</tr>
			<tr>
				<td><input type="submit" name="envio" id="envio" value="Enviar"></td>
				<td><input type="reset" name="borrar" id="borrar" value="Restablecer"></td>
			</tr>
			</table>
		</form>
	</body>
</html>