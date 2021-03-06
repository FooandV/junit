package co.curso.junit;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class UtilidadesTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testConcatenar() {

		// instanciar la clase a probar
		Utilidades utilidades = new Utilidades();

		// ejecutar el metodo a probar
		String resultado = utilidades.concatenar("Hola", "Mundo");

		// validaciones

		// un Assert es la condici�n que debe de cumplirse para que un test se considere
		// valido
		// el metodo va comprobar que el valor devuelto coincide con el que estamos
		// esperando, si
		// son iguales no pasa nada el metodo continua y el test finaliza con exito, si
		// no son iguales
		// se lanzauna excepci�n y el test falla

		/*
		 * el assertEquals: es un metodo que espera 2 parametros: 1. es lo que que
		 * esperamos o el resultado que esperamos para considerar el test v�lido, para
		 * el ejemplo el primer parametro deber�a devolver "Violettateamo" que es un
		 * String concatenado. 2. el segundo parametro es contra lo que se compara, es
		 * lo que devuelve el metodo concatenar en una ejecucion real
		 */

		Assert.assertEquals("Las cadenas son diferentes", "HolaMundo", resultado);
	}

	/*
	 * METODO FALLO Que significa que un metodo falla: significa que un metodo se
	 * ejecuta correctamente pero falla una de las asserciones, es decir no coincide
	 * el resultado del test con lo que que se esta esperando
	 */
	@Test
	public void testConcatenarFallo() {
		Utilidades utilidades = new Utilidades();
		String resultado = utilidades.concatenar("Hola", "Mundo");
		Assert.assertEquals("Las cadenas son diferentes", "Hola Mundo", resultado);
	}

	/*
	 * METODO ERROR Al intentar concatenar Mundo a un null va generar un
	 * "NullPointerException" por lo cual el metodo no va terminar de ejecutarse, no
	 * es que falle la asercion, si no que se ha producido un error que hace que
	 * termine normalmente, por lo tanto genera un error
	 */
	
	public void testConcatenarError() {
		Utilidades utilidades = new Utilidades();
		String resultado = utilidades.concatenar(null, "Mundo");
		Assert.assertEquals("Las cadenas son diferentes", "HolaMundo", resultado);
	}

}
