package juego01;

public class Game {
	public static void main(String[] args) {
		int[][] ocultas=new int[Constantes.size][Constantes.size];
		Tablero tablero=new Tablero();
		CoupleParts.rellenarOcultas(ocultas);
		boolean ganador=false;
		do{
			CoupleParts.mostrarTablero(ocultas);
			if(CoupleParts.realizarJugada(tablero,ocultas))
				ganador=CoupleParts.comprobarGanador(ocultas);
		}while(!ganador);
	}	
}
