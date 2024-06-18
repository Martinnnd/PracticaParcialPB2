package ar.edu.unlam.pb2;

public interface SedeOlimpicaInterface {

	String getNombre();
	Boolean agregarComplejo(ComplejoDeportivo complejoSimple);
	Boolean agregarComplejoPolideportivoConAreaYEvento(ComplejoEvento complejoEvento);
	Boolean agregarComplejoArea(ComplejoDeportivo polideportivo, AreaDesignada areaDesignada);

}
