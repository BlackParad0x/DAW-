package ejer01_10;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		// 2.- Escribir un programa que pida el año actual y el de nacimiento del usuario
		// Debe calcular su edad, suponiendo que en el año en curso el usuario ya ha cumplido años.
		
		
		int year;
		int edad;
		
		Scanner obLectura = new Scanner(System.in); 
		
		System.out.println("Dime en que año estamos:"	); 
		year = obLectura.nextInt(); 
		
		
		System.out.println("Dime tu edad:"	); 
		edad = obLectura.nextInt(); 
		
		
		System.out.println("Estamos en " + (year) + " y tienes " + (edad) + "años, naciste en el año:  " + (year - edad)); 
		
		
		obLectura.close(); 
	}

}
