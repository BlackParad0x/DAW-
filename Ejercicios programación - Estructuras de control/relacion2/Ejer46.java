package relacion2;

import java.util.Scanner;

public class Ejer46 {

	public static void main(String[] args) {
		/*46. Con la ayuda de la clase Random, o bien el método 
		 * random de la clase Math, simular el lanzamiento de 
		 * una moneda al aire y visualizar por pantalla si ha 
		 * salido cara o cruz. Repetir el proceso tantas veces como 
		 * se quiera.
		 */
		
		double numero; 
		numero = Math.floor(Math.random() * 2 + 0);
		char pregunta;
		
		Scanner sc = new Scanner (System.in);
		
	
		
		//System.out.println((byte)Math.floor(Math.random() * 2 + 0));
		
		
		System.out.println("\tGenerador de lanzamiento de moneda");
		System.out.print("\t¿Desea lanzar la moneda  (S/N)? ");
		pregunta = sc.nextLine().charAt(0); 
		
		if (pregunta == 'S') {
			
		do {
			if (pregunta == 'S') {
				numero = Math.floor(Math.random() * 2 + 0);
				if (numero == 1) {
					System.out.println("\tCara");
				}else {
					System.out.println("\tCruz");
				}
			}
			
			sc.nextLine();
			
			System.out.print("\t¿Desea lanzar otra vez la moneda? ");
			pregunta = sc.nextLine().charAt(0);
		}
		while (pregunta != 'N');
		}
		
		System.out.println("\tFin del programa");
		
		sc.close();
		
	}

}
