package clasespropias;

import java.util.GregorianCalendar;

import arraylist.Empleado;

public class MetodosGenericos {

	public static void main(String[] args) {
		String nombres[] = {"Jose", "Maria", "Pepe"};
		String elementos = Matrices.<String>getElementos(nombres);
		System.out.println(elementos);
		
		System.out.println(Matrices.getElementoMenor(nombres));

		Empleado listaEmpleados[] = {new Empleado("Ana", 45, 2500),
				new Empleado("Ana", 45, 2500),
				new Empleado("Ana", 45, 2500),
				new Empleado("Ana", 45, 2500),
				new Empleado("Ana", 45, 2500),
				new Empleado("Ana", 45, 2500)};
		
		System.out.println(Matrices.getElementos(listaEmpleados));
		
		GregorianCalendar fechas[] = {new GregorianCalendar(2015, 07, 12),
				new GregorianCalendar(2016, 06, 11),
				new GregorianCalendar(2014, 04, 01),
				new GregorianCalendar(2015, 07, 12)};
		
		System.out.println(Matrices.getElementoMenor(fechas));
	}

}
