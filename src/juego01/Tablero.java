package juego01;

import java.util.Random;

public class Tablero {
	int[][] tablero;
	public Tablero() {
		super();
		crearTablero();
	}
	
	/**
	 * Coloca aleatoriamente las parejas sobre el tablero
	 * 
	 * @return
	 */
	
	public void crearTablero() {
		// Los archivos no se reconocen bien siestan en el
		// default package por eso creamos el package Juego
		tablero = new int[Constantes.size][Constantes.size];
		this.rellenarOrdenado();
		this.intercambiarPosiciones();
	}
	
	/**
	 * coloca las parejas seguidas en la matriz
	 * 
	 * @param board
	 *            con las partejas ordenadas
	 */
	public void rellenarOrdenado() {
		for (int i = 0, valor = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length - 1; j += 2, valor++) {
				tablero[i][j] = valor;
				tablero[i][j + 1] = valor;
			}
		}
	}
	
	/**
	 * Intercambiar las posiciones del tablero para ocultar las parejas
	 * 
	 * @param board
	 */
	public void intercambiarPosiciones() {
		// creamos las coordenadas de origen y destino
		Coordinate origin=new Coordinate(), target=new Coordinate();
		int intercambios = (int) Math.pow(Constantes.size, 3);
		for (int i = 0; i < intercambios; i++) {
			origin.randomCoordinate();
			target.randomCoordinate();
			intercambiarPosicion(origin, target);
		}
	}
	/**
	 * Inmtercambia los valores de entre dos posiciones en una matriz
	 * 
	 * @param board
	 * @param origin
	 * @param target
	 */
	public  void intercambiarPosicion(Coordinate origin, Coordinate target) {
		int intercambio = getValueAt(origin);
		setValueAt(origin, getValueAt(target));
		setValueAt(target, intercambio);
	}

	private void setValueAt(Coordinate coordinate,int value) {
		tablero[coordinate.getPositionX()][coordinate.getPositionY()]=value;
	}
	private int getValueAt(Coordinate coordinate) {
		return tablero[coordinate.getPositionX()][coordinate.getPositionY()];
	}

}
