package treeset;

import java.util.Comparator;

public class Articulo implements Comparable<Articulo>, Comparator<Articulo> {

	private int numero;
	private String descripion;
	
	public Articulo() {	}
	
	public Articulo(int num, String desc) {
		numero = num;
		descripion = desc;
	}
	
	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public String getDescripion() {
		return descripion;
	}



	public void setDescripion(String descripion) {
		this.descripion = descripion;
	}



	@Override
	public int compareTo(Articulo o) {
		return numero-o.numero;
	}

	@Override
	public int compare(Articulo o1, Articulo o2) {
		String descripcion1 = o1.getDescripion();
		String descripcion2 = o2.getDescripion();
		return descripcion1.compareTo(descripcion2);
	}

}
