package relacion2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejer49 {

	public static void main(String[] args) {
		/**
		 * 49. Hacer un algoritmo que simule el funcionamiento de un reloj digital y 
		 * que nos permita ponerlo en hora, es decir, al comenzar a ejecutar el programa
		 *  nos preguntará si deseamos ponerlo en hora, si respondemos sí, nos pedirá la 
		 *  hora, minutos y segundos de partida, si respondemos no, comenzaremos en la 00:00:00.
		 *   Este algoritmo nunca finalizará.
		 */
		
		int hora = 0, minuto = 0, segundo = 0;
		char pregunta;
		
		Scanner sc = new Scanner (System.in);
		DecimalFormat patron = new DecimalFormat("00");
		
		System.out.println("\tRELOJ DIGITAL");
		
		System.out.print("¿Quiéres poner el reloj en hora? ");
		pregunta = sc.nextLine().charAt(0);
		
		if (pregunta == 'S') {
			System.out.print("Dime la hora ");
			hora = sc.nextInt();
			if (hora >= 0 || hora <24) {
			}
			else {
				System.out.println("HORA");
			}
			System.out.print("Dime los minutos ");
			minuto = sc.nextInt();
			if (minuto >= 0 || minuto > 60) {
			}
			else {
				System.out.println("Números incorrecto");
			}
			System.out.print("Dime los segundos ");
			segundo = sc.nextInt();
			if (segundo >= 0 || segundo < 60) {

			}
			
		}
		else {
			hora = 0;
			minuto = 0; 
			segundo = 0;
			
		}
		
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
		}while(segundo <= 60);

		
		
		
		sc.close();
  }
}
