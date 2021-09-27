package test;

import Juego.CoupleParts;

public class PruebaRellenarOrdenado {
	public static void main(String[] args) {
		int[][] tablero = new int[8][8];
		rellenarOrdenado(tablero);
		CoupleParts.mostrarTablero(tablero);
	}

	/**
	 * coloca las parejas seguidas en la matriz
	 * @param tablero     con las partejas ordenadas
	 */
	private static void rellenarOrdenado(int[][] tablero) {
		for (int i = 0,valor=0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length-1; j+=2,valor++) {
					tablero[i][j]=valor;
					tablero[i][j+1]=valor;
				}
			}
		}
	}

