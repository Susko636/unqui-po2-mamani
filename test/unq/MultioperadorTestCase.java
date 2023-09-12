package unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Multioperador;

public class MultioperadorTestCase {
	
	private Multioperador numeros ;
		
	@BeforeEach
	public void setUp() {
		numeros = new Multioperador();
		numeros.agregarNum(2);
		numeros.agregarNum(1);
		numeros.agregarNum(12);
		numeros.agregarNum(7);
		numeros.agregarNum(27);
		numeros.agregarNum(22);
		numeros.agregarNum(52);
	}
	
	
	@Test
	public void testSumTodos() {
		int amount = numeros.sumarTodos();
		assertEquals(amount, 123);
	}
	
	@Test
	public void testResTodos() {
		int amount = numeros.restarTodos();
		assertEquals(amount, -123);
	}
	
	@Test
	public void testMulTodos() {
		int amount = numeros.multiplicarTodos();
		assertEquals(amount, 5189184);
	}

}
