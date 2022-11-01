package ejer11_21;

import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {
		// Realizar un programa que realiza y muestra las operaciones aritméticas básicas de dos números
		//pasados a nuestro programa. Las operaciones aritméticas básicas son, suma, resta, multiplicación y
		//división.
		
		double numero1;
		double numero2; 

		
		Scanner obLectura = new Scanner (System.in);
		
		System.out.println("Vamos a realizar operaciones aritméticas de dos números.");
		
		System.out.println("Introduce un número");
		numero1 = obLectura.nextDouble(); 
		
		System.out.println("Introduce el segundo número");
		numero2 = obLectura.nextDouble(); 
		
		
		System.out.println("");
		
		System.out.println(numero1 + numero2);
		System.out.println(numero1 - numero2);
		System.out.println( numero1 * numero2);
		System.out.println(numero1 / numero2);
		
		
		
		
		obLectura.close();
	}

}
