package ar.edu.unq.po2.tp7;

public enum Deporte {
	RUNNING(1),FUTBOL(2),BASKET(2),TENNIS(3),JABALINA(4);
	
	int complejidad;

	Deporte(int gradoDeComplejidad) {
		complejidad = gradoDeComplejidad;
	}

}
