package com.camcar.modelo;

import java.util.Date;

public class Producto {
	
	private String codigo;
	private String seccion;
	private String nombre;
	private double precio;
	private Date fecha;
	private Boolean importado;
	private String paisOrigen;
	
	public Producto(String codigo, String seccion, String nombre, double precio, Date fecha, Boolean importado,
			String paisOrigen) {
		this.codigo = codigo;
		this.seccion = seccion;
		this.nombre = nombre;
		this.precio = precio;
		this.fecha = fecha;
		this.importado = importado;
		this.paisOrigen = paisOrigen;
	}

	public Producto(String seccion, String nombre, double precio, Date fecha, Boolean importado, String paisOrigen) {
		this.seccion = seccion;
		this.nombre = nombre;
		this.precio = precio;
		this.fecha = fecha;
		this.importado = importado;
		this.paisOrigen = paisOrigen;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Boolean getImportado() {
		return importado;
	}

	public void setImportado(Boolean importado) {
		this.importado = importado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", seccion=" + seccion + ", nombre=" + nombre + ", precio=" + precio
				+ ", fecha=" + fecha + ", importado=" + importado + ", paisOrigen=" + paisOrigen + "]";
	}
}
