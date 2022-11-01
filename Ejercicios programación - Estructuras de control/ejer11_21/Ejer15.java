package ejer11_21;

import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {
		// - Diseñar un algoritmo que a partir de la base y 
		//la altura de un triángulo muestre como resultado su
		// superficie. (superficie = b · h / 2).
		
		
		float altura;
		float base; 
		double superficie; 
		Scanner obLectura = new Scanner (System.in); 
		
		System.out.print("Introduce la medida de la base: ");
		altura = obLectura.nextFloat(); 
		
		System.out.print("Introduce la longitud de la altura: ");
		base = obLectura.nextFloat(); 
		
		superficie = ((altura * base)/ 2) ;
		
		System.out.println("La superficie de nuestro triángulo rectángulo es: " + superficie + " metros cuadrados.");
		
		
		
		
		
		obLectura.close(); 
	}

}
