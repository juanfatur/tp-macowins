import java.time.LocalDate;
import java.util.*;

public class VentaTarjeta extends Venta {
	int cuotas;
	double coeficienteCuotas = 1;
	VentaTarjeta(Map<Prenda, Integer> articulosComprados,LocalDate fecha,int cuotas){
		this.cuotas = cuotas;
		this.articulosComprados = articulosComprados;
		this.fecha = fecha;
	}
	
	
	double calcularPrecioFinal() {
		
		return super.calcularPrecioFinal()*1.01 + cuotas * coeficienteCuotas;
	}

}
