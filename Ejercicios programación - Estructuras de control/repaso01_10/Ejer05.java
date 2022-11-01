package repaso01_10;

import java.util.Random;

public class Ejer05 {

	public static void main(String[] args) {
		/**5. Hacer un programa para averiguar la frecuencia relativa
		 *  con la que saldría cada uno de los números de un dado si
		 *   lanzáramos éste 1000 veces.
		 */
		
		int cara1 = 0, cara2 = 0, cara3 = 0, cara4 = 0, cara5 = 0, cara6 = 0, cont = 0;
				
		float frecuencia1, frecuencia2, frecuencia3, frecuencia4, frecuencia5, frecuencia6;
		
		Random azar = new Random();
		
		
		do {
			int dado = (azar.nextInt(6)+1);
			cont +=1;
			switch(dado){
			case 1 : cara1 += 1;break;
			case 2 : cara2 += 1;break;
			case 3 : cara3 += 1;break;
			case 4 : cara4 += 1;break;
			case 5 : cara5 += 1;break;
			case 6 : cara6 += 1;break;
			
			}
			
			
			
		}while(cont <= 1000);
		

		frecuencia1 = (float) cara1/1000;
		frecuencia2 = (float) cara2/1000;
		frecuencia3 = (float) cara3/1000;
		frecuencia4 = (float) cara4/1000;
		frecuencia5 = (float) cara5/1000;
		frecuencia6 = (float) cara6/1000;
		
		System.out.println("La frecuencia de 1 es " + frecuencia1);
		System.out.println("La frecuencia de 2 es " + frecuencia2);
		System.out.println("La frecuencia de 3 es " + frecuencia3);
		System.out.println("La frecuencia de 4 es " + frecuencia4);
		System.out.println("La frecuencia de 5 es " + frecuencia5);
		System.out.println("La frecuencia de 6 es " + frecuencia6);
		
		}
	}

