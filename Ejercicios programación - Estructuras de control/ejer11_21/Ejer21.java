package ejer11_21;

import java.util.Scanner;

public class Ejer21 {

	public static void main(String[] args) {
		/**
		 * - Una empresa que gestiona un parque acuático nos solicita 
		 * una aplicación que les ayude a calcular el importe que hay 
		 * que cobrar en la taquilla por la compra de una serie de entradas 
		 * (cuyo número será introducido por el usuario). Existen dos tipos de 
		 * entradas: infantiles, que cuestan 15.50€, y de adultos que cuestan 20€. 
		 * En el caso de que el importe total sea igual o superior a 100€, 
		 * se aplicará automáticamente un bono descuento del 5%.
		 */
		
		short infantil;
		short adulto;

		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Inserte el numero de entradas de adulto ");
		adulto = sc.nextShort();
		
		System.out.println("Inserte el numero de entradas de niño ");
		infantil = sc.nextShort();
		
		short precio_infantil = (short) (infantil * 15.50); 
		short precio_adulto = (short) (adulto * 20); 
		short precio_total = (short) (precio_infantil + precio_adulto); 
	    short descuento = (short) (precio_total - 5); 
		
		System.out.println(precio_total >= 100? "Tienes que pagar " + descuento + " euros" : "Tienes que pagar " +  precio_total + " euros.");
		
		
		sc.close(); 
	}

}
