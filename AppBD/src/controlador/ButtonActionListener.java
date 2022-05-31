package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import modelo.ProductHandler;
import modelo.Productos;
import vista.LaminaPrincipal;

public class ButtonActionListener implements ActionListener {

	private ProductHandler db;
	private LaminaPrincipal lamina;

	public ButtonActionListener(LaminaPrincipal lamina) {
		db = new ProductHandler();
		this.lamina = lamina;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		List<Productos> list = filtraProductos(lamina.getSelectedSeccion(), lamina.getSelectedPais());
		setTitle();
		formatResult(list);
	}

	public List<Productos> filtraProductos(String seccion, String pais) {
		if (seccion.equals("TODAS") && pais.equals("TODOS")) {
			return db.getProductos();
		} else if (!seccion.equals("TODAS") && pais.equals("TODOS")) {
			return db.getProductosPorSeccion(seccion);
		} else if (seccion.equals("TODAS") && !pais.equals("TODOS")) {
			return db.getProductosPorPais(pais);
		} else {
			return db.getProductosPorSeccionYPais(seccion, pais);
		}
	}
	
	public void formatResult(List<Productos> list) {
		for (Productos item : list) {
			String texto = String.format("%-20s%-12s%-7.2f%-12s%n", item.getNombre(), item.getSeccion(),
					item.getPrecio(), item.getPaisOrigen());
			lamina.getTexto().append(texto);
		}
	}
	
	public void setTitle() {
		lamina.getTexto().setText(String.format("%-20s%-12s%-7s%-12s%n", "Nombre", "Sección",
				"Precio", "País"));
	}

}
