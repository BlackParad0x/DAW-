package ejer01_10;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte edad; 
		
		Scanner obLectura = new Scanner(System.in); 
		
		System.out.println("Por favor introduzca su edad"); 
		edad = obLectura.nextByte(); 
		
		
		System.out.print(edad > 18?"Usted es mayor de edad":"Es menor de edad"); 

		
		obLectura.close();
		
	}

}
