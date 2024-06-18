package ar.edu.unlam.pb2;

public class Comisario {
	
	private Integer dni;
	private String nombre;
	private Integer edad;
	
	public Comisario(Integer dni, String nombre, Integer edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
	
	
}
