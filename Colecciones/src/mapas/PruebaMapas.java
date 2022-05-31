package mapas;

import java.util.HashMap;
import java.util.Map;

public class PruebaMapas {

	public static void main(String[] args) {
		
		HashMap<String, Empleado> empleados = new HashMap<String, Empleado>();
		
		Empleado empleado1 = new Empleado("Camilo");
		Empleado empleado2 = new Empleado("Briyith");
		Empleado empleado3 = new Empleado("Mireya");
		Empleado empleado4 = new Empleado("Lorena");
		Empleado empleado5 = new Empleado("Francisco");
		Empleado empleado6 = new Empleado("Antonia");
		
		empleados.put("1", empleado1);
		empleados.put("2", empleado2);
		empleados.put("3", empleado3);
		empleados.put("4", empleado4);
		empleados.put("5", empleado5);
		
		empleados.forEach((k, v) -> System.out.println("clave "+ k+" = "+v));
		
		empleados.remove("2");
		
		empleados.forEach((k, v) -> System.out.println("clave "+ k+" = "+v));
		
		empleados.put("3", empleado6);
		
		empleados.forEach((k, v) -> System.out.println("clave "+ k+" = "+v));
		
		System.out.println(empleados);
		System.out.println(empleados.entrySet());
		
		for (Map.Entry<String, Empleado> entrada : empleados.entrySet()) {
			System.out.println("Entrada con llave "+entrada.getKey()+" mapeada al valor "+entrada.getValue());
		}

	}

}
