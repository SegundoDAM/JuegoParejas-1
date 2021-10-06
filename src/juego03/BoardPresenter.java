package juego03;

public class BoardPresenter {
	private Tablero tablero;

	public BoardPresenter(Tablero tablero) {
		super();
		this.tablero = tablero;
	}

	public int length() {
		return this.tablero.length();
	}
	
	public int getValueAt(Coordinate coordinate) {
		return this.tablero.getValueAt(coordinate);
	}
	
	public boolean getVisibleAt(Coordinate coordinate) {
		return this.tablero.getVisibleAt(coordinate);
	}
}
