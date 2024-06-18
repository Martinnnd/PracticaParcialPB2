package ar.edu.unlam.pb2;

import java.util.Objects;

public class AreaDesignada {
	 
	private String ubicacion;

	public AreaDesignada(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ubicacion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AreaDesignada other = (AreaDesignada) obj;
		return Objects.equals(ubicacion, other.ubicacion);
	}
	
	
	
	
}
