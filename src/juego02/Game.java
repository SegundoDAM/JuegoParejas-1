package juego02;

public class Game {
	private Tablero tablero = new Tablero();
	private BoardViewer boardview = new BoardViewerConsole(new BoardPresenter(tablero));
	private boolean ganador = false;

	public void play() {
		do {
			boardview.showBoard();
			if (CoupleParts.realizarJugada(tablero, ocultas))
				ganador = CoupleParts.comprobarGanador(ocultas);
		} while (!ganador);
	}

	/**
	 * controla la jugada actual
	 * 
	 * @param tablero
	 * @param ocultas
	 * @return
	 */
	public boolean realizarJugada() {
		PairCoordinates pairCoordinates = new PairCoordinates();
		Coordinate coordinate;
		do {
			coordinate = boardview.getCoordinate();
		} while (!tablero.revealPosition(coordinate));
		boardview.showBoard();
		pairCoordinates.setOrigen(coordinate);
		do {
			coordinate = boardview.getCoordinate();
		} while (!tablero.revealPosition(coordinate));
		boardview.showBoard();
		pairCoordinates.setDestino(coordinate);
	}

	boolean comprobacion = comprobarParejas(origen, destino);

	pausar(1);
		if (!comprobacion) {
			ocultarPosiciones(ocultas, origen);
			ocultarPosiciones(ocultas, destino);
		}
		CoupleParts.mostrarTablero(ocultas);
		return comprobacion;
	}

}
