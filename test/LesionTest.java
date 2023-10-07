import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.Lesion;

class LesionTest {
	
	private Lesion lesionPrueba;
	
	@BeforeEach
	public void setUp() {
		lesionPrueba = Lesion.ROJO;
	}
	
	@Test
	void test() {
		assertEquals(lesionPrueba.proximoNivelDeMaduracion(), Lesion.GRIS);
	}

}
