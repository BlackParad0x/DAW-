package relacion2;

import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {
		/**
		 * 14. Diseñar un algoritmo para leer las longitudes de los lados de un triángulo 
		 * y determine que tipo de triángulo es, de acuerdo o a los siguientes casos: 
		 * suponiendo que A es el mayor de los lados y que B y C corresponden a los otros 2 lados:
		 *  Si A >= B + C No es un triángulo 
		 *  Si A² = B² + C² Triángulo rectángulo 
		 *  Si A² > B² + C² Triángulo obtusángulo 
		 *  Si A² < B² + C² Triángulo acutángulo
		 */
		
		int longA;
		int longB;
		int longC;
		int suma;
		int aCuadrado;
		int bCuadrado;
		int cCuadrado;
		int cuaSuma;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el lado A: ");
		longA = sc.nextInt(); 
		System.out.println("Introduce el lado B: ");
		longB = sc.nextInt(); 
		System.out.println("Introduce el lado C: ");
		longC = sc.nextInt(); 
		
		suma = longB + longC;
		aCuadrado = (int) Math.pow(longA, 2); 
		bCuadrado = (int) Math.pow(longB, 2); 
		cCuadrado = (int) Math.pow(longC, 2); 
		cuaSuma =  bCuadrado + cCuadrado;
				

		
		if (longA >= suma) {
			System.out.println("No es un triángulo");
		}
		else if (aCuadrado == cuaSuma) {
			System.out.println("Es un triángulo rectánculo");
		} else if (aCuadrado > cuaSuma) {
			System.out.println("Es un triángulo obtusángulo");
		}else {
			System.out.println("Es un triángulo acutángulo");
		}
		
		
		
		sc.close();
	}

}
