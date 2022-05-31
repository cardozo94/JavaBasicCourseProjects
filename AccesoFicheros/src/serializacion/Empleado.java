package serializacion;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private double sueldos;
	private Date fechaContrato;
	
	public Empleado(String nombre, double sueldo, int ango, int mes, int dia) {
		this.nombre = nombre;
		this.sueldos = sueldo;
		GregorianCalendar calendario = new GregorianCalendar(ango, mes-1, dia);
		fechaContrato = calendario.getTime();
	}

	public String getNombre() {
		return nombre;
	}

	public double getSueldo() {
		return sueldos;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}
	
	public void subirSueldo(double porcentaje) {
		double aumento = sueldos*(porcentaje/100);
		sueldos+=aumento;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldos + ", fechaContrato=" + fechaContrato + "]";
	}

}
