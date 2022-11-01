package relacion2;

import java.util.Scanner;

public class Ejer23 {

	public static void main(String[] args) {
		/**
		 * Hacer un algoritmo que nos sume los números naturales, 
		 * comprendidos entre dos números introducidos
		 * por teclado, debéis tener en cuenta si el primero 
		 * e los números no es más pequeño que el segundo
		 */

		int num1, num2;
		int sum = 0;
		//int cont;
		Scanner sc =  new Scanner(System.in);
	
		
		System.out.println("Dime el número 1");
		num1 = sc.nextInt();
		System.out.println("Dime el número 2");
		num2 = sc.nextInt();
		
	 
		
		if (num1 < num2) {
		for (int cont = num1 ; cont >= num1 && cont <= num2;cont +=1)			
			sum = sum + cont;
			System.out.println("La suma total entre " + num1 + " y " + num2 + " es " + sum);
		}else {
			System.out.println("Por favor introduce el primer número mayor que el segundo");
		}

		
		
		
		
		sc.close();
		
	}

}
