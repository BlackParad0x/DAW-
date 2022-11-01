package relacion2;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {
		/**
		 * Diseñar un algoritmo que nos permita saber el mayor
		 *  de dos números introducidos. Controlar el caso de
		 *  que sean iguales.
		 */
		
		
		int numero1;
		int numero2;
		
		Scanner sc = new Scanner (System.in); 
		
		
		System.out.print("Introduce un número:	");
		numero1 = sc.nextInt();
		
		System.out.print("Introduce otro número:	");
		numero2 = sc.nextInt();
		
		
		if(numero1 < numero2){
			System.out.print(numero1 + " es menor que " + numero2);
		}else{
			if(numero1 > numero2){
				System.out.print(numero1 + " es mayor que " + numero2);
			}else {
				System.out.print("Los números son iguales");
			}
		}
		
		sc.close(); 
	}

	}


