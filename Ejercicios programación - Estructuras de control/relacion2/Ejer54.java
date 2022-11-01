package relacion2;

import java.util.Scanner;

public class Ejer54 {

	public static void main(String[] args) {
		/**54. Diseñar un algoritmo que lee una lista de números enteros terminada en 0, 
		 * y que encuentre y escriba en pantalla la posición de la primera y última ocurrencia
		 *  del número 12 dentro de la lista. Si el número 12 no está en la lista, el algoritmo
		 *   debería escribir 0. Por ejemplo, si el octavo número de la lista es el único 12, 
		 *   entonces 8 sería la primera y la última posición de las ocurrencias de 12.
		 */
		
		int numero , contador = 1, ocurrencia = 0, mayor, menor;

		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Dime un número, para terminar pulsa 0 ");
		numero = sc.nextInt();
		
		if (numero == 0){
			System.out.println("No se introdujo ningún 12");
		}else {
			if (numero == 12){
				ocurrencia = 1;
			} 
			while(numero != 0) {
				System.out.print("Dime un número, para terminar pulsa 0 ");
				numero = sc.nextInt();
				contador += 1;
				if (numero == 12){
					ocurrencia = contador;
					mayor = ocurrencia; 
					menor = ocurrencia; 
					
					do{
						System.out.print("Dime un número, para terminar pulsa 0 ");
						numero = sc.nextInt();
						contador += 1;
						ocurrencia = contador;
						
						if (numero == 12){
							ocurrencia = contador; 
							System.out.println(ocurrencia);
							if (ocurrencia < menor) {
								menor = ocurrencia;
							}
							else if (ocurrencia > mayor) {
								mayor = ocurrencia;
							}
						}
						
						sc.nextLine();
					}
					
					while(numero !=0);
					System.out.println("La ocurrencia mayor del 12 es " + mayor);
					System.out.print("La ocurrencia menor del 12 es " + menor);
				}
			}
				
		}
		



		System.out.println("  ");
		System.out.print("Fin del programa");
		
		sc.close();

	}

}
