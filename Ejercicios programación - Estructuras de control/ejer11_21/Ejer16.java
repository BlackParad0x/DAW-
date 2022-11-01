package ejer11_21;

import java.util.Scanner;

public class Ejer16 {

	public static void main(String[] args) {
		/**
		 * Un programa tiene como entrada dos números y los almacena en las variables “u” y “v”
		 * ¿Qué hay que hacer par que al final del algoritmo
		 * los valores de las variables estén intercambiados? Diseña el 
		 * algoritmo correspondiente
		 */
		
		byte var1;
		byte var2;
		
		Scanner obLectura = new Scanner (System.in); 
		
		System.out.println("Dime un valor: ");
		var1 =  obLectura.nextByte(); 
		
		
		System.out.println("Dime otro valor: ");
		var2 =  obLectura.nextByte(); 
		
		var1 = (byte) (var1 + var2); 
		var2 = (byte) (var1 - var2); 
		var1 = (byte) (var1 - var2); 
		
		
		System.out.println("Ahora var1 vale " + var1 + " y var2 vale " + var2);
		
		
		
		
		obLectura.close(); 
	}
	
	
	
	

}
