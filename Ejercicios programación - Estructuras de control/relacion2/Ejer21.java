package relacion2;

import java.util.Scanner;

public class Ejer21 {

	public static void main(String[] args) {
		/**
		 * Programa que imprima la tabla de 
		 * multiplicar de un número entero (entre 1 y 10).
		 */

		
		byte numero;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("\tTabla de multiplicar");
		System.out.print("Introduzca un número por favor: ");
		numero =  sc.nextByte();
		
		System.out.println("\n\tLa tabla de multiplicar de " + numero);
		for (int cont = 1; cont <=10; cont +=1 ) {
			System.out.println(numero + " x " + cont + " = " + numero * cont);
		}
		
		
		sc.close();
	}

}
