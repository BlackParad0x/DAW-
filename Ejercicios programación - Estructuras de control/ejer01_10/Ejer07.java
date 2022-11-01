package ejer01_10;

import java.util.Scanner;

public class Ejer07 {

	private static final double preciolimon = 1.90;
	private static final double PRECIONARANJA = 1.25;

	public static void main(String[] args) {
		/**Un agricultor que se dedica al cultivo ecológico de naranjas y limones, 
		 * quiere calcular los beneficios que obtiene anualmente por la venta de los mismos.
		 * . Por este motivo vamos a diseñar una aplicación que solicite las ventas (en kilos)
		 * de cada semestre para cada fruta. La aplicación mostrará el importe 
		 * total sabiendo que el precio del kilo de naranjas está fijado en 1.25€
		 * y el kilo de limones en 1.90€
		 */
		
		// Hay dos semestres
		
		float naranjas1; 
		float naranjas2;
		float limones1;
		float limones2; 
		
		//float precio_naranja = (float) 1.25; 
		//float precio_limon = (float) 1.90; 
		
		// Variable local constante 
		float precio_naranja = (float) PRECIONARANJA; 
		float precio_limon = (float) preciolimon; 
		
		Scanner obLectura = new Scanner (System.in); 
		
		System.out.println("Por favor inserte los kilos vendidos de naranjas en el primer semestre:");
		naranjas1 = obLectura.nextFloat(); 
		
		System.out.println("Por favor inserte los kilos vendidos de naranjas en el segundo semestre:");
		naranjas2 = obLectura.nextFloat(); 
		
		System.out.println("Por favor inserte los kilos vendidos de limones en el primer semestre:");
		limones1 = obLectura.nextFloat(); 
		
		System.out.println("Por favor inserte los kilos vendidos de limones en el segundo semestre:");
		limones2 = obLectura.nextFloat(); 
		
		
		float producto_naranja1 = naranjas1 * precio_naranja; 
		float producto_naranja2 = naranjas2 * precio_naranja;
		float producto_limon1 = limones1 * precio_limon;
		float producto_limon2 = limones2 * precio_limon;
		
		
		float suma = producto_naranja1 + producto_naranja2 + producto_limon1 + producto_limon2; 
		
		System.out.println("El importe anual de las naranjas y los limones vendidos en ambos semetres es: " + suma + " euros.");
		
		
		
		
		obLectura.close();
	}

}
