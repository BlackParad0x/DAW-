package relacion2;

import java.util.Scanner;

public class Ejer28 {

	public static void main(String[] args) {
		/**
		 * 28. Hacer un algoritmo que imprima, sume y cuente los números pares
		 *  que hay entre dos números determinados, debéis tener en cuenta si
		 *   el primero de los números no es más pequeño que el segundo
		 */

		int numero1, numero2;
		int par = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Dime un número: ");
		numero1 = sc.nextInt();
		System.out.println("Dime un número: ");
		numero2 = sc.nextInt();
		
		
		if (numero1 > numero2) {
			System.out.println("Error " + numero1 + " es mayor que " + numero2);
		}else {
			for (int cont = numero1 + 1; ((cont>numero1) && (cont<numero2)); cont += 1) {
				par = par + cont;
				if (par % 2 == 0) {	
				System.out.println(par);}
				else {
					System.out.println(par + " no es par");
				}
			}
		}
		
		sc.close();
		
	}

}
