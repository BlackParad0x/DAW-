package relacion2;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		/**
		 * Realizar un algoritmo para deducir el 
		 * mayor de tres valores introducidos por teclado.

		 */

		int num1;
		int num2;
		int num3;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dime numero ");
		num1 = input.nextInt();
		System.out.println("Dime otro numero ");
		num2 = input.nextInt();
		System.out.println("Dime numero más");
		num3 = input.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " es mayor que " + num2 + " y " + num3);
		}else {
			if (num2 > num1 && num2 > num3) {
				System.out.println(num2 + " es mayor que " + num1 + " y " + num3 );	
			}else {
				System.out.println(num3 + " es mayor que " + num1 + " y " + num2 );	
			}
		}

		
		
		
		input.close();
	}

}
