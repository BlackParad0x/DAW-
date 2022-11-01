package relacion2;

import java.util.Scanner;

public class Ejer25 {

	public static void main(String[] args) {
		/**25. Programa que obtenga el cociente y el resto de dos números
		 *  enteros positivos mediante restas y sumas, no podéis utilizar
		 *   las operaciones de división (/) y de resto (%).
		 */
		
		int numero1, numero2, resto, cociente = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("\tPrograma para dividir dos números usando restas y sumas");
		System.out.print("\tIntroduce el primer número: ");
		numero1 = sc.nextInt();
		System.out.print("\tIntroduce el segundo número: ");
		numero2 = sc.nextInt();
		
		if ((numero1 == 0) || (numero2 == 0)){
			System.out.println("Math Error, no se puede usar el 0");

		}
		else if (numero1 < numero2){
			numero1 = numero2 + numero1;
			numero2 = numero1 - numero2;
			numero1= numero1 - numero2;
		}
		
		
		resto = numero1; 
		
		for (int cont = 1; resto >= numero2; cont ++)
		{
			cociente = cont;
			resto = resto - numero2;

		}
		
		if (numero1 != 0) {
		System.out.println("El cociente de dividir " + numero1 + " entre " + numero2 + " es " 
		+ cociente);
		System.out.println("El resto de la división es " + resto);
		}
		
		
		sc.close();
	}

}
