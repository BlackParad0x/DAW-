package relacion2;

import java.util.Scanner;

public class Ejer36 {

	public static void main(String[] args) {
		/**
		 * 36. Realizar un programa que cuente los números positivos y negativos 
		 * que aparezcan en una lista de números que se introducen por teclado. 
		 * El proceso finalizará introduciendo el número 0.
		 */
		
		
		int numero = 1, positivo = 0, negativo = 0;
		
		Scanner sc =  new Scanner (System.in);
		
	
		do {
			System.out.println("Introduce números positivos o negativos, para finalizar el programa, introduce el 0: ");
			numero = sc.nextInt();
			if (numero > 0){
				positivo +=1;
			}
			if (numero < 0) {
				negativo +=1 ;
			}

		}
		
		while (numero!= 0);
		
		System.out.println("Se han introducido " + positivo + " numeros positivos");
		System.out.println("Se han introducido " + negativo + " numeros negativos");
		sc.close();

	}

}
