package relacion2;

import java.util.Scanner;

public class Ejer34 {

	public static void main(String[] args) {
		/**34. Hacer un algoritmo que calcule la suma de la serie de
		 *  Fibonacci para un término n que se introduce por teclado. 
		 *  La serie de Fibonacci tiene la siguiente expresión:
		 */

		int fib1 = 1, fib2 = 1, fibaux = 0, numero;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("\tSERIE DE FIBONACCI");
		
		System.out.println("Introduce un numero");
		numero = sc.nextInt();
		
		
		for (int i=2; i <=numero; i++) {
			fibaux = fib1 + fib2;
			fib1 = fib2;
			fib2 = fibaux;
		}
		
		System.out.println("La serie de Fibonacci del numero " + 
		numero + " es " + fibaux);
		
		
		sc.close(); 
	}

}
