package juego02;

public class Game {
	public static void main(String[] args) {
		Tablero tablero=new Tablero();
		BoardPresenter boardPresenter=new BoardPresenterConsole();
		boolean ganador=false;
		do{
			boardPresenter.mostrarTablero(tablero);
			if(CoupleParts.realizarJugada(tablero,ocultas))
				ganador=CoupleParts.comprobarGanador(ocultas);
		}while(!ganador);
	}	
}
