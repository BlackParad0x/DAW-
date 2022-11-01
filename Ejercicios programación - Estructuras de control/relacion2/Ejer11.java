package relacion2;

import java.util.Locale;
import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
		/*11. Implementar un programa que pida por teclado un número decimal
		 *  e indique si es un número casi-cero, que son aquellos positivos o negativos,
		 *   que se acercan a 0 por menos de 1 unidad, aunque curiosamente
		 *   el 0 no se considera un número casi cero. 
		 *   Ejemplos de números casi-cero son el 0,3, el -0,99 o el 0,123;
		 *   algunos números que no se consideran casi-ceros son: el 12,3, el 0 o el -1.
		 */
		
		
		float numero; 
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US); 
		
		System.out.println("Dime un número: ");
		numero =sc.nextFloat();  
		
		if ((numero > -1 && numero < 0) || (numero > 0 && numero < 1)) {
			System.out.println(numero + " es un número casi 0");
		}else {
			System.out.println(numero + " no es casi 0");
			}
		
		
		
		sc.close();
	}

}
