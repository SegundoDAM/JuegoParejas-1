package test;

import java.util.Scanner;

import Juego.Constantes;
import Juego.CoupleParts;

public class ProbarRealizarJugada {

	public static void main(String[] args) {
		int[][] tablero, ocultas = new int[Constantes.size][Constantes.size];
		tablero = CoupleParts.crearTablero();
		CoupleParts.rellenarOcultas(ocultas);
		realizarJugada(tablero, ocultas);
	}

	public static boolean realizarJugada(int[][] tablero, int[][] ocultas) {
		int[] origen;
		do {
			origen = pedirCoordenada();
		} while (!revelarPosicion(tablero, ocultas, origen));
		CoupleParts.mostrarTablero(ocultas);
		int[] destino;
		do {
			destino = pedirCoordenada();
		} while (!revelarPosicion(tablero, ocultas, destino));
		CoupleParts.mostrarTablero(ocultas);
		boolean comprobacion = comprobarParejas(tablero, origen, destino);
		pausar(1);
		if (!comprobacion) {
			ocultarPosiciones(ocultas, origen);
			ocultarPosiciones(ocultas, destino);
		}
		CoupleParts.mostrarTablero(ocultas);
		return comprobacion;
	}

	public static void pausar(int i) {
		try {
			new Thread().sleep(i * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void ocultarPosiciones(int[][] ocultas, int[] origen) {
		ocultas[origen[0]][origen[1]] = -1;
	}

	public static boolean revelarPosicion(int[][] tablero, int[][] ocultas, int[] origen) {
		boolean retorno = false;
		if (ocultas[origen[0]][origen[1]] == -1) {
			ocultas[origen[0]][origen[1]] = tablero[origen[0]][origen[1]];
			retorno = true;
		}
		return retorno;
	}

	public static boolean comprobarParejas(int[][] tablero, int[] origen, int[] destino) {
		return tablero[origen[0]][origen[1]] == tablero[destino[0]][destino[1]];
	}

	public static int[] pedirCoordenada() {
		int[] coordenada = new int[2];
		for (int i = 0; i < coordenada.length; i++) {
			coordenada[i] = pedirValor();
		}
		return coordenada;
	}

	public static int pedirValor() {
		Scanner leer = new Scanner(System.in);
		int valor = 0;
		do {
			System.out.println("introduce un valor entre 0 y " + (Constantes.size - 1));
			valor = leer.nextInt();
		} while (!comprobarValor(valor));
		return valor;
	}

	public static boolean comprobarValor(int valor) {
		return valor >= 0 && valor < Constantes.size;
	}

}
