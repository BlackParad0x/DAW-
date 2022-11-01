package ejer01_10;

public class Ejer09 {

	public static void main(String[] args) {
		
		/**
		 * Sabiendo que el sueldo real se obtiene de sumar al sueldo base los complementos, y 30 euros si su 
		 * edad es inferior a 25, 60 euros si su edad es inferior a 35, y 100 euros si su edad es inferior o igual a 
		 * 65, y después deducirle un 15% de IRPF y un 9% de Seguridad Social. 
		 */
		
		// Salen los warnings porque no estamos usando las variables, acumulamos espacio
	
		
		byte edadJuan = 20;
		byte edadPedro = 42;
		short sueldorealJuan;
		short sueldorealPedro;
		//short sueldoBase = 1980;
		short sueldoBase = 1980;
		short complementos = 400;
		int sueldofinalJuan;
		int sueldofinalPedro;
		
		//Calculo del sueldo real
		 sueldorealJuan = (short) (sueldoBase + complementos + 30);	
		 sueldorealPedro = (short) (sueldoBase + complementos + 100);	
		
		System.out.println("El sueldo  de Juan es: " + sueldorealJuan + " euros.");
		System.out.println("El sueldo  de Pedro es: " + sueldorealPedro + " euros.");
		
		//Aplicar descuentos de IRPF
		
		sueldofinalJuan = sueldorealJuan - ((sueldorealJuan * 15)/100) - ((sueldorealJuan * 9)/100); 
		sueldofinalPedro = sueldorealPedro - ((sueldorealPedro * 15)/100) - ((sueldorealPedro * 9)/100);
		
		System.out.println("El sueldo real del empleado de " + edadJuan + " años es: " + sueldofinalJuan + " euros.");		
		System.out.println("El sueldo real del empleado de " + edadPedro + " años es: " + sueldofinalPedro + " euros.");	
		
		//System.out.println(sueldoBase);
		//System.out.println(edadJuan);
		
		//no hace falta usar condicional porque se las edades del empleado
		
	}

}
