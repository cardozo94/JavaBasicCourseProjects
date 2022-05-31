package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class UsoEmpleado {

	public static void main(String[] args) {
		
		Empleado listaEmpleados[] = new Empleado[3];
		
		listaEmpleados[0]= new Empleado("Ana", 45, 2500);
		listaEmpleados[1]= new Empleado("Antonio", 55, 2000);
		listaEmpleados[2]= new Empleado("María", 25, 2600);
		
		for (Empleado empleado : listaEmpleados) {
			System.out.println(empleado);
		}
		
		ArrayList<Empleado> listaEmpleados2 = new ArrayList<Empleado>();
		listaEmpleados2.add(listaEmpleados[0]);
		listaEmpleados2.add(listaEmpleados[1]);
		listaEmpleados2.add(listaEmpleados[2]);

		for (Empleado empleado : listaEmpleados2) {
			System.out.println(empleado);
		}
		
		listaEmpleados[0].setSalario(3000);
		
		for (Empleado empleado : listaEmpleados2) {
			System.out.println(empleado);
		}
		
		System.out.println(listaEmpleados2.size());
		listaEmpleados2.trimToSize();
		System.out.println(listaEmpleados2.size());
		listaEmpleados2.set(1, new Empleado("Olga", 22, 2200));
		listaEmpleados2.forEach(e -> System.out.println(e));
		listaEmpleados2.add(2, new Empleado("Pedro", 23, 2400));
		listaEmpleados2.forEach(e -> System.out.println(e));
		
		listaEmpleados2.toArray(new Empleado[listaEmpleados2.size()]);
		
		Iterator<Empleado> iterator = listaEmpleados2.iterator();
		System.out.println("-------------------------------");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}

}
