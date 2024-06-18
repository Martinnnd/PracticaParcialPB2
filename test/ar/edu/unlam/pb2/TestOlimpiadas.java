package ar.edu.unlam.pb2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

public class TestOlimpiadas {
	
	@Test
	public void queSePuedaCrearUnComplejoSimpleEnUnaSedeOlimpica() {
		SedeOlimpica sedeOlimpica = new SedeOlimpica("Estadio Monumental");
		ComplejoDeportivo complejoSimple = new DeporteSimple("Cancha Handball", 20);
		
		Boolean seAgregaDeporteSimple = sedeOlimpica.agregarComplejo(complejoSimple);
		
		assertTrue(seAgregaDeporteSimple);
	}
	
	@Test
	public void queSePuedaCrearUnComplejoPolideportivoConUnAreaEnUnaSedeOlimpica() {
		SedeOlimpica sedeOlimpica = new SedeOlimpica("Estadio Monumental");
		AreaDesignada areaDesignada = new AreaDesignada("Centro");
		ComplejoDeportivo polideportivo = new Polideportivo("Deportivo Moron", 100, areaDesignada);
		
		Boolean seAgregaPolideportivo = sedeOlimpica.agregarComplejo(polideportivo);
				
		assertTrue(seAgregaPolideportivo);
	}
	
	@Test
	public void queSePuedaCrearUnComplejoPolideportivoConUnAreaYUnEventoEnUnaSedeOlimpica() {
		SedeOlimpica sedeOlimpica = new SedeOlimpica("Estadio Monumental");
		AreaDesignada areaDesignada = new AreaDesignada("Centro");
		ComplejoDeportivo polideportivo = new Polideportivo("Deportivo Moron", 100, areaDesignada);
		Comisario comisario = new Juez(43874966, "Martin", 22);
		Evento evento = new Evento(LocalDate.of(2024, 06, 18), 5.0, 10, comisario);
		
		ComplejoEvento complejoEvento = new ComplejoEvento(polideportivo, evento, areaDesignada);
		
		Boolean SeAgregaComplejoDeportivoConAreaYEvento = sedeOlimpica.agregarComplejoPolideportivoConAreaYEvento(complejoEvento);
		
		assertTrue(SeAgregaComplejoDeportivoConAreaYEvento);
	}
	
	@Test (expected = IndicadorAreaException.class)
	public void queAlAgregarUnAreaAUnPolideportivoConIndicadorYaExistenteLanceUnaExcepcionIndicadorAreaException() {
		SedeOlimpica sedeOlimpica = new SedeOlimpica("Estadio Monumental");
		AreaDesignada areaDesignada = new AreaDesignada("Centro");
		ComplejoDeportivo polideportivo = new Polideportivo("Deportivo Moron", 100, areaDesignada);
		
		sedeOlimpica.agregarComplejoArea(polideportivo, areaDesignada);
		
		ComplejoDeportivo polideportivo2 = new Polideportivo("Deportivo Moron", 100, areaDesignada);
		Boolean seAgregapolideportivo2 = sedeOlimpica.agregarComplejoArea(polideportivo2, areaDesignada);
		
		assertEquals(1, sedeOlimpica.getAreasDesignadas().size());
		assertEquals(1, sedeOlimpica.getComplejos().size()); 
		
	}
	
	
}
