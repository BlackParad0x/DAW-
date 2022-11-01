package ejer01_10;

public class Ejer10 {

	public static void main(String[] args) {
		/**
		 * Cuando se vaya a asignar a una variable de tipo long 
		 * un valor grande habrá que ponerlo acabado en la letra L, por ejemplo 5000000000L 
		 * Esta letra indica que el valor debe ser tomado como long antes de ser 
		 * asignado a la variable. Si no ponemos esta indicación, 
		 * el valor numérico se toma como int (por defecto) 
		 * y el compilador muestra un error indicando que el número es demasiado grande para pertenecer a ese 
		 * tipo. Hacer la prueba con el siguiente ejemplo:
		 */

		int habitantesEnMadrid = (int) 4000000L;
		long habitantesEnElMundo = 5000000000L;
		System.out.println(habitantesEnElMundo);
		System.out.println(habitantesEnMadrid);

	}

}
