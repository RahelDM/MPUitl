package uo.mp2021.util.check;

import java.util.EmptyStackException;

public class EmptyStackCheck {	
	/**
	 * Comprueba si la condici�n es correcta. Si no lo es, lanza una excepci�n
	 * de tipo EmptyStackException
	 * @param condition
	 */
	public static void isTrue(boolean condition) {
		if (!condition) {
			throw new EmptyStackException();
		}
	}
	
}
