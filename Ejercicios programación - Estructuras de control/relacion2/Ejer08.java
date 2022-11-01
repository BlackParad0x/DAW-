package relacion2;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {
		/**
		 * Realizar un algoritmo que lea dos valores desde teclado
		 * y diga si cualquiera de ellos divide de forma entera al otro.
		 */

		
		
		int numero1;
		int numero2;
		
		Scanner sc = new Scanner (System.in); 
		
		System.out.print("Introduce un número:	");
		numero1 = sc.nextInt(); 
		
		System.out.print("Introduce otro número:	");
		numero2 = sc.nextInt(); 
		
		if (numero1 % numero2 == 0) {
			System.out.print(numero1 + " puede dividir a " + numero2 + " y saca un valor entero");
		}else{
			if (numero2 % numero1 == 0){
			System.out.print(numero2 + " puede dividir a " + numero1 + " y saca un valor entero");
			}
			else{
				if (numero1 % numero2 != 0) {
					System.out.print(numero1 + " no puede dividir a " + numero2);
				}else {
					System.out.print(numero2 + " no puede dividir a " + numero1);
				}
			}
		}
		
		
		sc.close();}
	
}
