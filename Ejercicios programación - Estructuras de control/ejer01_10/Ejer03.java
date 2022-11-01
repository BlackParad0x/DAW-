package ejer01_10;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		// Realizar un programa que calcule la media aritmética 
		//de tres valores que se han leído de teclado, y muestre el resultado por pantalla.
		
		
		Scanner ejer = new Scanner(System.in); 
		
		float numero_1; 
		float numero_2;
		float numero_3; 
		float suma;
		float media; 
		
		System.out.println("Vamos a calcular la media aritmetica de tres numeros");
		
		System.out.println("Dime un número:"	); 
		numero_1 = ejer.nextFloat(); 
		
		System.out.println("Dime otro número:	");
		numero_2 = ejer.nextFloat();
		
		System.out.println("Dime el número:	");
		numero_3 = ejer.nextFloat();
		
		suma = numero_1 + numero_2 + numero_3;  
		media = (suma/3); 
		// media = suma / 3.0;
		// media = suma / 3f;
		// media = suma / (double)3;
		// media = suma / (float)3;
		// media = (double)(suma/3);
		
		
		System.out.println("La media aritmetica de " + (numero_1) + " de " + (numero_2) + " de " + (numero_3) + " es: " + (media)); 
		
		
		
		ejer.close(); 
	}

}
