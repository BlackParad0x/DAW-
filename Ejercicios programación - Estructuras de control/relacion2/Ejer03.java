package relacion2;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		/**
		 * Simplificar el siguiente segmento de algoritmo de forma que 
		 * se necesiten menos comparaciones:
		 */
		
		byte edad;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca su edad: ");
		edad = sc.nextByte();
		
		if ((edad >=18) && (edad < 65)){
			System.out.print("Activo");
		}else {
			System.out.print("Es menor de edad o jubilado");
		}
			
			
			
			
			
			
			
			
	sc.close();
	}
}
