package introspeccion;

public class Empleado extends Persona {

	private double salario;
	
	public Empleado(String nombre, double salario) {
		super(nombre);
		this.salario= salario;
	}

	public double getSalario() {
		return salario;
	}
	
	public void setIncentivo(double incentivo) {
		salario=salario+incentivo;
	}

}
