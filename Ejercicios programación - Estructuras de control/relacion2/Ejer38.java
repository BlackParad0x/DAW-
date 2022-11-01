package relacion2;

import java.util.Scanner;

public class Ejer38 {

	public static void main(String[] args) {
		/**38. Realizar un algoritmo con un menú de 4 opciones.
		 *  La selección de cada opción se realizará usando una variable de tipo carácter.
		 *   Cada una de las opciones realizará las siguientes tareas: 
		 *   F: Calculará el factorial. 
		 *   R: Calculará la raíz cuadrada de un número 
		 *   si es positivo y si es negativo, dará un mensaje de error.
		 *   C: Calculará el cuadrado de un número.
		 *   T: Finalizará el algoritmo. 
		 */

		char orden; 
		int numero , producto = 1;
		
		Scanner sc =  new Scanner (System.in);
		
		System.out.println("Menú");
		System.out.println("\t F: Calculará el factorial. ");
		System.out.println("\t R: Calculará la raíz cuadrada de un número  si es positivo y si es negativo, "
				+ "dará un mensaje de error. ");
		System.out.println("\t C: Calculará el cuadrado de un número. ");
		System.out.println("\t T: Finalizará el algoritmo. ");
		
		do {System.out.println("Introduce una opcion");
			orden = sc.next().charAt(0);
			
			if (orden == 'F') {
				System.out.println("Calcular factorial");
				System.out.println("Introduce un número");
				numero = sc.nextInt();
				for (int cont = 1; cont <= numero; cont +=1) {
					producto = producto * cont;
				}
				System.out.println("El factorial de " + numero + " es " + producto);
			}
			else if (orden == 'R') {
				System.out.println("Vamos a calcular la raiz cuadrada");
				System.out.println("Introduce un numero");
				numero = sc.nextInt();
				if (numero >= 0) {
					System.out.println("La raiz cuadrada de " + numero + 
							" será " + Math.sqrt(numero) );
				}else {
					System.out.println("El número introducido es menor que 0");
				}
			}
			else if (orden == 'C') {
				System.out.println("Vamos a calcular el cuadrado de un número");
				System.out.println("Introduce el número: ");
				numero = sc.nextInt();
				System.out.println("El cuadrado de " + numero + " es " +
						Math.pow(numero, 2));
			}
		}while(orden != 'T');
		System.out.println("Aplicación cerrada");
		
		sc.close();
	}
	


}
