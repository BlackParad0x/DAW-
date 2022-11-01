package relacion2;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {
		/**
		 * 5. En una partida de un determinado juego, según los puestos conseguidos 
		 * se obtiene un grado u otro, siguiendo la siguiente tabla:
		 */

		byte puntos;
		Scanner sc = new Scanner (System.in);

		System.out.println("Introduce tu puntuación: ");
		puntos = sc.nextByte();

		if (puntos < 60) {
			System.out.println("Tu grado es E");
		}
		else if ((60 <= puntos) && (puntos <= 69)) {
			System.out.println("Tu grado es D");
		}
		else if ((70 <= puntos) && (puntos <= 79)) {
			System.out.println("Tu grado es C");
		}
		else if ((80 <= puntos) && (puntos <= 89)) {
			System.out.println("Tu grado es B");
		}
		else {
			System.out.println("Tu grado es A");
		}
		sc.close();
	}

}
