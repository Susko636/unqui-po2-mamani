package ar.edu.unq.po2.tp7;

import java.util.List;

public class ActividadSemanal {
	
	private DiaDeLaSemana dia;
	private double duracion;
	private int horaDeInicio;
	private Deporte deporte;
	private List<ActividadSemanal> actividadesSemanales;

	public ActividadSemanal(DiaDeLaSemana dia, double duracion, int horaDeInicio, Deporte deporte,
			List<ActividadSemanal> actividadesSemanales) {
		super();
		this.dia = dia;
		this.duracion = duracion;
		this.horaDeInicio = horaDeInicio;
		this.deporte = deporte;
		this.actividadesSemanales = actividadesSemanales;
	}

	public DiaDeLaSemana getDia() {
		return dia;
	}

	public double getDuracion() {
		return duracion;
	}

	public int getHoraDeInicio() {
		return horaDeInicio;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public List<ActividadSemanal> getActividadesSemanales() {
		return actividadesSemanales;
	}
	
	public int costoActividadSemanal(Deporte actividad) {
		int costoBase; 
		if ((dia == DiaDeLaSemana.LUNES)
			|| (dia == DiaDeLaSemana.MARTES)
			|| (dia == DiaDeLaSemana.MIERCOLES)) {
			costoBase = 500;} 
		else {costoBase = 1000;}	    
		int costoComplejidad;
		costoComplejidad = actividad.getComplejidad() * 200;
		return costoBase + costoComplejidad;
	}

	public List<ActividadSemanal> cantidadDeFutbol() {
		return getActividadesSemanales().stream().filter(a->a.equals(Deporte.FUTBOL)).toList();
	}
	
	public List<ActividadSemanal> actividadesDeComplejidad(int complejidad) {
		return getActividadesSemanales().stream().filter(a->a.getDeporte().getComplejidad() == complejidad).toList();
	}
	
	public double horasTotalesDeActividades() {
		return getActividadesSemanales().stream().mapToDouble(ActividadSemanal::getDuracion).sum();
	}
		
	public void agregarActividad(ActividadSemanal actividad) {
		actividadesSemanales.add(actividad);
	}
	
}
