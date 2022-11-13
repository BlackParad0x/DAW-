package examen;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		/*
		 * ALEJANDRO TERRONES PÉREZ
		 * 
		 * EJERCICIO 2 
		 */

		float edad = 1, contAlumnos = 0, cantidadMenor = 0, cantidadMayor = 0, mayor, menor, sumaEdad = 0, mediaEdad; 
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce la edad: ");
		edad = sc.nextInt();
		mayor = edad;
		menor = edad;
		
		//Hacer con un while y pedir la edad fuera del bucle 
		
		
		
		do {
			
			sumaEdad = edad + sumaEdad;
			
			contAlumnos += 1; 
			
			if (edad < menor) {
				menor = edad;
			}
			else if (edad > mayor) {
				mayor = edad;
			}
			
			
			if  (edad >=1 &&(edad < 18)){
				cantidadMenor += 1;
			}
			
			if (edad >= 18){
				cantidadMayor += 1;
			}
			
			
			
			
			System.out.println("Introduzca la edad:  ");
			edad = sc.nextFloat();
			
		}while (edad > 0);
		
		mediaEdad = (sumaEdad/contAlumnos);
		
		System.out.println("Alumnos mayores de edad: " + (int)cantidadMayor);
		System.out.println("Alumnos menores de edad: " + (int)cantidadMenor);
		System.out.println("Edad alumno más joven: " + (int)menor);
		System.out.println("Edad alumno más mayor: " + (int)mayor);
		System.out.println("Edad media: " + mediaEdad);
		
			
		sc.close();
	}
	
	
	
}
