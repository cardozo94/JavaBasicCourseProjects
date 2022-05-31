package treeset;

import java.util.Comparator;

public class Comparador implements Comparator<Articulo>{

	@Override
	public int compare(Articulo o1, Articulo o2) {
		String descripcion1 = o1.getDescripion();
		String descripcion2 = o2.getDescripion();
		return descripcion1.compareTo(descripcion2);
	}
	
}