package relacion2;

import java.util.Random;

public class Ejer47 {

	public static void main(String[] args) {
		/**47. Simular 100 tiradas de un dado y 
		 * contar las veces que aparece el nº 6.
		 */

		int contDado = 0;

		Random azar = new Random();
		System.out.println("Vamos a contar cuantas veces va a aparecer el 6 al tirar un dado");
		
		for (int cont = 0; cont <= 100; cont +=1) {
			int dado = (azar.nextInt(6)+1);
			System.out.println("\t"+dado);
			if (dado == 6) {
				contDado += 1;
			}
		}

	
		System.out.println("----EL DADO SE HA TIRADO 100----");
		System.out.println("El 6 ha salido " + contDado + " veces.");
	}

}
