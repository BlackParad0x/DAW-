package relacion2;

import java.util.Scanner;

public class Ejer44 {

	public static void main(String[] args) {
		/**44. Introducir la nota de una asignatura por teclado, que esté comprendida 
		 * entre 0 y 10 y escribir la nota en letra, atendiendo a: 
		 * 0 > Nota < 3 Muy deficiente 
		 * 3 >= Nota < 5 Insuficiente 
		 * 5 >= Nota < 6 Suficiente 
		 * 6 >= Nota < 7 Bien 
		 * 7 >= Nota < 9 Notable 
		 * 9 >= Nota =< 10 Sobresaliente
		 */
		
		byte calificacion;
		
		Scanner sc = new Scanner (System.in);
		
		
		// HACERLO CON SWITCH 
		System.out.println("Introduce tu calificación");
		calificacion = sc.nextByte();
		
		if ((calificacion > 0) && (calificacion < 3)){
			System.out.println("Muy deficiente");
		}
		else if ((calificacion >= 3) && (calificacion < 5)) {
			System.out.println("Insuficiente");
		}
		else if ((calificacion >= 5) && (calificacion < 6)) {
			System.out.println("Suficiente");
		}
		else if ((calificacion >= 6) && (calificacion < 7)) {
			System.out.println("Bien");
		}
		else if ((calificacion >= 7) && (calificacion < 9)) {
			System.out.println("Notable");
		}
		else if ((calificacion >= 9) && (calificacion <= 10)) {
			System.out.println("Sobresaliente");
		}
		
		
		sc.close();

	}

}
