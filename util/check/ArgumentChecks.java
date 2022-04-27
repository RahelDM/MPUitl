/**
 * 
 */
package uo.mp2021.util.check;


/**
 * @author Raquel
 *
 */
public class ArgumentChecks {
	/**
	 * Comprueba si la condici�n es correcta. Si no lo es, lanza una excepci�n
	 * de tipo IllegalArgumentException en la que se env�a el mensaje del 
	 * par�metro
	 * 
	 * @param condition
	 * @param msg
	 */
	public static void isTrue(boolean condition, String msg) {
		if (!condition) {
			throw new IllegalArgumentException(msg);
		}
	}
	
	/**
	 * Comprueba si la condici�n es correcta. Si no lo es, lanza una excepci�n
	 * de tipo IllegalArgumentException
	 * @param condition
	 */
	public static void isTrue(boolean condition) {
		if (!condition) {
			throw new IllegalArgumentException();
		}
	}

	public static void isNotNull(Object obj) {
		isTrue(obj != null, "No puede ser null");
	}
	
	public static void isNotEmpty(String str) {
		isTrue(str != null && !str.isBlank(), "Cadena vac�a o nula.");
	}
}
