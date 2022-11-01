package relacion2;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {
		/*Una empresa maneja códigos numéricos 
		 * con las siguientes características:
		 * 
		 * 
		 *  Cada código consta de 4 dígitos. 
		 *  El primero representa una provincia. 
		 *  El segundo el tipo de operación. 
		 *  Los dos últimos el número de operación
		 * 
		 */
		
		
		
		int numero;
		int n1; 
		int n2;
		int n3; 
		
		
		//numero_operacion = numero - provincia * 100 - operacion * 10; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número de 4 dígitos: ");
		numero = sc.nextInt(); 
		
		

		
		if ((numero < 1000) || (numero > 9999)){
			System.out.println("Introduce un número de 4 cifras por favor");
		}else {
			n1= numero / 1000 % 10;
			n2 = numero / 100 % 10;
			n3 = numero - ((n1 * 1000) + (n2 * 100)); 
			System.out.println("El código de la provincia es: " + n1);
			System.out.println("El tipo de operación es: " + n2);
			System.out.println("El número de operación es: " + n3);
		}


		sc.close();
	}

}
