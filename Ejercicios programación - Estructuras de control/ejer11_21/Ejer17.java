package ejer11_21;

import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {
		// - Escribir un programa que reciba 4 números naturales a, b, c y d y que calcule:
				//(a^b + c^d) * (a^c + b^d)
				
				
				double numero1;
				double numero2;
				double numero3;
				double numero4; 
				double operacion1;
				double operacion2;
				double operacion3;
				double operacion4; 
				double suma1;
				double suma2;
				double producto; 
				
				Scanner obLectura = new Scanner (System.in); 
				
				
				System.out.print("Introduce el primer número: ");
				numero1 =  obLectura.nextFloat(); 
				
				System.out.print("Introduce el segundo número: ");
				numero2 =  obLectura.nextFloat(); 
				
				System.out.print("Introduce el tercero número: ");
				numero3 =  obLectura.nextFloat(); 
				
				System.out.print("Introduce el cuarto número: ");
				numero4 =  obLectura.nextFloat(); 
				
				
				operacion1 = Math.pow(numero1, numero2);
				operacion2 = Math.pow(numero3, numero4);
				operacion3 = Math.pow(numero1, numero3);
				operacion4 = Math.pow(numero2, numero4);
				
				
				suma1 = operacion1 + operacion2;
				suma2 = operacion3 + operacion4; 
				
				producto = suma1 * suma2; 
				
				
				System.out.println("Tus valores son: " + numero1 + ", " + numero2 + ", " + numero3 + ", " + numero4);
				System.out.print("El resultado es: " + producto);

				
				
				
				obLectura.close(); 

	}

}
