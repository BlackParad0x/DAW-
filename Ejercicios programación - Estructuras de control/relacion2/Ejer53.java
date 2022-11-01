package relacion2;

import java.util.Scanner;

public class Ejer53 {

	public static void main(String[] args) {
		/**53. Diseñar un algoritmo que determine si la cadena “abc”
		 * , aparece en una sucesión de caracteres cuyo final 
		 * viene dado por un punto. 
		 * No se lee una cadena, 
		 * sino caracteres sueltos.
		 */
		
		char letra = 'i';
		int contA = 0, contB = 0, contC= 0, suma, veces = 0;
		
		Scanner sc = new Scanner (System.in);
		
		 do{{
			System.out.println("Dame un carácter");
			letra = sc.next().charAt(0);

			if (letra == 'a') {
				contA +=1; 
				System.out.println(contA);
			}
			else if (contA >= 1 & letra == 'b'){
				contB +=1;
				System.out.println(contA);
				System.out.println(contB);
			}
			else if (contB >= 1 & letra == 'c' ){
				contC +=1;
				System.out.println(contA);
				System.out.println(contB);
				System.out.println(contC);
			}
			else if(contC >= 1){
				suma = contA + contB + contC;
				veces += 1;
			}
			else if ((letra != 'a' && letra != 'b') && (letra != '.')){
				contA = 0;
				contB = 0;
				contC = 0;
				System.out.println(contA);
				System.out.println(contB);
				System.out.println(contC);
			}
			suma = contA + contB + contC;
			
		}
		}while (letra != '.');
		if (suma >= 3){
			System.out.println("Esta la cadena 'abc' y apareción " + veces + " veces");
		}else {
			System.out.println("No aparece la cadena 'abc' ");
		}
		
		
		
		sc.close();
	}

}
