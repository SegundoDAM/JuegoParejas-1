package test;

import Juego.Constantes;
import Juego.CoupleParts;

public class ProbarIntercambiarPsoiciones {
	public static void main(String[] args) {
		int[][] tablero=new int[Constantes.size][Constantes.size];
		CoupleParts.rellenarOrdenado(tablero);
		intercambiarPosiciones(tablero);
		CoupleParts.mostrarTablero(tablero);
	}

	/**
	 * Intercambiar las posiciones del tablero para ocultar las parejas
	 * @param tablero
	 */
	private static void intercambiarPosiciones(int[][] tablero) {
		//creamos las coordenadas de origen y destino
		int[] origen=new int[2],destino=new int[2];
		int intercambios=(int) Math.pow(Constantes.size,3);
		for (int i = 0; i < intercambios; i++) {
			CoupleParts.realizarSorteo(origen);
			CoupleParts.realizarSorteo(destino);
			CoupleParts.intercambiarPosicion(tablero,origen,destino);
		}
	}

	


}
