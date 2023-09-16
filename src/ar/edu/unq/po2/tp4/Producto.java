package ar.edu.unq.po2.tp4;

public class Producto {
	
	private String nombre;
	
	protected double precio;
	
	private boolean esPrecioCuidado;
	
	public Producto(String a, Double n) {
		super();
		this.nombre = a;
		this.precio = n;
		this.esPrecioCuidado = false;
	}
	
	public Producto(String a, Double n, boolean x) {
		super();
		this.nombre = a;
		this.precio = n;
		this.esPrecioCuidado = x;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double n) {
		this.precio = n;
	}

	public void setPrecioCuidado(boolean x) {
		this.esPrecioCuidado = x;
	}
	
	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
	
	public void aumentarPrecio(double n) {
		double precio = getPrecio();
		this.setPrecio(precio+n);
	}
}
