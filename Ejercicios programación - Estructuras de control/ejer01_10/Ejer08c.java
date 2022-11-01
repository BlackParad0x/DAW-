package ejer01_10;

public class Ejer08c {

	public static void main(String[] args) {
		/**
		 * El siguiente programa convierte los días terrestres 
		 * en años del planeta Júpiter. Puede que tenga 
		 * algún error, si ese es el caso, corrígelo 
		 * y haz que funcione.
		 */
		
		int diasTerrestres;

		diasTerrestres = Integer.parseInt(args[0]);
		System.out.println("El número de años de Jupiter sería " +
		(float)(diasTerrestres)/(float)(365*12));

		
	}

}
