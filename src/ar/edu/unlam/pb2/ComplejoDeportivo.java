package ar.edu.unlam.pb2;

public class ComplejoDeportivo extends SedeOlimpica {
	
	private String nombre;
	private Integer areaOcupada;

	public ComplejoDeportivo(String nombre, Integer areaOcupada) {
		super(nombre);
		
		this.nombre = nombre;
		this.areaOcupada = areaOcupada;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getAreaOcupada() {
		return areaOcupada;
	}

	public void setAreaOcupada(Integer areaOcupada) {
		this.areaOcupada = areaOcupada;
	}
	
	

}
