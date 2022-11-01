package relacion2;

import java.util.Scanner;

public class Ejer26 {

	public static void main(String[] args) {
		/**
		 * 26. Hacer un algoritmo que nos sume, los números naturales 
		 * que sean pares, y menores que un número 
		 * introducido por teclado.
		 */
		
		int numero; 
		int suma = 0; 
		int par = 0;
		int SumF = 0;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		for (int cont = 1; par < numero; cont +=1) {
			par = cont * 2; 
			suma = suma + par;
			SumF = suma - par; 
			if (par != numero) {
				System.out.println(par);
			}
		}
		
		System.out.println("La suma de los numeros naturales pares menores que " +
		 numero + " es " + SumF);
		
		
		sc.close(); 
	}

}
