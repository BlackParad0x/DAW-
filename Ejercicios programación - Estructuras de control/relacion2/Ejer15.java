package relacion2;

import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {
		/**
		 * 15. Programa que lea 3 números de teclado y
		 * y los muestre en pantalla de forma ordenada.
		 */

		int num1, num2, num3;  
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Introduce el primer número");
		num1 = sc.nextInt(); 
		System.out.println("Introduce el segundo número");
		num2 = sc.nextInt(); 
		System.out.println("Introduce el tercer número");
		num3 = sc.nextInt(); 
		
		
		if ((num1 > num2 && num1 > num3) && (num2 > num3)) {
			System.out.println(num1 +  " > " + num2 + " > " + num3);
		}
		else if ((num1 > num2 && num1 > num3) && (num3 > num2)) {
			System.out.println(num1 +  " > " + num3 + " > " + num2);
		}
		else if ((num2 > num1 && num2 > num3) && (num1 > num3)) {
			System.out.println(num2 +  " > " + num1 + " > " + num3);
		}
		else if ((num2 > num3 && num2 > num1) && (num3 > num1)) {
			System.out.println(num2 + " > " + num3 + " > " + num1);
		}
		else if ((num3 > num2 && num3 > num1) && (num2 > num1)) {
			System.out.println(num3 + " > " + num2 + " > " + num1);
		}
		else if ((num3 > num2 && num3 > num1) && (num1 > num2)) {
			System.out.println(num3 + " > " + num1 + " > " + num2);
		}
		else if ((num1 == num2 && num1 == num3) && (num2 == num3))
		{
			System.out.println("Todos los números son iguales");
			}
		else if ((num1 == num2) && (num1 > num3)) {
			System.out.println(num1 + " y " + num2 + " son iguales y mayores que " + num3);
		}
		else if ((num2 == num3) && (num2 > num3)) {
			System.out.println(num1 + " y " + num2 + " son iguales y mayores que " + num3);
		}
		else if ((num1 == num2) && (num1 < num3)) {
			System.out.println(num1 + " y " + num2 + " son iguales y menores que " + num3);
			}
		else if ((num2 == num3) && (num2 < num3)) {
			System.out.println(num1 + " y " + num2 + " son iguales y menores que " + num3);
		}
		else {
			System.out.println("Fin del programa");
		}
		
		
	
	
		
		
		
		
		
		sc.close(); 
		
	}

}
