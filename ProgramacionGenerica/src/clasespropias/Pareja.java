package clasespropias;

public class Pareja<T> {

	private T primero;
	
	public Pareja() {
		primero = null;
	}

	public T getPrimero() {
		return primero;
	}

	public void setPrimero(T primero) {
		this.primero = primero;
	}
	
	public static void imprimirTrabajador(Pareja<? extends Empleado> p) {
		Empleado primero = p.getPrimero();
		System.out.println(primero);
	}

	@Override
	public String toString() {
		return "Pareja [primero=" + primero + "]";
	}
		
}
