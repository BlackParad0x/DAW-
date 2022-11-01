package ejer01_10;

import java.util.Scanner;

public class PruebaDebug {

	public static void main(String[] args) {
		// Definici�n de variables
		int num1, num2, num3, suma;
		double media;
		int contador = 0;
		
		// Crear un objeto tipo Scanner para recoger datos de teclado
		Scanner obLectura = new Scanner(System.in);

		// Solicitar al usuario los tres valores para el c�lculo de la media
		System.out.print("N�mero 1: ");
		num1 = obLectura.nextInt();
		
		System.out.print("N�mero 2: ");
		num2 = obLectura.nextInt();

		System.out.print("N�mero 3: ");
		num3 = obLectura.nextInt();

		// Calcular la media aritm�tica
		suma = num1 + num2 + num3;
		media = suma / 3.0;
		
		// Escribir en consola el resultado de la media arim�tica
		System.out.println("La media es: "+media);
		
		// Prueba de sentencia condicional
		if (media > 100) { 
			System.out.println("El resultado es mayor de 100");
		}
		else {
			System.out.println("El resultado es menor o igual a 100");
		}
		
		while (contador<3) {
			System.out.println("Hola");
			contador++;
		}
		
		// Cerrar el objeto de lectura de datos
		obLectura.close();

	}

}
