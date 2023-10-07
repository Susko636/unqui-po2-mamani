import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.ActividadSemanal;
import ar.edu.unq.po2.tp7.Deporte;
import ar.edu.unq.po2.tp7.DiaDeLaSemana;

class TestActividadFutbol {
	
	ActividadSemanal actividad;
	ActividadSemanal actividadFutbol;
	ArrayList<ActividadSemanal> actividades;
	
	@BeforeEach
	public void setUp() {
		actividades = new ArrayList<ActividadSemanal>();
		actividad = new ActividadSemanal(DiaDeLaSemana.LUNES, 2d,12, Deporte.BASKET, actividades);
		actividadFutbol = new ActividadSemanal(DiaDeLaSemana.LUNES, 2d,12, Deporte.FUTBOL, actividades);
		actividad.agregarActividad(actividadFutbol);
	}
	
	@Test
	void test() {
		
		assertEquals(actividad.cantidadDeFutbol(), actividadFutbol.cantidadDeFutbol());
		
	}

}
