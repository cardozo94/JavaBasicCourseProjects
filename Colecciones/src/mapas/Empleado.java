package mapas;

public class Empleado {
	
	private String nombre;
	private double sueldo;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
		sueldo = 2000;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}

}
