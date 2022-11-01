package relacion2;

import java.util.Scanner;

public class Ejer27 {

	public static void main(String[] args) {
		/**
		 * 27. Hacer un algoritmo para calcular el factorial de un 
		 * número natural positivo, se debe tener en cuenta si el número
		 *  no es positivo, ya que no existe el factorial de los números negativos.
		 */

		
		int numero;
		int producto = 1;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("El número es negativo no tiene factorial");
		}else {for (int cont = 1; cont <= numero; cont +=1) {
			producto = producto * cont;
		}System.out.println("El producto factorial de " + numero + 
				" es " + producto);
		}

		sc.close();
	}

}
