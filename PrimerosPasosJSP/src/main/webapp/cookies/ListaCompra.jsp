<%@ page import="java.util.*" %>
<!-- Para entender sesiones -->
<html>
	<body>
		<form name="FormularioCompra" action="ListaCompra.jsp">
			<p>Art�culos a comprar:</p>
			<p>
				<label>
					<input type="checkbox" name="articulos" value="agua">
					Agua
				</label>
				<br>
				<label>
					<input type="checkbox" name="articulos" value="leche">
					Leche
				</label>
				<br>
				<label>
					<input type="checkbox" name="articulos" value="pan">
					Pan
				</label>
				<br>
				<label>
					<input type="checkbox" name="articulos" value="manzanas">
					Manzanas
				</label>
				<br>
				<label>
					<input type="checkbox" name="articulos" value="carne">
					Carne
				</label>
				<br>
				<label>
					<input type="checkbox" name="articulos" value="pescado">
					Pescado
				</label>
			</p>
			<p>
				<input type="submit" name="button" id="button" value="Enviar">
				<br>
			</p>
		</form>
		
		<h2>Carro de la compra:</h2>
		
		<ul>		
			<% 
				@SuppressWarnings("unchecked")
				List<String> listaElementos= (List<String>) session.getAttribute("misElementos");
				
			
				if(listaElementos == null){
					listaElementos = new ArrayList<String>();
					session.setAttribute("misElementos", listaElementos);
				}
				String[] elementos = request.getParameterValues("articulos");
				if(elementos != null){
					for(String elemento : elementos){
// 						out.println("<li>"+elemento+"</li>");
						listaElementos.add(elemento);
					}
				}
				for(String elemento : listaElementos){
					out.println("<li>"+elemento+"</li>");
				}
			%>
		</ul>
		
	</body>
</html>