package relacion2;

import java.util.Scanner;

public class Ejer35 {

	public static void main(String[] args) {
		/**35. Hacer un algoritmo que calcule el valor de un número combinatorio a
		 *  partir de dos valores, a y b, que se introducen por teclado, 
		 *  aplicando la siguiente fórmula:
		 */
		
		
		int numero1, numero2, diferencia, producto1 = 1, producto2= 1, producto3 = 1, producto4, division;
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Introduce un número: ");
		numero1 = sc.nextInt();
		System.out.println("Introduce otro número");
		numero2 = sc.nextInt();
		
		if ((numero1 >= numero2) && (numero1 >= 0) && (numero2 >=0)) {
			for (int cont = 1; cont <= numero1; cont +=1) {
				producto1 = producto1 * cont;}
			for (int cont = 1; cont <= numero2; cont +=1) {
				producto2 = producto2 * cont;}
			diferencia = numero1 - numero2;
			for (int cont = 1; cont <= diferencia; cont +=1) {
				producto3 = producto3 * cont;}
			
			producto4 = producto2 * producto3;
			division = producto1/producto4;
			
			System.out.println("El número combinatorio de " + numero1 + " y " + numero2 + " es " + division);
		}else {
			System.out.println(numero1 + " es menor que " + numero2 + " y que 0");
		}
		



		sc.close();
	}

}
