package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {

	private ArrayList<Integer> numeros;
	
	public Multioperador() {
		numeros = new ArrayList<Integer>();
	}
	
	public void agregarNum(int x) {
		numeros.add(x);
	}
	
	public int sumarTodos() {
		int resultado = 0;
		for (int numero : numeros) {
			resultado = resultado + numero; 
		}
		return resultado;
	}
	
	public int restarTodos() {
		int resultado = 0;
		for (int numero : numeros) {
			resultado = resultado - numero; 
		}
		return resultado;
	}
	
	public int multiplicarTodos() {
		int resultado = 1;
		for (int numero : numeros) {
			resultado = resultado * numero; 
		}
		return resultado;
	}
}
