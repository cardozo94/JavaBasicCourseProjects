package introspeccion;

public class UsoEmpleado {
	
	public static void main(String[] args) {
		Persona persona1 = new Persona("Antonio");
		System.out.println(persona1.getNombre());
		
		Empleado ana = new Empleado("Ana", 35000);
		System.out.println(ana.getNombre());
		System.out.println(ana.getSalario());
//		System.out.println(persona1.getClass());
//		
//		Class<? extends Persona> cl1 = persona1.getClass();
//		System.out.println(cl1.getName());
		String nombreClase = "introspeccion.Persona";
		Class cl1;
		try {
			cl1= Class.forName(nombreClase);
			System.out.println(cl1.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		nombreClase = "introspeccion.Empleado";
		try {
			cl1= Class.forName(nombreClase);
			System.out.println(cl1.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
