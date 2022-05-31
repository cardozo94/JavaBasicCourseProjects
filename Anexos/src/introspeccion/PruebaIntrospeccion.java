package introspeccion;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class PruebaIntrospeccion {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el nombre de la clase");

		String nombreClase;

		nombreClase = entrada.next();

		try {
			Class clase = Class.forName(nombreClase);
			Class superClase = clase.getSuperclass();
			System.out.println("Clase: " + nombreClase);
			if (superClase != null && superClase != Object.class) {
				System.out.println("    extends: " + superClase.getName());
			}

			System.out.println();
			imprimirConstructores(clase);

			System.out.println();
			imprimirMetodos(clase);

			System.out.println();
			imprimirCampos(clase);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}

	}

	private static void imprimirCampos(Class clase) {
		Field[] campos = clase.getDeclaredFields();
		for (Field field : campos) {
			String nombre = field.getName();
			int modifier = field.getModifiers();
			System.out.print("	"+Modifier.toString(modifier));
			System.out.print(" "+field.getType()+" ");
			System.out.print(" "+nombre+";");
		}
	}

	private static void imprimirMetodos(Class clase) {
		Method[] metodos = clase.getDeclaredMethods();
		for (Method method : metodos) {
			String nombre = method.getName();
			
			System.out.print("	"+Modifier.toString(method.getModifiers()));
			System.out.print(" "+method.getReturnType()+" ");
			System.out.print(" "+nombre+"(");
			Class[] tipoParams = method.getParameterTypes();

			for (int i = 0; i < tipoParams.length; i++) {
				if (i > 0)
					System.out.print(", ");
				System.out.print( tipoParams[i].getName());
			}
			System.out.println(");");
		}
	}

	private static void imprimirConstructores(Class clase) {
		Constructor[] constructores = clase.getDeclaredConstructors();
		for (Constructor constructor : constructores) {
			String nombre = constructor.getName();
			System.out.print("	" + Modifier.toString(constructor.getModifiers()));
			System.out.print(" " + nombre + "(");
			// imprimir parametros
			Class[] tipoParams = constructor.getParameterTypes();
			for (int i = 0; i < tipoParams.length; i++) {
				if (i > 0)
					System.out.print(", ");
				System.out.print( tipoParams[i].getName());
			}
			System.out.println(");");
		}
	}

}
