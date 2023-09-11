package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {

	private ArrayList<Integer> contador;
	
	public Counter() {
		contador = new ArrayList<Integer>();
	}
	
	public int cantPares() {
		int numPares = 0;
		for (int numero : contador ) {
			if (numero % 2 == 0) {
				numPares++;
			}
		}
		return numPares;
	}
	
	public int cantImpares() {
		int numImpares = 0;
		for (int numero : contador ) {
			if (numero % 2 != 0) {
				numImpares++;
			}
		}
		return numImpares;
	}
	
	public int cantMultiplosDe(int x) {
		int multiplosDe = 0;
		for (int numero : contador ) {
			if (numero % x == 0) {
				multiplosDe++;
			}
		}
		return multiplosDe;
	}
	
	public void agregarNum (int x) {
		contador.add(x);
	}
}
