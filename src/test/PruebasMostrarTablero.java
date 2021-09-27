package test;

import Juego.Constantes;
import Juego.CoupleParts;

public class PruebasMostrarTablero {
	public static void main(String[] args) {
		int[][] ocultas = new int[Constantes.size][Constantes.size];
		
		rellenarOcultas(ocultas);
		ocultas[3][3]=9;
		mostrarTablero(ocultas);
		// muestraTodo();
	}

	/**
	 * Rellenar de -1 todas las fichas de ocultas
	 * 
	 * @param ocultas
	 */
	private static void rellenarOcultas(int[][] ocultas) {
		for (int i = 0; i < ocultas.length; i++) {
			for (int j = 0; j < ocultas.length; j++) {
				ocultas[i][j] = -1;
			}
		}
	}

	static void muestraTodo() {
		int max = 255;
		for (int numero = 0; numero < max + 1; numero++) {
			System.out.println(numero + ":" + (char) numero);
		}

	}

	public static void mostrarTablero(int[][] matriz) {
		System.out.print("   ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("   " + i + " ");
		}
		System.out.println();
		System.out.print("   ");
		System.out.print("╔");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("════");
			if (i != matriz.length - 1)
				System.out.print("╦");
		}
		System.out.println("╗");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("  " + i);
			System.out.print("║ ");
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 10 && matriz[i][j] > -1)
					System.out.print(" ");
				if(matriz[i][j]== -1)
					System.err.print("X ");
				else
					System.out.print(matriz[i][j]);
				System.out.print(" ║ ");
			}
			System.out.println();
			if (i != matriz.length - 1) {
				System.out.print("   ");
				System.out.print("╠");
				for (int j = 0; j < matriz.length; j++) {
					System.out.print("════");
					if (j != matriz.length - 1)
						System.out.print("╬");
				}
				System.out.println("╣");
			} else {
				System.out.print("   ");
				System.out.print("╚");
				for (int h = 0; h < matriz.length; h++) {
					System.out.print("════");
					if (h != matriz.length - 1)
						System.out.print("╩");
				}
				System.out.println("╝");
			}
		}
	}
}
