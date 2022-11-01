package relacion2;

import java.util.Scanner;

public class Ejer42b {

	public static void main(String[] args) {
		/**
		 * 42. Hacer un algoritmo para calcular si un número es primo o no. 
		 * En matemáticas, un número primo es un número natural mayor que 1 
		 * que tiene únicamente dos divisores positivos distintos: él mismo y el 1.
		 */
		
		byte numero, resto, primo = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número");
		numero = sc.nextByte();
		
		if (numero == 1){
			System.out.println("Primo");
		}
		else if (numero > 1){
			for (int cont = 2; cont <= numero; cont +=1) {
				resto = (byte) (numero % cont);
				if (resto != 0) {
				}
				else {
					primo += 1;
				}
			}
			if (primo > 1){
				System.out.println("No es primo");
			}else{
				System.out.println("Es primo");
			}
		}
		
		sc.close();

	}

}
