package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> paises = new LinkedList<String>();
		paises.add("Espa�a");
		paises.add("Colombia");
		paises.add("Mexico");
		paises.add("Peru");
		
		LinkedList<String> capitales = new LinkedList<String>();
		capitales.add("Madrid");
		capitales.add("Bogot�");
		capitales.add("D.F");
		capitales.add("Lima");
		
		System.out.println(paises);
		System.out.println(capitales);
		
		ListIterator<String> itPaises = paises.listIterator();
		ListIterator<String> itCapitales = capitales.listIterator();
		
		while(itCapitales.hasNext()) {
			if(itPaises.hasNext()) {
				itPaises.next();
			}
			itPaises.add(itCapitales.next());
		}
		System.out.println(paises);
		
		itCapitales = capitales.listIterator();
		
		while(itCapitales.hasNext()) {
			System.out.println(capitales);
			itCapitales.next();
			if(itCapitales.hasNext()) {
				itCapitales.next();
				itCapitales.remove();
			}
		}
		System.out.println(capitales);
		
		paises.removeAll(capitales);
		System.out.println(paises);

	}

}
