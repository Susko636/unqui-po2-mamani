package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	private int porcentajeDescuento;
	
	public ProductoPrimeraNecesidad(String a, Double n, boolean x) {
		super(a, n);
		setPrecioCuidado(x);
	}
	
	public ProductoPrimeraNecesidad(String a, Double n, boolean x, int m) {
		super(a, n);
		setPrecioCuidado(x);
		this.porcentajeDescuento = m;
	}
	
	@Override
	public double getPrecio() {
		return this.precio - (this.precio * this.porcentajeDescuento) / 100;
	}
	
}
