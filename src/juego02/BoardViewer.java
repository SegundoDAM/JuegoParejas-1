package juego02;

public abstract class BoardViewer {
	protected BoardPresenter boardPresenter;
	
	public BoardViewer(BoardPresenter boardPresenter) {
		super();
		this.boardPresenter = boardPresenter;
	}
	public abstract void showBoard();
	public abstract Coordinate getCoordinate();
}
