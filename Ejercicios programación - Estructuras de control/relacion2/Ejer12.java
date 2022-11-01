package relacion2;

import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {


		char operador; 
		int numero1;
		int numero2;
		
		Scanner sc = new Scanner (System.in); 
			
		System.out.println("Calculadora");
		System.out.println("Dime que operación quieres hacer: ");
		operador = sc.nextLine().charAt(0); 
		System.out.println("Dime un número: ");
		numero1 = sc.nextInt();
		System.out.println("Dime otro numero: ");
		numero2 = sc.nextInt();
		
		switch (operador) {
		case '+': System.out.println(numero1 + numero2);
		break;
		case '-': System.out.println(numero1 - numero2);
		break;
		case '*': System.out.println(numero1 * numero2);
		break;
		case '/': System.out.println((float)(numero1 / numero2));
		break;
		default:  System.out.println("Pon bien el número");
		}
		
		System.out.println("Calculadora finalizada");
		
			
			
			
 		
    sc.close(); 
	}

}
