package relacion2;



import java.util.InputMismatchException;
import java.util.Scanner;

public class ejer14c {

	public static void main(String[] args) {
		
		int num1, num2;
		
		// Crear un objeto tipo Scanner para recoger datos de teclado
		Scanner obLectura = new Scanner(System.in);
		
		// Controlar el error mediante el mecanismo de excepciones
		try {
			System.out.print("N�mero 1: ");  num1 = obLectura.nextInt();
			System.out.print("N�mero 2: ");  num2 = obLectura.nextInt();

			System.out.println("El resultado de la suma es: " +(num1 + num2));
			System.out.println("El resultado de la resta es: " +(num1 - num2));
			System.out.println("El resultado de la multiplicacion es: " +(num1 * num2));
			System.out.println("El resultado de la division es: " +(num1 / num2));
		}
		catch (ArithmeticException e1) { // Capturo la excepci�n a controlar
			System.out.println("No se puede dividir por 0");
		}
		catch (InputMismatchException e2) {
			System.out.println("Dato err�neo");
		}
        
        System.out.println("Fin del programa");
        obLectura.close();
	}
}








