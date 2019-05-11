package proyectoAssertThat;

import org.junit.Before;
import org.junit.Assert;

public class IntroduccionHamcrestTest {

	@Before
	public void setUp() throws Exception {
	}
	
	public void ejemplosInicialesHamcrest() {
		
		String cadena = "HolaMundo";
		
		//Comparativa
		Assert.assertEquals("HolaMundo", cadena);
	}

}
