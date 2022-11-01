package relacion2;



import java.util.Scanner;

public class Ejer15b {

	public static void main(String[] args) {
		float base, altura;
		
		// Crear un objeto tipo Scanner utilizando try con recursos
		// el cual se encargar de cerrar el objeto Scanner
		try (Scanner obLectura = new Scanner(System.in)) {
		
			System.out.print("Introduzca base: ");
			base = obLectura.nextFloat();
			
			System.out.print("Introduzca altura: ");
			altura = obLectura.nextFloat();

			System.out.println("La superficie es:" + (base * altura / 2));
		}  // end try
		
	}

}
