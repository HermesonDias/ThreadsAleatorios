package view;

import controller.CalculaThread;

public class Principal {

	public static void main(String[] args) {
		
		int[][] numMatriz = new int[3][5];
		int[]vetLinha = new int[3];
		int i,j;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 5; j++) {
				numMatriz[i][j] = (int) (Math.random() * 100)+1;
                vetLinha[i] = vetLinha[i] + numMatriz[i][j];
			}
            Thread calcThread = new CalculaThread(i, vetLinha);
    		calcThread.start();
		}
	}

}
