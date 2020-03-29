
public class Promocion extends Prenda {
	double valorPromocion;
	Promocion(String tipo, double precio,double valorPromocion){
		this.tipo = tipo;
		this.precio = precio;
		this.valorPromocion = valorPromocion;
	}
	double obtenerPrecio() {
		return precio - valorPromocion;
	}

}
