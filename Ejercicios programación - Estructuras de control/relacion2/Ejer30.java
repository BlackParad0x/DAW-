package relacion2;

import java.util.Scanner;

public class Ejer30 {

	public static void main(String[] args) {
		/**
		 * 30. Hacer un algoritmo para mostrar por pantalla 
		 * los números múltiplos de 3 que hay entre dos números 
		 * determinados, de forma alternativa.
		 */


		int numero1, numero2, producto = 0;

		Scanner sc = new Scanner (System.in);

		System.out.println("Calcular los multiplos de 3 entre dos numeros");
		System.out.println("Introduce el primero numero: ");
		numero1 = sc.nextByte();

		System.out.println("Dime otro número: ");
		numero2 = sc.nextByte(); 

		if (numero1<numero2) {
			while(producto < numero2) {
				producto = (numero1 * 3);
				numero1 += 1;
				System.out.println(producto);
			} 
		}
		else {
			System.out.println("Numeros introducidos incorrectos, numero1 tiene que ser menor que numero2");
		}


		sc.close();
	}
}
