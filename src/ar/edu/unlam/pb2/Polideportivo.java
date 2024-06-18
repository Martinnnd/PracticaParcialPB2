package ar.edu.unlam.pb2;

public class Polideportivo extends ComplejoDeportivo{

	private AreaDesignada areaDesignada;
	
	public Polideportivo(String nombre, Integer areaOcupada, AreaDesignada areaDesignada) {
		super(nombre, areaOcupada);
		
		this.areaDesignada = areaDesignada;
	}

	public AreaDesignada getAreaDesignada() {
		return areaDesignada;
	}

	public void setAreaDesignada(AreaDesignada areaDesignada) {
		this.areaDesignada = areaDesignada;
	}
	
	

}
