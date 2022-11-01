package ejer11_21;

import java.util.Scanner;

public class ejer13 {

	public static void main(String[] args) {
		// Escribir un programa que convierta un número dado en 
		//segundos en el equivalente de minutos y segundos.
		
		
		int numero;
		int minutos;
		int segundos; 
		
		
		Scanner obLectura = new Scanner (System.in); 
		
		System.out.println("Convertidor de segundos a minutos");
		System.out.println("Escriba su cantidad de segundos:");
		numero = obLectura.nextInt();
		
		 minutos = numero / 60;
		 segundos = numero % 60 ; 
		
		
		System.out.print(minutos == 0?"Son " + numero + " segundos": (segundos == 0? minutos + " minutos.": minutos + " minutos " + segundos + " segundos"));
		

		
		obLectura.close();
	}

}
