package controller;

public class CalculaThread extends Thread {
	
	private int i;
	private int vetLinha[];

	public CalculaThread(int i, int[]vetLinha) {
		this.i = i;
		this.vetLinha = vetLinha;

	}

	@Override
	public void run() {
		System.out.println("IdLinha: " + i + " Soma da Linha: " + vetLinha[i]);
	}

}
