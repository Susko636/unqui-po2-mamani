package ar.edu.unq.po2.tp7;

import java.util.List;

public class ActividadSemanal {
	
	DiaDeLaSemana dia;
	double duracion;
	int horaDeInicio;
	Deporte deporte;
	List<ActividadSemanal> actividadesSemanales;
	
	public int costoActividadSemanal(Deporte actividad) {
		if ((dia == DiaDeLaSemana.LUNES)
			|| (dia == DiaDeLaSemana.MARTES)
			|| (dia == DiaDeLaSemana.MIERCOLES))
			return 500 + (200 * actividad.complejidad);
		else return 1000 + (200 * actividad.complejidad);
	}
	
	public ActividadSemanal(DiaDeLaSemana dia, double duracion, int horaDeInicio, Deporte deporte,
			List<ActividadSemanal> actividadesSemanales) {
		super();
		this.dia = dia;
		this.duracion = duracion;
		this.horaDeInicio = horaDeInicio;
		this.deporte = deporte;
		this.actividadesSemanales = actividadesSemanales;
	}

	public List<ActividadSemanal> cantidadDeFutbol() {
		return actividadesSemanales.stream().filter(a->a.equals(Deporte.FUTBOL)).toList();
	}
	
	public void agregarActividad(ActividadSemanal actividad) {
		actividadesSemanales.add(actividad);
	}
	
}
