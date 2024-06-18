package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class SedeOlimpica implements SedeOlimpicaInterface {
	
	private String nombre;
	private List<ComplejoDeportivo> complejos;

	public SedeOlimpica(String nombre) {
		this.nombre = nombre;
		this.complejos = new ArrayList<>();
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public Boolean agregarComplejo(ComplejoDeportivo complejoSimple) {
		return this.complejos.add(complejoSimple);
	}
	
	
	
	
}
