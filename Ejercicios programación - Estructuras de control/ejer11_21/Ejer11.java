package ejer11_21;

public class Ejer11 {

	public static void main(String[] args) {
		/**
		 * Al igual que ocurría con los long, puede ocurrir 
		 * con los decimales (float y double). En el siguiente 
		 * ejemplo establecemos el precio de una pieza de pan en 0.87 euros y el del Kilo de queso en 5.93 euros, 
		 * la letra “f” con la que terminamos las declaraciones le indica al compilador que los literales numéricos 
		 * (0.87 y 5.93) son de tipo float; si no pusiéramos esta indicación, el compilador los tomaría (por defecto) 
		 * como double, con lo que la asignación float = double resultaría fallida. En el ejemplo estamos calculando 
		 * el precio de un bocadillo de 150 gramos de queso. Hacer la prueba.
		 */
		
		float piezaPan = 0.87f;
		float kiloQueso = 5.93f;
		float bocadillo = piezaPan + (kiloQueso * 0.15f);
		System.out.println("El bocadillo vale: " + bocadillo + " euros");
		
		double var1 = 6E+100;
		double var2 = 2.45E-95; 
		
		System.out.println("NUMERO DOUBLE " + var1 );
		System.out.println("NUMERO DOUBLE " + var2); 
		
		
		// Casting
		int var3 = (byte) 1; 
		byte var4 = 127;
		byte var5 = 89; 
		System.out.println("NUMERO  " + var3 ); 
		
		float miVariableDeTipoFloat = (float) piezaPan;
		System.out.println("NUMERO FLOAT " + miVariableDeTipoFloat); 
		
		short sumabyte = (short) ((short) var4 + var5); 
		System.out.println("NUMERO SHOTY " + sumabyte);
		
		byte lasuma = (byte) sumabyte; 
		System.out.println("NUMERO BYTE " + lasuma);
		//El resultado no cabe y aparece -40
		
		
	}

}
