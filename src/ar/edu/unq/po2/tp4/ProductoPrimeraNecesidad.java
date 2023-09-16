package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	public ProductoPrimeraNecesidad(String a, Double n, boolean x) {
		super(a, n);
		setPrecioCuidado(x);
	}
	
	@Override
	public double getPrecio() {
		return this.precio * 0.9;
	}
	
}
