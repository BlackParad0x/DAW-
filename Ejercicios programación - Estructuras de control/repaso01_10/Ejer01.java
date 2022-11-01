package repaso01_10;

public class Ejer01 {

	public static void main(String[] args) {
		/**
		 * 1. Programa que calcule el cuadrado 
		 * de los 100 primeros números pares
		 */
		
		
		for (int cont = 2; cont <= 100; cont +=2){
			System.out.println("El cuadro de " + cont + " es " + ((int)Math.pow(cont, 2))); 
		}
		
	}

}
