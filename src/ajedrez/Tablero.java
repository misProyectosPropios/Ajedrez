package ajedrez;

public class Tablero {
	int tablero[][];
	
	public Tablero(int numeroCasillas) {
		this.tablero = new int[numeroCasillas][numeroCasillas];
		
		//Lo inicializamos;
		for(int i = 0; i < numeroCasillas; i++) {
			for(int j = 0; j < numeroCasillas; j++) {
				this.tablero[i][j] = 0;
			}
		}
	}
	
	/*
	public void mostrarTablero() {
		for (int i = 0; i < this.tablero.length; i++) {
			for (int j = 0; j < this.tablero[i].length; j++) {
				System.out.print(this.tablero[i][j] + " ");
			}
			System.out.println();
		}
	}
	*/
}
