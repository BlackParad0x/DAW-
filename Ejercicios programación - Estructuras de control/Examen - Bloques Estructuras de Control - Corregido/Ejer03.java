package examen;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		/*
		 * ALEJANDRO TERRONES PÉREZ
		 *  
		 *  EJERCICIO 3 
		 */
		/*
		 * Correccion
		 * 
		 * Constantes fijas, llevan la f!
		 * 
		 * final float conoChocolate = 0.5f;
		 * final float coste1Bola = 2.50f;
		 * final float coste2Bola = 3.50f;
		 * final float coste3bola = 4.50f;
		 * 
		 * 
		 * 
		 */
		
		char tipoHelado, pregunta = 'S', conoChocolate;
		double cantidad, precio = 0, precioCono = 0, total = 0;
		
		Scanner sc = new Scanner (System.in);
		
		
		//Esto mejor con el do while 
		System.out.print("Tarrina (T) o Cucurucho (C)");
		tipoHelado = sc.nextLine().charAt(0);
		
		//Hacer un do while dentro de un do while, el do while de fuera es cuando la respuesta es  'S'
		//El do while de dentro valida si es cucurucho y tarrina, si no indico T o C 
		//me quedo dentro del bucle hasta que ponga la respuesta bien -->Para validar
		do {
			 
				
				System.out.print("Indique el número de bolas:   ");
				cantidad = sc.nextFloat();
				
				if (cantidad == 1){
					precio = 2.50; 
				}
				else if (cantidad == 2){
					precio = 3.50;
				}
				else if (cantidad == 3){
					precio = 4.50;
				}
				precio = precio + 0;
				System.out.println("Coste: " + precio);
				
				if ((tipoHelado == 'C') || ((tipoHelado == 'c'))){
					System.out.print("¿Desea cono de chocolate? (S/N)  ");
					sc.nextLine();
					conoChocolate = sc.nextLine().charAt(0);
					if ((conoChocolate == 'S') || (conoChocolate == 's')){
						
						precioCono = 0.50;
					}
					else {
						precioCono = 0;
					}
					precio = precio + precioCono;
					System.out.println(precio);
				}
				
				sc.nextLine();
				
				System.out.print("¿Desea algo más? (S/N)   ");
				pregunta = sc.nextLine().charAt(0);
				
				total = total + precio;
				if ((pregunta == 'S') || (pregunta == 's')){

					System.out.print("Tarrina (T) o Cucurucho (C)");
					tipoHelado = sc.nextLine().charAt(0);
					
					
				} 
				else {
					
					System.out.println("TOTAL A PAGAR:" + total);
				}
			

			
		} while ((pregunta == 'S') && (pregunta != 's'));
		
		
		sc.close();
	}

}
