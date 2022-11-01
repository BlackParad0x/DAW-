package ejer01_10;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {
		//  4.- Diseñar una aplicación que calcule la longitud y el área de una circunferencia. Para ello el usuario debe
		//introducir el radio (que puede contender decimales)
		// longitud = 2 . π . radio area = π . radio2
		// mathpow 
		
		// Definición de una constate para PI
		// final float PI = 3.14f
		// final es para indicar que es constante, no podemos reasignarle un valor
		/**
		 * PI = ejer.nextFloat(); 
		 * 
		 */
		Scanner ejer = new Scanner(System.in);
		float radio; 
		
		System.out.println("Dime el radio de tu circunferencia");
		radio = ejer.nextFloat(); 
		
		
		System.out.println("CALCULAR LONGITUD: ");
		System.out.println("longitud: 2 . 3.14 . radio:  " + (2 * Math.PI  * radio)); 
		System.out.println("     ");
		System.out.println("CALCULAR AREA: ");
		System.out.println("area: 3.14 . radio^2  " + ( Math.PI  * Math.pow(radio, 2))); 
		
		
		
 
		ejer.close();
	}

}
