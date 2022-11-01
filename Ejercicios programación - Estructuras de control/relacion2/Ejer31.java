package relacion2;

import java.util.Scanner;

public class Ejer31 {

	public static void main(String[] args) {
		/**
		 * 31. Realizar un programa para calcular el valor máximo y el mínimo de una lista 
		 * de n números que se introducen por teclado, es decir, me indicarán cuántos valores 
		 * se van a introducir, y se pedirán por teclado los que nos hayan indicado
		 */

		
		int numero = 1, cantidadNum, cont = 0, mayor = numero, menor = numero;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos números vas a introducir: ");
		cantidadNum = sc.nextInt();
		
		System.out.println("Introduce un número");
		numero = sc.nextInt();
		mayor = numero;
		menor = numero;
		
		
		while(cont <= cantidadNum) {
			cont +=2;
			System.out.println("Introduce un número");
			numero = sc.nextInt();
			if (numero < menor) {
				menor = numero;
			}
			else if (numero > mayor) {
				mayor = numero;
			}

		}
		
		System.out.println("El número mayor es " + mayor);
		System.out.println("El número menor es " + menor);
		
		
		sc.close();
	}

}
