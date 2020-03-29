public class Liquidacion extends Prenda {
	Liquidacion(String tipo, double precio){
		this.tipo = tipo;
		this.precio = precio;
	}
	double obtenerPrecio() {
		return precio/2;
	}

}
