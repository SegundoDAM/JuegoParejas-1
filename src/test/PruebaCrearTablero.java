package test;

import Juego.Constantes;
import Juego.CoupleParts;

public class PruebaCrearTablero {
public static void main(String[] args) {
	int[][] tablero;
}
/**
 * Coloca aleatoriamente las parejas sobre el tablero
 * @return
 */
private static int[][] crearTablero() {
	//Los archivos no se reconocen bien siestan en el 
	//default package por eso creamos el package Juego
	int[][] tablero=new int[Constantes.size][Constantes.size];
	CoupleParts.rellenarOrdenado(tablero);
	CoupleParts.intercambiarPosiciones(tablero);
	return tablero;
}

}
