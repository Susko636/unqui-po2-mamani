package ar.edu.unq.po2.tp7;

public enum Lesion {
	
	ROJO("Perdida de miembro", 4), GRIS("Fractura", 3), AMARILLO("Esguince", 2), MIEL("Golpe leve", 1);

	String descripcionDeLesion;
	int nivelDeRiesgo;
	
	Lesion(String descripcion, int nivel) {
		descripcionDeLesion = descripcion;
		nivelDeRiesgo = nivel;
	}
	
	public Lesion proximoNivelDeMaduracion() {
		int ordinal = this.ordinal();
		int cantLesiones = values().length;
		int siguienteOrdinal = (ordinal + 1) % cantLesiones;
		return values()[siguienteOrdinal];
	}
	
}
