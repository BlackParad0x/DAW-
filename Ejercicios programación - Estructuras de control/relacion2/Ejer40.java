package relacion2;

import java.util.Locale;
import java.util.Scanner;

public class Ejer40 {

	public static void main(String[] args) {
		/**
		 * 40. Introducir un número desde teclado y desglosarlo de forma ideal 
		 * en billetes y monedas de curso legal, 
		 * es decir, con el mínimo número de billetes y monedas.
		 * 
		 * En este ejercicio os vais a encontrar problemas con el redondeo de decimales, es muy posible que se os 
		 * pierda algún céntimo, es debido al almacenamiento interno de los números, en casos como el último 
		 * ejemplo que os he puesto, que es una cantidad bastante grande, ha variado en 32 céntimos, algo 
		 * evidentemente no tolerable, cuando se corrija veremos alternativas, no obstante, debéis intentar buscar 
		 * la forma de que no se os pierda ningún céntimo. Probar con más cantidades, no sólo con las que os he 
		 * puesto de ejemplo.
		 */
		int billetes500 = 0, billetes200 = 0, billetes100 = 0, 
			billetes50 = 0, billetes20 = 0, billetes10 = 0, billetes5 = 0, 
			monedas2 = 0, monedas1 = 0, centimos50= 0, centimos20 = 0,
			centimos10 = 0, centimos5 = 0, centimos2 = 0, centimos1= 0;
		double dinero, centimos, dineroEntero, billetes, dineroVar1;
		
		try (Scanner sc = new Scanner (System.in)) {
			sc.useLocale(Locale.US); 
			
			
			
			System.out.println("\tConvertidor de billetes y monedas");
			System.out.print("\tIntroduzca su cantidad por favor: ");
			dinero = sc.nextDouble();
			
			
			//PRUEBA 
			
			
			//De la cantidad, se obtienen los euros y centimos
			dineroEntero = (dinero * 100);
			centimos = (dineroEntero % 100);
			dineroVar1 = (dineroEntero - centimos);
			billetes = (dineroVar1 / 100);

			
			
			//Sacamos los euros
			if (billetes >= 500) {
				for(billetes500 = 0; billetes >= 500; billetes500 += 1) {
					billetes = billetes - 500;}}
			if (billetes >= 200){
				for(billetes200 = 0; billetes >= 200; billetes200 +=1){
					billetes = billetes - 200;}}
			if (billetes >= 100){
				for(billetes100 = 0; billetes >= 100; billetes100 +=1){
					billetes = billetes - 100;}}
			if (billetes >= 50){
				for(billetes50 = 0; billetes >= 50; billetes50 +=1){
					billetes = billetes - 50;}}
			if (billetes >= 20){
				for(billetes20 = 0; billetes >= 20; billetes20 +=1){
					billetes = billetes - 20;}}
			if (billetes >= 10){
				for(billetes10 = 0; billetes >= 10; billetes10 +=1){
					billetes = billetes - 10;}}
			if (billetes >= 5){
				for(billetes5 = 0; billetes >= 5; billetes5 +=1){
					billetes = billetes - 5;}}
			if (billetes >= 2){
				for(monedas2 = 0; billetes >= 2; monedas2 +=1){
					billetes = billetes - 2;}}
			if (billetes >= 1){
				for(monedas1 = 0; billetes >= 1; monedas1 +=1){
					billetes = billetes - 1;}}
			
			//Sacamos los céntimos
			if (centimos >=50){
				for(centimos50 = 0; centimos >= 50; centimos50 +=1){
					centimos = centimos - 50;}}
			if (centimos >=20){
				for(centimos20 = 0; centimos >= 20; centimos20 +=1){
					centimos = centimos - 20;}}
			if (centimos >=10){
				for(centimos10 = 0; centimos >= 10; centimos10 +=1){
					centimos = centimos - 10;}}
			if (centimos >=5){
				for(centimos5 = 0; centimos >= 5; centimos5 +=1){
					centimos = centimos - 5;}}
			if (centimos >=2){
				for(centimos2 = 0; centimos >= 2; centimos2 +=1){
					centimos = centimos - 2;}}
			if (centimos >=1){
				for(centimos1 = 0; centimos >= 1; centimos1 +=1){
					centimos = centimos - 1;}}
			
			
			//Se imprimen por pantalla las cantidades
			if(billetes500 != 0) {
				System.out.println(billetes500 + " billetes de 500");
			}
			if (billetes200 != 0) {
				System.out.println(billetes200 + " billetes de 200");
			}
			if (billetes100 != 0){
				System.out.println(billetes100 + " billetes de 100");
			}
			if (billetes50 != 0){
				System.out.println(billetes50 + " billetes de 50");
			}
			if (billetes20 != 0){
				System.out.println(billetes20 + " billetes de 20");
			}
			if (billetes10 != 0){
				System.out.println(billetes10 + " billetes de 10");
			}
			if (billetes5 != 0){
				System.out.println(billetes5 + " billetes de 5");
			}
			if (monedas2 != 0){
				System.out.println(monedas2 + " monedas de 2");
			}
			if (monedas1 != 0){
				System.out.println(monedas1 + " monedas de 1");
			}
			if (centimos50 != 0){
				System.out.println(centimos50 + " monedas de 50 céntimos");
			}
			if (centimos20 != 0){
				System.out.println(centimos20 + " monedas de 20 céntimos");
			}
			if (centimos10 != 0){
				System.out.println(centimos10 + " monedas de 10 céntimos");
			}
			if (centimos5 != 0){
				System.out.println(centimos5 + " monedas de 5 céntimos");
			}
			if (centimos2 != 0){
				System.out.println(centimos2 + " monedas de 2 céntimos");
			}
			if (centimos1 != 0){
				System.out.println(centimos1 + " monedas de 1 céntimos");
			}
			
			
			
				
			sc.close();
		}
	}

}
