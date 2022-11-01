package relacion2;

import java.util.Scanner;

public class Ejer41 {

	public static void main(String[] args) {
		/**
		 * 41. Introducir dos números inferiores a 50 y superiores a 0 por teclado. 
		 * Al más pequeño de ellos lo aumentamos de 5 en 5 y al más grande lo disminuimos de 2 en 2. 
		 * Imprimir ambas series alternativamente hasta que el menor supere al mayor
		 */
		
		byte numero1, numero2;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca límite inferior (entre 1 y 49): ");
		numero1 = sc.nextByte();
		System.out.println("Introduzca límite superior (entre 1 y 49): ");
		numero2 = sc.nextByte();
		
		
		// CREAR COMPROBACION NUMERO
		if (numero1 >= numero2) {
			System.out.println("Error, número 1 es mayor o igual que número 2");
		}else {
			while(numero1<numero2) {
				numero1 +=5;
				System.out.println("número inferior crece de cinco en cinco " + numero1);
				numero2 -=2;
				System.out.println("número superior decrece de dos en dos " + numero2);
			}
			
		}
		
		sc.close();

	}

}
