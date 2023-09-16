package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {
	
	private String nombre;
	
	private String direccion;
	
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public Supermercado(String a, String b) {
		super();
		this.setNombre(a);
		this.setDireccion(b);
	}
	
	public void setNombre(String a) {
		this.nombre = a;
	}
	
	public void setDireccion(String a) {
		this.direccion = a;
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public void agregarProducto(Producto x) {
		productos.add(x);
	}
	
	public double getPrecioTotal() {
		double montoTotal = 0;
		for (Producto producto : productos) {
			montoTotal = montoTotal + producto.getPrecio();
		}
		return montoTotal;
	}

}
