package relacion2;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {
		/*
		 * 7. Hacer un algoritmo para ver si un número
		 *  introducido por teclado es par o impar
		 */
		
		int numero;
		
		Scanner sc = new Scanner (System.in); 
		
		System.out.print("Vamos a comprobar si tu numero introducido es par o impar:	");
		numero = sc.nextInt(); 
		
		if (numero % 2 == 0) {
			System.out.print("El número es par");
		}
		else {
			System.out.print("El número es impar");
		}
		
		
		
		
		sc.close();

	}

}
