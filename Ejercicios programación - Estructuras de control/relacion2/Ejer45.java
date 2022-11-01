package relacion2;

import java.util.Scanner;

public class Ejer45 {

	public static void main(String[] args) {
		/**
		 * 45. Hacer un algoritmo para que nos calcule la estadística 
		 * de una serie de notas introducidas por teclado. 
		 * La serie finalizará con la introducción del 0, sabiendo que: 
		 * 1 > Nota < 5 Deficiente 
		 * 5 >= Nota < 6 Suficiente 
		 * 6 >= Nota < 7 Bien 
		 * 7 >= Nota < 9 Notable 
		 * 9 >= Nota =< 10 Sobresaliente
		 */
		float nota =1;
		int deficiente = 0 , suficiente = 0, bien = 0 , notable = 0, sobresaliente = 0, contador = 0, porD, porS, porB, porN, porSo;
		
		Scanner sc = new Scanner (System.in);
		
		while (nota != 0) {
			System.out.print("\tIntroduce la calificación: ");
			nota = sc.nextFloat();
			contador += 1;
			if ((nota > 1) && (nota < 5)) {
				deficiente +=1;
			}
			else if ((nota >= 5) && (nota < 6)) {
				suficiente += 1;
			}
			else if ((nota >= 6) && (nota < 7)) {
				bien += 1;
			}
			else if ((nota >= 7) && (nota < 9)) {
				notable += 1;
			}
			else if ((nota >= 9) && (nota <= 10)) {
				sobresaliente += 1;
			}
			else if (nota > 10 || nota < 0){
				System.out.println("Número incorrecto");
				if (contador == 0) {}
				else {contador -= 1;}
			}
			
			porD = ((deficiente * 100 )/ contador);
			porS = ((suficiente * 100) / contador);
			porB = ((bien * 100) / contador);
			porN = ((notable * 100) / contador);
			porSo = ((sobresaliente) * 100 / contador);
			
			if (porD != 0) {
				System.out.println("Porcentaje deficientes " + porD);
			}
			if (porS != 0) {
				System.out.println("Porcentaje suficientes " + porS);
			}
			if (porB != 0) {
				System.out.println("Porcentaje bien " + porB);
			}
			if (porN != 0) {
				System.out.println("Porcentaje notables " + porN);
			}
			if (porSo != 0) {
				System.out.println("Porcentaje sobresalientes " + porSo);
			}
			
		}


		

		
		sc.close();


	}

}
