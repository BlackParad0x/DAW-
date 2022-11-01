package repaso01_10;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		/**3. Programa que determine cuantas cifras posee un número entero positivo 
		 * dado como entrada a nuestro programa por teclado. 
		 * Repetir el proceso cuantas veces se quiera.
		 */

		int numero, cifras = 1;
		char pregunta;

		Scanner sc = new Scanner (System.in);


		//System.out.print("¿Quieres introducir otro número? (S/N)");
		//pregunta = sc.nextLine().charAt(0);





		do{
			System.out.print("Introduce un numero ");
			numero = sc.nextInt();
			if (numero < 10) {
				System.out.println(numero + " tiene " + cifras + " cifra");
			}
			else{
				for (int cont = 10; cont <= numero; cont *= 10){
					cifras += 1; 
					if ((numero >= cont) && (numero < (cont * 10))){
						System.out.println(numero + " tiene " + cifras + " cifras");
					}
				}
			}

			sc.nextLine(); // limpiamos buffer
			System.out.println("¿Quieres introducir otro número? (S/N)");
			pregunta = sc.nextLine().charAt(0);

		}while(pregunta != 'N');

		System.out.println("Fin del programa");





		sc.close();
	}

}
