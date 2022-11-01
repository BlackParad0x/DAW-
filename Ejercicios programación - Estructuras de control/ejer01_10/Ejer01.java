package ejer01_10;

import java.util.Locale;
import java.util.Scanner;

// 1.- Hacer un programa que pida al usuario su edad,
//  y muestre la edad que tendrá el próximo año.

// edad = int(input("Dime tu edad")))
// print = (f" Tienes  {edad}, el año que viene tendras:" + edad +1)

public class Ejer01 {

	public static void main(String[] args) {
		// EJEMPLO 
		
		
		byte edad; 
		
		Scanner obLectura = new Scanner(System.in); 
		obLectura.useLocale(Locale.ENGLISH); 
		
		System.out.print("Introduce tu edad:	");
		edad = obLectura.nextByte(); 
        //edad += 1; 
		
		System.out.println("Tienes     "   + edad + "    el año que viene tendrás: " + (edad + 1)); 
		
		obLectura.close();
	}

}
