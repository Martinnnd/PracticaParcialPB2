package ar.edu.unlam.pb2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestOlimpiadas {
	
	@Test
	public void queSePuedaCrearUnComplejoSimpleEnUnaSedeOlimpica() {
		SedeOlimpica sedeOlimpica = new SedeOlimpica("Estadio Monumental");
		ComplejoDeportivo complejoSimple = new DeporteSimple("Cancha Handball", 20);
		
		Boolean seAgregaDeporteSimple = sedeOlimpica.agregarComplejo(complejoSimple);
		
		assertTrue(seAgregaDeporteSimple);
	}
}
