package relacion2;

import java.util.Scanner;

public class Ejer24 {

	public static void main(String[] args) {
		/**24. Programa que calcule el producto de dos 
		 * números enteros positivos mediante sumas
		 *  sucesivas, no podéis utilizar la operación 
		 *  de multiplicación.
		 */

		int num1, num2;
		int suma = 0; 
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Calculadora que multiplica");
		System.out.println("Introduce un número positivo");
		num1 = sc.nextInt();
		
		System.out.println("Introduce otro número positivo");
		num2 = sc.nextInt();
		
		for(int cont= 1; cont <= num2;cont +=1) {
			suma = suma + num1;
		}
		System.out.println("El producto de " + num1 + " x " + num2 + " es: " + suma );
		
		
		sc.close();
	}

}
