package test;

import Juego.Constantes;
import Juego.CoupleParts;

public class ProbarIntercambiarPosicion {
	public static void main(String[] args) {
		int[][] tablero = new int[Constantes.size][Constantes.size];
		CoupleParts.rellenarOrdenado(tablero);
		int[] origen = new int[2], destino = new int[2];
		CoupleParts.realizarSorteo(origen);
		CoupleParts.realizarSorteo(destino);
		intercambiarPosicion(tablero, origen, destino);
		CoupleParts.mostrarTablero(tablero);
	}

	/**
	 * Inmtercambia los valores de entre dos posiciones en una matriz
	 * @param tablero
	 * @param origen
	 * @param destino
	 */
	private static void intercambiarPosicion(int[][] tablero, int[] origen, int[] destino) {
		int intercambio=tablero[origen[0]][origen[1]];
		tablero[origen[0]][origen[1]]=tablero[destino[0]][destino[1]];
		tablero[destino[0]][destino[1]]=intercambio;
	}
}
