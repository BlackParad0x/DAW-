package relacion2;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {
		/*
		 * 13. Diseñar un algoritmo que lee un número y un valor entre 1 y 3, y en función de este último calcula:
		 * 1.- El cuadrado del número 
		 * 2.- El cubo del número 
		 * 3.- La raíz cuadrada del número
		 */
		int numero;

		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dime un número: ");
		numero = sc.nextInt(); 
		
		if ((numero >= 1) && (numero <=3)) {
			System.out.println("El cuadrado de " + numero + " es "+ Math.pow(numero, 2));
			System.out.println("El cubo de " + numero + " es "+Math.pow(numero, 3));
			System.out.println("La raiz cuadrada de " + numero + " es "+Math.sqrt(numero));
		}else {
			System.out.println("Número introducido incorrecto");
		}
		
		
		sc.close();
	}

}
