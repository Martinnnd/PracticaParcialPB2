package ar.edu.unlam.pb2;

public class ComplejoEvento {
	
	private ComplejoDeportivo complejo;
	private Evento evento;
	private AreaDesignada areaDesignada;
	
	public ComplejoEvento(ComplejoDeportivo complejo, Evento evento, AreaDesignada areaDesignada) {
		this.complejo = complejo;
		this.evento = evento;
		this.areaDesignada = areaDesignada;
	}

	public ComplejoDeportivo getComplejo() {
		return complejo;
	}

	public void setComplejo(ComplejoDeportivo complejo) {
		this.complejo = complejo;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public AreaDesignada getAreaDesignada() {
		return areaDesignada;
	}

	public void setAreaDesignada(AreaDesignada areaDesignada) {
		this.areaDesignada = areaDesignada;
	}
	
	
	
	
}
