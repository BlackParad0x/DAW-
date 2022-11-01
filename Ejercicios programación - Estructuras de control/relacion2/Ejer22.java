package relacion2;

import java.util.Scanner;

public class Ejer22 {

	public static void main(String[] args) {
		/**22. Programa que calcula la media aritmética de una 
		 * serie de números introducidos por teclado, que finaliza 
		 * con la introducción del valor 0.
		 */

		
		int numero = 1;
		int suma = 0; 
		int media = 0;
		//byte sumaNum; 
		Scanner sc = new Scanner (System.in);
		
		
		
		
		for (int cont = 1; numero != 0;  cont +=1 ) {
			System.out.println("Dime un número");
			numero = sc.nextByte();
			suma = suma + numero; 
			media = suma/cont;

		}
		System.out.println(suma);
		System.out.println("\tLa media aritmética \n "
				+ "\tde los números introducidos es " + media);	
		
		
		sc.close(); 
	}
}
