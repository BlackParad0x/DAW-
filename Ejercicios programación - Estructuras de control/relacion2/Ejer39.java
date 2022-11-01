package relacion2;



public class Ejer39 {

	public static void main(String[] args) {
		/*
		 * 39. Realizar un algoritmo para imprimir las tablas de multiplicar 
		 * del uno al diez, es decir, tenéis que mostrar 
		 * la tabla del 1, la del 2, la del 3, … hasta la del 10.
		 */


		
		for (int num=1; num<=10; num +=1) {
			System.out.println("-----------------------------");
			System.out.println("La tabla del " + num);
			for (int cont=1; cont <=10; cont +=1) {
				int producto = cont * num;
				System.out.println(num + " x " + cont + " = " + producto);
				
			}
		}
		
		System.out.println("-----------------------------");
		
		
		}
	}

