package ejer01_10;

import java.util.Locale;
import java.util.Scanner;

public class Ejemplo0 {
	
	
	/**
	 * ejemplo completo de lectura de datos de teclado y escritura en consola
	 * 
	 * @author Alejandro Terrones 
	 * @version 1.0 
	 * 
	 */

	public static void main(String[] args) {
		
		/**
		 * Método principal 
		 * @param args --> argumentos de entrada al programa
		 * 
		 * 
		 */
		
		 // Definir variables para solicitar datos de teclado 
		
		int numeroEntero;
		float numeroReal; 
		char caracter; 
		
		// Esto va a guardar espacio en la memoria, a lo que voy a llamar numero entero y numero real
		
		// Crear un objeto de la clase Scanner para poder recoger
		//datos de teclado
		Scanner obLectura = new Scanner(System.in); 
		obLectura.useLocale(Locale.ENGLISH); 
		
		// Solicitar al usuario un valor entero
		System.out.print("Introduce numero entero: ");
		numeroEntero = obLectura.nextInt(); 
		
		
		// Solicitar al usuario un valor real
		System.out.print("Introduce numero real: ");
		numeroReal = obLectura.nextFloat(); 
		
		
		
		//Mostrar al usuario los valores introducidos previamente
		System.out.println("Valor entero:" + " " + numeroEntero); 
		System.out.println("Valor real:" +  " " + numeroReal);
		
		
		// Leer un caracter
		System.out.println("Introduce un caracter"); 
		caracter = obLectura.next().charAt(0);
		System.out.println("Caracter:" + caracter); 
		
		// Vamos a cerrar el objeto Scanner
		obLectura.close(); 
	}
}

