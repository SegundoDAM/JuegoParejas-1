package juego02;

public class BoardPresenterConsole implements BoardPresenter {

	@Override
	public void mostrarTablero(Tablero board) {
		System.out.print("   ");
		for (int i = 0; i < board.length(); i++) {
			System.out.print("   " + i + " ");
		}
		System.out.println();
		System.out.print("   ");
		System.out.print("╔");
		for (int i = 0; i < board.length(); i++) {
			System.out.print("════");
			if (i != board.length() - 1)
				System.out.print("╦");
		}
		System.out.println("╗");
		for (int i = 0; i < board.length(); i++) {
			System.out.print("  " + i);
			System.out.print("║ ");
			Coordinate coordinate=null;
			for (int j = 0; j < board.length(); j++) {
				coordinate = new Coordinate(i,j);
					if (board.getValueAt(coordinate) < 10 && board.getValueAt(coordinate)  > -1)
						System.out.print(" ");
				}
				if (board.getValueAt(coordinate)  == -1)
					System.out.print("X ");
				else
					System.out.print(board.getValueAt(coordinate) );
				System.out.print(" ║ ");
			System.out.println();
			if (i != board.length() - 1) {
				System.out.print("   ");
				System.out.print("╠");
				for (int j = 0; j < board.length(); j++) {
					System.out.print("════");
					if (j != board.length() - 1)
						System.out.print("╬");
				}
				System.out.println("╣");
			} else {
				System.out.print("   ");
				System.out.print("╚");
				for (int h = 0; h < board.length(); h++) {
					System.out.print("════");
					if (h != board.length() - 1)
						System.out.print("╩");
				}
				System.out.println("╝");
			}
		}

	}

}
