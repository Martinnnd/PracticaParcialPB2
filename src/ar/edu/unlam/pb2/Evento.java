package ar.edu.unlam.pb2;

import java.time.LocalDate;

public class Evento {
	
	private LocalDate fecha;
	private Double duracion;
	private Integer numeroDeParticipantes;
	private Comisario comisarios;
	
	public Evento(LocalDate fecha, Double duracion, Integer numeroDeParticipantes, Comisario comisarios) {
		this.fecha = fecha;
		this.duracion = duracion;
		this.numeroDeParticipantes = numeroDeParticipantes;
		this.comisarios = comisarios;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Double getDuracion() {
		return duracion;
	}

	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}

	public Integer getNumeroDeParticipantes() {
		return numeroDeParticipantes;
	}

	public void setNumeroDeParticipantes(Integer numeroDeParticipantes) {
		this.numeroDeParticipantes = numeroDeParticipantes;
	}

	public Comisario getComisarios() {
		return comisarios;
	}

	public void setComisarios(Comisario comisarios) {
		this.comisarios = comisarios;
	}
	
	
	
	

}
