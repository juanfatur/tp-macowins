/*
 * Requerimientos:
 * - Modelar las prendas con sus distintos tipos (pantalon, saco, camisa) y registrar sus precios y su estado
 * - Obtener precio de una prenda calculado a partir de su precio y su estado
 * - 
 */

public abstract class Prenda {
	String tipo;
	double precio;
	abstract double obtenerPrecio();
}

