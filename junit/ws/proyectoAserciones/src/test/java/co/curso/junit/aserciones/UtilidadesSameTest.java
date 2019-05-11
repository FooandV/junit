package co.curso.junit.aserciones;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UtilidadesSameTest {

	private UtilidadesSame utilidadesSame;

	@Before
	public void setUp() throws Exception {
		// se instancia:
		utilidadesSame = new UtilidadesSame();
	}

	@Test
	public void testSame() throws Exception {
		// given
		Persona p = new Persona("Violetta", "Otalvaro");
		// when
		Persona resultado = utilidadesSame.devuelveObjeto(p);
		// then
		Assert.assertSame("la persona si se encuentra en el array", p, resultado);
		Assert.assertEquals(p, resultado);
	}

	@Test
	public void testNotSame() throws Exception {
		// given
		Persona p = new Persona("Marco", "Parra");
		// when
		Persona resultado = utilidadesSame.devuelveObjeto(p);
		// then
		Assert.assertNotSame("la persona si se encuentra en el array", p, resultado);
		Assert.assertNotEquals(p, resultado);
	}

}
