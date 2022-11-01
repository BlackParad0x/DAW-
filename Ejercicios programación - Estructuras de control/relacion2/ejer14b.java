package relacion2;



import java.util.Scanner;

public class ejer14b {

	public static void main(String[] args) {
		
		int num1, num2;
		
		// Crear un objeto tipo Scanner para recoger datos de teclado
		Scanner obLectura = new Scanner(System.in);
		
		System.out.print("N�mero 1: ");
		num1 = obLectura.nextInt();
		
		System.out.print("N�mero 2: ");
        num2 = obLectura.nextInt();
        
        System.out.println("El resultado de la suma es: " +(num1 + num2));
        System.out.println("El resultado de la resta es: " +(num1 - num2));
        System.out.println("El resultado de la multiplicacion es: " +(num1 * num2));
        
        // Controlar el error mediante el mecanismo de excepciones
        try {  // try "vigila" el c�digo susceptible de producir error
        	
        	System.out.println("Estoy dentro del bloque try");
        	
        	System.out.println("El resultado de la division es: " +(num1 / num2));
        	
        	System.out.println("Continuo dentro del bloque try");
        }
        catch (ArithmeticException e1) { // Capturo la excepci�n a controlar
        	System.out.println("No se puede dividir por 0");
        }
        
        System.out.println("Fin del programa");
        obLectura.close();
	}
}








