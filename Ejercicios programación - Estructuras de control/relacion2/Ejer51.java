package relacion2;

import java.util.Random;

public class Ejer51 {

	public static void main(String[] args) {
		/*51. Generar aleatoriamente una quiniela de una columna,
		 *  si la probabilidad de que salga 1 es del 50%, la x 
		 *  es del 30% y la del 2 es del 20%.
		 */
		int probabilidad50 = 1, probabilidad20 = 2;
		char probabilidad30 = 'X'; 
		Random azar = new Random();
		
		for (int cont = 1; cont <= 100; cont += 1) {
			int quiniela = (azar.nextInt(100)+1);
			
			if (quiniela >= 1 && quiniela <= 50){
				System.out.println("Encuentro nº " + cont + " : " + probabilidad50);
			}
			else if (quiniela >= 51 && quiniela <=81 ){
				System.out.println("Encuentro nº " + cont + " : " + probabilidad30);
			}
			else if (quiniela > 81 && quiniela <= 100){
				System.out.println("Encuentro nº " + cont + " : " + probabilidad20);
			}
			
		}
		
		
		
	}

}
