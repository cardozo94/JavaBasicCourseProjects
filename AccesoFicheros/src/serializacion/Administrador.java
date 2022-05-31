package serializacion;

public class Administrador extends Empleado {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double incentivo;
	
	public Administrador(String nombre, double sueldo, int ango, int mes, int dia) {
		super(nombre, sueldo, ango, mes, dia);
		setIncentivo(0);
	}
	
	public double getSueldo() {
		double sueldoBase = super.getSueldo();
		return sueldoBase+incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	@Override
	public String toString() {
		return "Administrador [incentivo=" + incentivo + ", toString()=" + super.toString() + "]";
	}

}
