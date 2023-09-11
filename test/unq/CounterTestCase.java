package unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Counter;

public class CounterTestCase {
	
	private Counter counter;
	/**
	* Crea un escenario de test básico, que consiste en un contador
	* con 10 enteros
	*
	* @throws Exception
	*/
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
		counter = new Counter();
		//Se agregan los numeros. Un solo par y nueve impares
		counter.agregarNum(1);
		counter.agregarNum(3);
		counter.agregarNum(5);
		counter.agregarNum(7);
		counter.agregarNum(9);
		counter.agregarNum(1);
		counter.agregarNum(1);
		counter.agregarNum(1);
		counter.agregarNum(1);
		counter.agregarNum(4);
	}
	
	/*
	 * Verifica la cantidad de pares
	 */
	@Test
	public void testNumerosPares() {
		// Getting the even occurrences
			int amount = counter.cantPares();
		// I check the amount is the expected one
			assertEquals(amount, 1);
	}
	
	/*
	 * Verifica la cantidad de impares
	 */
	@Test
	public void testNumerosImpares() {
		// Getting the odd occurrences
			int amount = counter.cantImpares();
		// I check the amount is the expected nine
			assertEquals(amount, 9);
	}
	
	/*
	 * Verifica la cantidad de multiplos de 3
	 */
	@Test
	public void testcantidadDeMultiplosDe() {
		// Getting the odd occurrences
			int amount = counter.cantMultiplosDe(3);
		// I check the amount is the expected seven
			assertEquals(amount, 2);
	}
	
	
}
