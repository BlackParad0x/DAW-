package repaso01_10;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {
		/**4. Calcular la última cifra del cuadrado de un número y el número de cifras.
		 * 
		 * 
		 */
		int numero, cifras = 1, cuadrado, ultimaCifra = 0, restaUnidades, cuadradoUltimaCifra = 0;
		
		try (Scanner sc = new Scanner (System.in)) {
			System.out.print("Introduce un numero ");
			numero = sc.nextInt();
			if (numero < 10) {
				System.out.println(numero + " tiene " + cifras + " cifra");
				
				System.out.print("Su cuadrado es: ");
				cuadrado = (int) Math.pow(numero, 2);
				System.out.print(cuadrado);
			}
			else{
				for (int cont = 10; cont <= numero; cont *= 10){
					cifras += 1; 
					if ((numero >= cont) && (numero < (cont * 10))){
						System.out.println(numero + " tiene " + cifras + " cifras");
						
					}
				}
				
				System.out.println("Ahora vamos a calcular el cuadrado de la última cifra");
				for (;cifras >= 1;cifras -= 1){
					restaUnidades = (int)Math.pow(10, cifras);
					ultimaCifra = numero;
					ultimaCifra = ultimaCifra % restaUnidades;
					cuadradoUltimaCifra = (int) Math.pow(ultimaCifra, 2);
					}
				
				System.out.print("La última cifra es " + ultimaCifra + " su cuadrado es " 
						+ cuadradoUltimaCifra);
			}
			
			sc.close();
		}
	}

}
