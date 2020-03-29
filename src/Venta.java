import java.time.*;
import java.util.*;
public abstract class Venta {
	Map<Prenda,Integer> articulosComprados;
	double calcularPrecioFinal() {
		double precio = 0;
		for(Map.Entry<Prenda,Integer> item : articulosComprados.entrySet()) {
			precio += item.getValue() * item.getKey().obtenerPrecio();
		}
		return precio;
	}
	LocalDate fecha;
}
