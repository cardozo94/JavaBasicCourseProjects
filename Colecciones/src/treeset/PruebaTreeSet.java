package treeset;

//import java.util.Comparator;
import java.util.TreeSet;


public class PruebaTreeSet {

	public static void main(String[] args) {
		
//		TreeSet<String> personas = new TreeSet<String>();
//		
//		personas.add("Camilo");
//		personas.add("Mireya");
//		personas.add("Lorena");
//		personas.add("Briyith");
//		System.out.println(personas);
//		personas.forEach(persona -> System.out.println(persona));

		TreeSet<Articulo> articulos = new TreeSet<Articulo>();
		
		Articulo primero = new Articulo(1, "Primer artículo");
		Articulo segundo = new Articulo(200, "Segundo artículo");
		Articulo tercero = new Articulo(3, "ATercero artículo");
		
		articulos.add(tercero);
		articulos.add(segundo);
		articulos.add(primero);
		
		articulos.forEach(articulo -> System.out.println(articulo.getDescripion()));
		
		Articulo comparadorArticulos = new Articulo();
		
//		Comparador comparadorArticulos = new Comparador(); 
		
		TreeSet<Articulo> articulosOrdenadosAlp = new TreeSet<Articulo>(comparadorArticulos);
		
//		TreeSet<Articulo> articulosOrdenadosAlp = new TreeSet<Articulo>(new Comparator<Articulo>() {
//
//			@Override
//			public int compare(Articulo o1, Articulo o2) {
//				String descripcion1 = o1.getDescripion();
//				String descripcion2 = o2.getDescripion();
//				return descripcion1.compareTo(descripcion2);
//			}
//			
//		});
	
		articulosOrdenadosAlp.add(tercero);
		articulosOrdenadosAlp.add(segundo);
		articulosOrdenadosAlp.add(primero);
		
		articulosOrdenadosAlp.forEach(articulo -> System.out.println(articulo.getDescripion()));
	}

}
