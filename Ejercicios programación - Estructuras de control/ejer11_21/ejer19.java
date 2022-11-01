package ejer11_21;

import java.util.Scanner;

public class ejer19 {

	public static void main(String[] args) {
		/**
		 * Convertir un tiempo expresado en segundos a un formato que 
		 * lo represente a horas, minutos y segundos
		 * 
		 */

		int segundos, minutos, horas, segundoaminutos, restosegundos;

		Scanner sc = new Scanner (System.in);


		System.out.println("\tTiempo de segundos, que representa horas, min y segundos");
		System.out.print("\tIntroduce los segundos   ");
		segundos = sc.nextInt();

		if (segundos < 60){
			System.out.print("\t 0 Horas - 0 Minutos - Segundos " + segundos);
		}
		else  {
			segundoaminutos = (int) (segundos/60);
			restosegundos = (int) (segundos%60); 
			horas = (int) (segundoaminutos/60);
			minutos = (int) (segundoaminutos%60);
			
			
			if (segundoaminutos > minutos ){
				System.out.println("MINUTOS: " + segundoaminutos + " SEGUNDOS: " + restosegundos);
			}
			
			
			
			else if (minutos < segundoaminutos){
				System.out.println("HORAS: " + horas + " MINUTOS: " + minutos + " SEGUNDOS: " + restosegundos);
			}
			
			}

		

		
		
	
		sc.close();
	}

}
