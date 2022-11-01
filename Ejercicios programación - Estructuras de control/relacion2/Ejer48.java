package relacion2;

import java.util.Random;

public class Ejer48 {

	public static void main(String[] args) {
		/**48. Simular 100 tiradas de 2 dados
		 *  y contar las veces que entre los dos suman 10
		 */
		
		int sumaDado, contDado = 0;
		
		Random azar = new Random();
	
		
		System.out.println("Vamos a lanzar dos dados a la vez 100 veces");
		System.out.println("Vamos a contar cuantas veces suman 10");
		
		for (int cont = 0; cont <= 50; cont +=1) {
			int dado = (azar.nextInt(6)+1);
			System.out.println("\t"+dado);
			int dado1 = (azar.nextInt(6)+1);
			System.out.println("\t"+dado1);
			sumaDado = dado + dado1;
			if (sumaDado == 10) {
				contDado += 1;
				System.out.println("\tSuman 10");
			}
		}
		
		System.out.println("Los dados han sumado 10 " + contDado + " veces");

	}

}
