package test;

public class ProbarComprobarGanador {
public static void main(String[] args) {
	int ocultas[][]=new int[6][6];
	ocultas[3][3]=-1;
	System.out.println(comprobarGanador(ocultas));
	ocultas[3][3]=0;
	System.out.println(comprobarGanador(ocultas));
}
public static boolean comprobarGanador(int[][] ocultas) {
	boolean resultado=true;
	for (int i = 0; i < ocultas.length&&resultado; i++) {
		for (int j = 0; j < ocultas.length&&resultado; j++) {
			if(ocultas[i][j]==-1)
				resultado=false;
		}
	}
	return resultado;
}
}
