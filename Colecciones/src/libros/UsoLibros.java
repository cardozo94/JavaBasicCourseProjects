package libros;

public class UsoLibros {

	public static void main(String[] args) {
		Libro libro1 = new Libro("P en Java", "Juan", 25);
		Libro libro2 = new Libro("P en Java II", "Juan", 25);
		
//		libro1=libro2;
		
		if(libro1.equals(libro2))
			System.out.println("Son iguales");
		else
			System.out.println("No son iguales");
		
		System.out.println(libro1.hashCode());
		System.out.println(libro2.hashCode());
	}

}
