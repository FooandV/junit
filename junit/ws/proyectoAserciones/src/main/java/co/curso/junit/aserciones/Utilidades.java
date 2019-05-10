package co.curso.junit.aserciones;

/**
 * @author 1459444: freyder
 *
 */
public class Utilidades {

	/**
	 * Concatena y devuelve dos Strings pasados por parametro
	 * 
	 * @param uno ->primer String a concatenar
	 * @param dos ->segundo String a concatenar
	 * @return uno + dos
	 */
	public String concatenar(String uno, String dos) {
		if (uno != null && dos != null) {
			return uno.concat(" ").concat(dos);
		}
		return null;
	}

	/**
	 * Ejemplo "a", "b", "c" -> String[] array = {"a","b","c"}; array[0]="a"
	 * array[1]="b" array[2]="c"
	 * 
	 * @param strings
	 * @return String[strings.length]
	 */
	// Este metodo recibe un varArgs con un numero indeterminado de strings
	public String[] getArrayStrings(String... strings) {
		String[] array = new String[strings.length];
		for (int i = 0; i < strings.length; i++) {
			array[i] = strings[i];
		}
		return array;
	}

	/**
	 * Devuelve true para numeros mayores de 10 
	 * Devuelve false para numeros menores de 10
	 * @param num numero a validar;
	 * @return boolean de la comparativa
	 */

	public boolean esMayorQue10(int num) {

//		if(num >10) {
//			return true;
//			
//		}else {
//			return false;
//		}
		return num >10;

	}
}
