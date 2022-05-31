package libros;

import java.util.Objects;

public class Libro {
	
	private String titulo;
	private String autor;
	private int isbn;
	
	public Libro(String titulo, String autor, int isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return isbn == other.isbn;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		boolean equals = false;
//		if(obj instanceof Libro) {
//			Libro otroLibro = (Libro) obj;
//			if(this.isbn == otroLibro.isbn)
//				equals = true;
//		}
//		return equals;
//	}

}
