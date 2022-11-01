package relacion2;

import java.util.Scanner;

public class Ejer37 {

	public static void main(String[] args) {
		/**37. Realizar un algoritmo que calcule la media aritmética de una lista
		 *  de números que se introducen por teclado. El proceso finalizará con la 
		 *  introducción del número 0 y se usará en la media el valor absoluto de los números negativos, 
		 *  si ya lo hicisteis en el ejercicio 22, no es necesario que lo volváis a hacer.
		 */
		
		int numero = 1;
		int suma = 0; 
		float media = 0;
		int positivo = 0, cont = 0; 
		//byte sumaNum; 
		Scanner sc = new Scanner (System.in);
		
		do{
			System.out.println("Dime un número");
			numero = sc.nextByte();
			cont += 1;
			
			if (numero == 0){
				cont -= 1;
			}
			
			if (numero < 0){
				positivo = (numero * -1);
				numero = positivo;
			}
			
			suma = suma + numero; 
			
		} 
		while (numero != 0);
		
		media = (float) suma/cont;

		System.out.println(suma);
		System.out.println("\tLa media aritmética \n "
				+ "\tde los números introducidos es " + media);	
		
		
		sc.close();
	}

}
