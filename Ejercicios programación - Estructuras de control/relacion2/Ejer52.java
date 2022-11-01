package relacion2;

import java.util.Random;
import java.util.Scanner;

public class Ejer52 {

	public static void main(String[] args) {
		/**52. Simular el lanzamiento de dos monedas un número 
		 * determinado de tiradas. Calcular cuántas caras y cuántas cruces han salido,
		 *  e imprimir el número mayor de tiradas consecutivas con dos caras.
		 */
		int moneda1, moneda2, suma, tiradas, cruz = 0, cara = 0, contCara = 0, mayor = 0, menor = 0, comparar = 0; 
		Scanner sc = new Scanner (System.in);
		Random azar1 = new Random();
		Random azar2 = new Random();

		System.out.print("¿Cuántas tiradas quieres haces?	 ");
		tiradas = sc.nextInt();

		for (int cont = 1; cont <= tiradas; cont +=1) {

			int intento1 = (azar1.nextInt(2)+ 0);
			moneda1 = intento1;
			int intento2 = (azar2.nextInt(2)+ 0);
			moneda2 = intento2;
			System.out.println(moneda1 + " " + moneda2);
			suma = moneda1 + moneda2; 

			if (suma == 2){
				cruz +=1; 
				contCara = 0;
			}
			else if (suma == 1){
				contCara = 0;
			}
			else if (suma == 0){
				cara += 1;
				if (cara >= 1){
					contCara += 1;
					comparar = contCara;
					if (comparar < menor){
						menor = comparar; 
					}
					else if (comparar > mayor){
						mayor = comparar; 
					}
				}
			}
		}
		
		System.out.println("Nº de cruces " + cruz);
		System.out.println("Nº de caras " + cara);
		System.out.print("Nº mayor caras consecutivas " + mayor);

		
		sc.close();
	}
}
