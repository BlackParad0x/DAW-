package relacion2;

import java.util.Scanner;

public class Ejer12b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int op1, op2;
		
		char operador;
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Operacion");
		operador = sc.nextLine().charAt(0); 
		System.out.println("Dime un número: ");
		op1 = sc.nextInt();
		System.out.println("Dime otro numero: ");
		op2 = sc.nextInt();
		
		switch (operador) {
		case '+': System.out.println(op1 + op2);
		break;
		case '-': System.out.println(op1 - op2);
		break;
		case '*': System.out.println(op1 * op2);
		break;
		case '/': if (op2 != 0) {System.out.println((float) (op1/op2));}
		else System.out.println("Error, no se puede dividir por 0");
		break;
		default:  System.out.println("Pon bien el número");
		}
		
		System.out.println("Calculadora finalizada");
		
		sc.close();
	}

}
