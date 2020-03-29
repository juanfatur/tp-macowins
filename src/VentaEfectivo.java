import java.time.*;
import java.util.*;

public class VentaEfectivo extends Venta {

	VentaEfectivo(Map<Prenda, Integer> articulosComprados,LocalDate fecha){
		this.articulosComprados = articulosComprados;
		this.fecha = fecha;
	}
	
	public static void main(String[] args) {
		Map<Prenda,Integer> articulosComprados = new HashMap<Prenda,Integer>();
		
		//articulosComprados.put(new Promocion("Pantalon",550,50), 3);
		articulosComprados.put(new Nueva("Saco",100), 1);
		articulosComprados.put(new Nueva("Remera",600), 3);
		
		Venta ventaNueva = new VentaTarjeta(articulosComprados, LocalDate.now(),2);
		
		System.out.println("Precio final = " + ventaNueva.calcularPrecioFinal());
	}
}
