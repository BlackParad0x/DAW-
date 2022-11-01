package repaso01_10;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		/**2. Diseñar un programa para determinar 
		 * si un número entero es múltiplo de 3, 4 o 5.
		 */
		
		int numero;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Programa para calcular si un número"
				+ "es múltiplo de 3, 4 o 5");
		
		System.out.print("Introduce un número: ");
		numero = sc.nextInt();
		
		if (numero % 60 == 0){
			System.out.println(numero + " es múltiplo de 3, 4 y 5");
		}
		else if (numero % 12 == 0){
			System.out.println(numero + " es múltiplo de 3 y de 4");
		}
		else if (numero % 15 == 0){
			System.out.println(numero + " es múltiplo de 3 y de 5");
		}
		else if (numero % 20 == 0){
			System.out.println(numero + " es múltiplo de 4 y 5");
		}
		else if (numero % 3 == 0){
			System.out.println(numero + " es múltiplo de 3");
		}
		else if (numero % 4 == 0){
			System.out.println(numero + " es múltiplo de 4");
		}
		else if (numero % 5 == 0){
			System.out.println(numero + " es múltiplo de 5");
		}
		else{
			System.out.println("No es mútiplo ni de 3, 4 o 5");
		}
		
		System.out.print("Fin del programa");
		sc.close();
	}

}
