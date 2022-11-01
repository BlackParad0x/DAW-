package relacion2;

import java.util.Scanner;

public class Ejer32 {

	public static void main(String[] args) {
		/**32. Hacer un algoritmo para calcular el valor máximo y el valor 
		 * mínimo de una lista de números que se 
		 * introducen por teclado, se terminará la 
		 * operación cuando se introduzca el número 0, en este caso no 
		 * sabremos cuántos valores se van a introducir
		 */
		
		
		
		int numero = 1, mayor = numero, menor = numero;
		
		
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Introduce un número");
		numero = sc.nextInt();
		mayor = numero;
		menor = numero;
		
		while(numero != 0) {
			if (numero < menor) {
				menor = numero;
			}
			else if (numero > mayor) {
				mayor = numero;
			}
			
			System.out.println("Introduce un número");
			numero = sc.nextInt();

		}
		
		System.out.println("El número mayor es " + mayor);
		System.out.println("El número menor es " + menor);
		
		sc.close();

	}

}
