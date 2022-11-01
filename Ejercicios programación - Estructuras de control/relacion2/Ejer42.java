package relacion2;

import java.util.Scanner;

public class Ejer42 {

	public static void main(String[] args) {
		/**
		 * 42. Hacer un algoritmo para calcular si un número es primo o no. 
		 * En matemáticas, un número primo es un número natural mayor que 1 
		 * que tiene únicamente dos divisores positivos distintos: él mismo y el 1.
		 */
		
		byte primo;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("\tPrograma para calcular un número primo ");
		System.out.print("\tIntroduce un número: ");
		primo = sc.nextByte();
		
		if (primo > 1) {
			if ((primo % 2 !=0) && (primo % 3 != 0) && (primo % 5 != 0) && (primo % 7 != 0)) {
				System.out.println("\t" + primo + " es primo");
			}else {
				System.out.println("\t" + primo + " no es primo");
			}
		}else {
			System.out.println(primo + " es un número menor que 1");
		}
		
		
		sc.close();
	}

}
