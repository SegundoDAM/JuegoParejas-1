package test;

import Juego.Constantes;
import Juego.CoupleParts;

public class ProbarRealizarSorteo {
	public static void main(String[] args) {
		int[] origen = new int[2];
		// para comprobar si hay un error
		boolean error = false;
		for (int i = 0; i < 120000; i++) {
			CoupleParts.realizarSorteo(origen);
			if (origen[0] < 0 || origen[0] == Constantes.size && origen[1] < 0 || origen[1] == Constantes.size)
				error = true;
			System.out.println("[0]:" + origen[0] + " [1]:" + origen[1]);
		}
		System.out.println(error);
	}

	
}
