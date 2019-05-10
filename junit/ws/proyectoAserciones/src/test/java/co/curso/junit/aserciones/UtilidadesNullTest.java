package co.curso.junit.aserciones;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;

public class UtilidadesNullTest {

	private UtilidadesNull utils;

	@Before
	public void setUp() throws Exception {
		utils = new UtilidadesNull();
	}

	@Test
	public void testDamePersona() throws Exception {
		// given

		// when
		Persona personaA = utils.damePersona("Freyder");
		Persona personaNull = utils.damePersona("Pepe");

		// then
		assertNotNull(personaA);
		assertNull(personaNull);

	}

}
