package relacion2;

public class Ejer29 {

	public static void main(String[] args) {
		/**
		 * 29. Hacer un algoritmo para mostrar por pantalla 100 
		 * veces de una forma alternativa: Hola, Adiós
		 */

		 String cadena = "Hola";
		 String despedida = "Adiós";
		
		for(int cont = 1; cont <=50; cont +=1) {
			System.out.println(cadena);
			if (cadena == "Hola") {
				System.out.println(despedida);
			}
		}
		
	}

}
