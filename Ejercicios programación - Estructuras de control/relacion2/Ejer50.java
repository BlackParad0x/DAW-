package relacion2;

import java.util.Random;

public class Ejer50 {

	public static void main(String[] args) {
		/**50. Simular el lanzamiento de una moneda al aire 
		 * y que pare cuando salgan 3 caras consecutivas. Visualizar 
		 * el número de tiradas realizadas.
		 */
		
		int contDado = 0, moneda = 0, suma = 0;

		Random azar = new Random();

		System.out.println("Vamos a lanzar una moneda al aire, pararemos"
				+ " despúes de sacar 3 caras seguidas ");
		
		do {
				
			
				int intento = (azar.nextInt(2)+ 0);
				moneda = intento;
				contDado += 1;
				System.out.println(moneda);
				if (moneda == 0){
					suma = 0;
				}else{
					suma = suma + moneda; 
				}
				
		
		}while(suma != 3);
		
		
		
		System.out.println("Se han sacado 3 caras seguidas, después"
				+ "de lanzar la moneda " + contDado + " veces");
		



	}

}
