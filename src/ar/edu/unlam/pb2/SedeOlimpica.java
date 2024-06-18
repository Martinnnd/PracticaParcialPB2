package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SedeOlimpica implements SedeOlimpicaInterface {
	
	private String nombre;
	private List<ComplejoDeportivo> complejos;
	private List<ComplejoEvento> complejosEventos;
	private HashSet<AreaDesignada> areasDesignadas;

	public SedeOlimpica(String nombre) {
		this.nombre = nombre;
		this.complejos = new ArrayList<>();
		this.complejosEventos = new ArrayList<>();
		this.areasDesignadas = new HashSet<>();
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public Boolean agregarComplejo(ComplejoDeportivo complejoSimple) {
		return this.complejos.add(complejoSimple);
	}

	@Override
	public Boolean agregarComplejoPolideportivoConAreaYEvento(ComplejoEvento complejoEvento) {
		return this.complejosEventos.add(complejoEvento);
	}

	@Override
	public Boolean agregarComplejoArea(ComplejoDeportivo complejo, AreaDesignada areaDesignada) throws IndicadorAreaException{
		if(!areasDesignadas.add(areaDesignada)) {
			throw new IndicadorAreaException("Ya hay un area bro");
		}
		
		return complejos.add(complejo);		
	}

	public List<ComplejoDeportivo> getComplejos() {
		return complejos;
	}

	public void setComplejos(List<ComplejoDeportivo> complejos) {
		this.complejos = complejos;
	}

	public List<ComplejoEvento> getComplejosEventos() {
		return complejosEventos;
	}

	public void setComplejosEventos(List<ComplejoEvento> complejosEventos) {
		this.complejosEventos = complejosEventos;
	}

	public HashSet<AreaDesignada> getAreasDesignadas() {
		return areasDesignadas;
	}

	public void setAreasDesignadas(HashSet<AreaDesignada> areasDesignadas) {
		this.areasDesignadas = areasDesignadas;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
	
}
