package relacion2;

import java.util.Scanner;

public class Ejer33 {

	public static void main(String[] args) {
		/**
		 * 33. Hacer un algoritmo para calcular de forma automática 
		 * las n primeras potencias de un número A. Se introducen por teclado 
		 * los números n (exponente) y A (base)
		 */
		
		int base, exponente, operacion;
		Scanner sc = new Scanner(System.in); 
		
		System.out.println();
		System.out.println("Introduce la base: ");
		base = sc.nextInt();
		System.out.println("Introduce el exponente: ");
		exponente = sc.nextInt();
			
		for(int cont=1; cont <= exponente; cont += 1) {
			operacion = (int) Math.pow(base, cont);
			System.out.println(base + " elevado a " + cont + " : " + operacion);
		}
		
		sc.close();
	}

}
