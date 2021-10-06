package juego03;

import java.util.Random;

public class Utiles {
	public static int getRandom(int size) {
		return new Random().nextInt(size);
	}
	public static void pausar(int i) {
		try {
			new Thread().sleep(i * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
