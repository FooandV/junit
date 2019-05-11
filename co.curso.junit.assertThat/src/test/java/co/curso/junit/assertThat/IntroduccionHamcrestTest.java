package co.curso.junit.assertThat;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class IntroduccionHamcrestTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void ejemplosInicialesHamcrest() {
		String cadena = "HolaMundo";

		// Comparativa
		assertEquals("HolaMundo", cadena);
		assertThat(cadena, is(equalTo("HolaMundo")));
		assertThat(cadena, not(equalTo("HolaJava")));
		assertThat(cadena, is(not(equalTo("HolaJava"))));

		// null
		assertThat(cadena, notNullValue());
		assertThat(cadena, is(notNullValue()));
		assertThat(cadena, is(not(nullValue())));
	}
	
	@Test
	public void ejemplosInicialesHamcrest2() {
		
		String cadena2= "HolaVioletta";
		//comparativa
		Assert.assertEquals("HolaVioletta", cadena2);
		Assert.assertThat(cadena2, is("HolaVioletta"));
	}

}
