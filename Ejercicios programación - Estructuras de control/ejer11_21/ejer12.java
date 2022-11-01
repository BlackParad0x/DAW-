package ejer11_21;

import java.util.Scanner;

public class ejer12 {

	public static void main(String[] args) {
		/**
		 * - Escribir un programa que calcule el salario semanal de un trabajador, 
		 * dada la tarifa horaria por horas y el número de horas trabajadas.
		 * Además, hay que tener en cuenta que se le practica una retención del 
		 * 4% para la S.S. y del 7% para el IRPF. 
		 * Es decir, solicitaremos por teclado, cuánto cobra por hora (tarifa 
		 * horaria), así como las horas trabajadas,
		 * y mostraremos por pantalla el sueldo semanal del trabajador 
		 * según los datos proporcionados.
		 */
		
		
		float tarifa_horaria;
		float horas_trabajo; 
		
		Scanner obLectura = new Scanner (System.in); 
		
		System.out.println("Vamos a calcular su salario semanal.");
		System.out.println("");
		System.out.print("Indique cuanto cobra por hora:  ");
		tarifa_horaria = obLectura.nextFloat(); 
		
		System.out.print("Indique cuantas horas trabaja a la semana:  ");
		horas_trabajo = obLectura.nextFloat(); 
		
		float salario_semanal = tarifa_horaria * horas_trabajo; 
		
		float seguridad = (salario_semanal * 4)/ 100;
		float IRPF = (salario_semanal * 7)/ 100; 
		float restante = salario_semanal - seguridad - IRPF; 
		
		System.out.println("La seguridad social te va a quitar: " + seguridad + "  euros y el IRPF te va a quitar: " + IRPF + " euros."); 
		System.out.print("Tu sueldo restante semanal va a ser de " + restante + " euros");
		
		
		obLectura.close();
	}

}
