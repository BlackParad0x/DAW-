package relacion2;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {
		/**
		 * 4. Realizar un algoritmo que permita saber 
		 * si un número es mayor, menor o igual a cero.
		 * 
		 * 
		 */

		int numero;
		
		Scanner sc = new Scanner (System.in); 
		
		
		System.out.print("Introduce un número:	");
		numero = sc.nextInt();
		
		if(numero > 0){
			System.out.print("El número es positivo");
		}else{
			if(numero == 0){
				System.out.print("El número es igual a 0");
			}else {
				System.out.print("El número es negativo");
			}
		}
		
		sc.close(); 
	}

}
