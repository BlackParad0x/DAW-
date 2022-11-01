package ejer01_10;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {
		// - Realizar un programa para calcular el valor de la hipotenusa de un triángulo rectángulo aplicando el
		// teorema de Pitágoras. Se pedirán por teclado los dos catetos, y se mostrará por pantalla el resultado
		// de calcular la hipotenusa.

		float cateto1;
		float cateto2; 
		float hipotenusa; 
		Scanner cateto = new Scanner(System.in); 
		
		System.out.println("Introduzca el valor del primer cateto:	");
		cateto1 = cateto.nextFloat(); 
		
		System.out.println("Introduzca el valor del segundo cateto:	");
		cateto2 = cateto.nextFloat(); 
		
		hipotenusa = (float) Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		
		System.out.print("La hipotenusa es:  " + hipotenusa);
		 
		 
		
		cateto.close();
	}

}
