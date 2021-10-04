package juego02;

import java.util.Scanner;

public class BoardViewerConsole extends BoardViewer {
 
	public BoardViewerConsole(BoardPresenter boardPresenter) {
		super(boardPresenter);
	}

	public Coordinate getCoordinate() {
		Coordinate coordenada = new Coordinate();
		coordenada.setPositionX(pedirValor());
		coordenada.setPositionY(pedirValor());
		return coordenada;
	}

	private int pedirValor() {
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

	@Override
	public void showBoard() {
		System.out.print("   ");
		for (int i = 0; i < boardPresenter.length(); i++) {
			System.out.print("   " + i + " ");
		}
		System.out.println();
		System.out.print("   ");
		System.out.print("╔");
		for (int i = 0; i < boardPresenter.length(); i++) {
			System.out.print("════");
			if (i != boardPresenter.length() - 1)
				System.out.print("╦");
		}
		System.out.println("╗");
		for (int i = 0; i < boardPresenter.length(); i++) {
			System.out.print("  " + i);
			System.out.print("║ ");
			Coordinate coordinate = null;
			for (int j = 0; j < boardPresenter.length(); j++) {
				coordinate = new Coordinate(i, j);
				if (boardPresenter.getValueAt(coordinate) < 10 && boardPresenter.getValueAt(coordinate) > -1)
					System.out.print(" ");
			}
			if (boardPresenter.getValueAt(coordinate) == -1)
				System.out.print("X ");
			else
				System.out.print(boardPresenter.getValueAt(coordinate));
			System.out.print(" ║ ");
			System.out.println();
			if (i != boardPresenter.length() - 1) {
				System.out.print("   ");
				System.out.print("╠");
				for (int j = 0; j < boardPresenter.length(); j++) {
					System.out.print("════");
					if (j != boardPresenter.length() - 1)
						System.out.print("╬");
				}
				System.out.println("╣");
			} else {
				System.out.print("   ");
				System.out.print("╚");
				for (int h = 0; h < boardPresenter.length(); h++) {
					System.out.print("════");
					if (h != boardPresenter.length() - 1)
						System.out.print("╩");
				}
				System.out.println("╝");
			}
		}

	}

}
