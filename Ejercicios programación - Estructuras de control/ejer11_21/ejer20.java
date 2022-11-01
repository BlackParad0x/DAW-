package ejer11_21;

import java.util.Scanner;

public class ejer20 {

	public static void main(String[] args) {
		/**Un biólogo está realizando un estudio de distintas especies de invertebrados y 
		 * necesita una aplicación que le ayude a contabilizar el número de 
		 * patas que tienen en total todos los 
		 * animales capturados durante una jornada de trabajo.
		 * Para ello, nos ha solicitado una aplicación a la que hay que proporcionar:
		 *  El número de hormigas capturadas (6 patas)
		 *  El número de arañas capturadas (8 patas).
		 *  El número de cochinillas capturadas (14 patas).
		 * 
		 * 
		 * 
		 * La aplicación debe mostrar el número total de patas.
		 */
		
		
		
		short hormigas;
		short spider;
		short cochinillas;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el nº de hormigas capturadas:");
		hormigas = sc.nextShort();
		
		System.out.println("Introduce el nº de arañas capturadas:");
		spider = sc.nextShort();
		
		System.out.println("Introduce el nº de cochinillas capturadas:");
		cochinillas = sc.nextShort();
		
		short patashormigas = (short) (hormigas * 6);
		short pataspider = (short) (spider * 8);
		short patascochinillas = (short) (cochinillas * 14);
		short patas = (short) (patashormigas + pataspider + patascochinillas); 
		
		System.out.println("Has capturado " + hormigas + " hormigas " + spider + " arañas "+ cochinillas + " cochinillas.");
		System.out.print("En total son " + patas + " patas.");
		
		
		
		
		
		sc.close(); 
	}

}
