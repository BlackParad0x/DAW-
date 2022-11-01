package relacion2;

import java.util.Scanner;

public class Ejer12c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op1, op2;
		
		char operador, continuar;
		
		Scanner sc = new Scanner (System.in);
		
		do {
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
		case '/': try {
			System.out.println("Resultado" + (op1/op2));
		}
		catch (ArithmeticException e) {
			System.out.println("Error, no se puede dividir por cero");
			System.out.println(e.getMessage());
		}
		break;
		default:  System.out.println("Pon bien el número");
		}
		//Limpiar el buffer de teclado, 
		//porque falla la lectura del caracter
		//despues de haber leido un dato numero, ya que esta recogiendo
		//la "basura" que hay en el buffer
		
		sc.nextLine();
		


		System.out.println("¿Desea realizar otra operacion (S/N): ");
		continuar = operador = sc.nextLine().charAt(0); 
		
		
		continuar = Character.toUpperCase(continuar);
		
		}
		while (continuar == 'S');
		System.out.println("Calculadora finalizada");
		
		sc.close();

	}

}
