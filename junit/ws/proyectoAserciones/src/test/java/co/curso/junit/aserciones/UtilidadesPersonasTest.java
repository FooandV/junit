package co.curso.junit.aserciones;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Before;
import org.junit.Test;

public class UtilidadesPersonasTest {

	private UtilidadesPersonas utils;

	@Before
	public void setUp() throws Exception {
		utils = new UtilidadesPersonas();
	}

	@Test
	public void testGetCarlos() throws Exception {

		// given

		// when
//		Persona carlos= utils.getCarlos();

		// then
//		Assert.assertEquals("Carlos", carlos.getNombre());
		assertEquals("Carlos", utils.getCarlos().getNombre());
//		Assert.assertEquals("Romero", carlos.getApellido());
		assertEquals("Romero", utils.getCarlos().getApellido());
	}

	@Test
	public void testGetJuan() throws Exception {
		// given

		// when
		Persona juan = utils.getJuan();

		// then
		assertEquals("Juan", juan.getNombre());
		assertEquals("Lopez", juan.getApellido());
	}

	@Test
	public void testPersonasDiferentes() {
		Persona carlos = utils.getCarlos();
		Persona juan = utils.getJuan();
		
		assertNotEquals(juan, carlos);
	}

}
