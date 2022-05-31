package modelo;

public final class Queries {

	public static final String SELECT_PRODUCTS = "SELECT nombre, seccion, precio, pais_origen FROM productos";
	public static final String SELECT_PRODUCTS_BY_SECCION = "SELECT nombre, seccion, precio, pais_origen FROM productos WHERE seccion = ?";
	public static final String SELECT_PRODUCTS_BY_PAIS = "SELECT nombre, seccion, precio, pais_origen  FROM productos WHERE pais_origen = ?";
	public static final String SELECT_PRODUCTS_BY_SECCION_AND_PAIS = "SELECT nombre, seccion, precio, pais_origen  FROM productos WHERE seccion = ? AND pais_origen = ?";
	public static final String SELECT_A_COLUMN_PRODUCTS = "SELECT DISTINCTROW %s FROM PRODUCTOS";

}
