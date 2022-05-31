package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaLinkedList {

	public static void main(String[] args) {
		LinkedList<String> personas = new LinkedList<String>();
		personas.add("Camilo");
		personas.add("Mireya");
		personas.add("Lorena");
		personas.add("Briyith");
		
		System.out.println(personas.size());
		ListIterator<String> itPersonas = personas.listIterator();
		itPersonas.next();
		itPersonas.add("Francisco");
		personas.forEach(persona -> System.out.println(persona));
	}

}
