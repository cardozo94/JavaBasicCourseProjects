package clasespropias;

public class UsoPareja {

	public static void main(String[] args) {
		
		Pareja<String> pareja = new Pareja<String>();
		pareja.setPrimero("Camilo");
		System.out.println(pareja.getPrimero());
		System.out.println(pareja);

		Pareja<Persona> pareja2 = new Pareja<Persona>();
		Persona persona1 = new Persona("Briyith");
		pareja2.setPrimero(persona1);
		System.out.println(pareja2.getPrimero());
		System.out.println(pareja2);
	}

}
