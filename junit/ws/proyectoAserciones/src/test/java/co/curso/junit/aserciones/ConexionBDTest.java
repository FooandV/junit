package co.curso.junit.aserciones;

import java.sql.Connection;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class ConexionBDTest {
	
	private ConexionBD conexion;
	
	@Test
	public void testFail() {
		
//		Assert.fail("Prueba de fail");
		
	}
	
	@Test
	public void testFailConnectioBd() {
		
		conexion= new ConexionBD();
		
		Connection con = conexion.getConnection();
		if(con == null) {
			Assert.fail("Ha fallado la conexion con BD");
		}
		Assert.assertThat(con, Matchers.notNullValue());
//		Assert.assertThat(conexion.db, Matchers.equalTo("tarari"));
//		Assert.assertThat(conexion.url, Matchers.equalTo("tarari"));
//		Assert.assertThat(conexion.user, Matchers.equalTo("tarari"));
//		Assert.assertThat(conexion.pass, Matchers.equalTo("tarari"));
		
	}
	

}
