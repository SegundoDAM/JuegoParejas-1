package juego03;

public class Game {
	private Tablero tablero = new Tablero();
	private BoardViewer boardview = new BoardViewerConsole(new BoardPresenter(tablero));
	private boolean ganador = false;

	public void play() {
		do {
			boardview.showBoard();
			if (realizarJugada())
				ganador = tablero.comprobarGanador();
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
		Coordinate origen,destino;
		origen=revelaCoordinate();
		boardview.showBoard();		
		destino=revelaCoordinate();
		boardview.showBoard();
		boolean comprobacion = tablero.comprobarParejas(origen, destino);
		Utiles.pausar(1);
		if (!comprobacion) {
			tablero.ocultarPosiciones(origen);
			tablero.ocultarPosiciones(destino);
		}
		boardview.showBoard();
		return comprobacion;
	}
	
	private Coordinate revelaCoordinate() {
		Coordinate coordinate;
		do {
			coordinate = boardview.getCoordinate();
		} while (!tablero.revealPosition(coordinate));
		return coordinate;
	}

//	boolean comprobacion = comprobarParejas(origen, destino);

//	pausar(1);
//		if (!comprobacion) {
//			ocultarPosiciones(ocultas, origen);
//			ocultarPosiciones(ocultas, destino);
//		}
//		CoupleParts.mostrarTablero(ocultas);
//		return comprobacion;
//	}

}
