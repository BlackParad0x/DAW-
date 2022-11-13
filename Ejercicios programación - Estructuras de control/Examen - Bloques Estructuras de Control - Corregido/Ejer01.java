package examen;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		/**
		 * ALEJANDRO TERRONES PÉREZ
		 * 
		 * EJERCICIO 1
		 * 
		 * 
		 */

		int hora = 0, minuto = 0, segundo = 0, contadorSegundos = 1;


		Scanner sc = new Scanner (System.in);
		DecimalFormat patron = new DecimalFormat("00");

		System.out.println("\tRELOJ DIGITAL");



		
		// CORRECCION
		// if ((h<0) || (h<23) || (m<0) || (m>59) || (s>0) || (s<59))

		System.out.print("Dime la hora ");
		hora = sc.nextInt();
		if (hora >= 0 && hora <24) {
			
			System.out.print("Dime los minutos ");
		minuto = sc.nextInt();
		if (minuto >= 0 && minuto < 60) {
			System.out.print("Dime los segundos ");
			segundo = sc.nextInt();
			if (segundo >= 0 && segundo < 60) {
				do {
					segundo += 1;
					if (segundo == 60) {
						minuto += 1;
						segundo = 0;
						if (minuto == 60) {
							hora += 1;
							minuto = 0;
							if (hora == 24){
								hora = 0;
							}
						}
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("**********************************************************************");
					System.out.println("\thora: " + patron.format(hora)  + " | minutos: " + patron.format(minuto)  + " | segundos: "
					+  patron.format(segundo));
					System.out.println("**********************************************************************");
				
					contadorSegundos += 1;
				
				}while((segundo <= 60) && (contadorSegundos <= 5));
			
		
			
			
			System.out.println("Ya han pasado 5 segundos ");

				

			}else {
				System.out.println("NUMERO INCORRECTO");
			}
		}

		else {
			System.out.println("Números incorrecto");
		}
		}else {
			System.out.println("Número incorrecto");
		}

		
		
		
		
		
		
		
		

			
		

		
		
		sc.close();

	}
}



		
		


