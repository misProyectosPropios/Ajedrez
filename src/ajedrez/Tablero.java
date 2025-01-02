package ajedrez;

import java.util.ArrayList;

public class Tablero {
	final static int TAMANO = 8;
	
	private PiezaConColor tablero[][] = new PiezaConColor[TAMANO][TAMANO];
	
	public Tablero() {
		//Lo inicializamos;
		for(int i = 0; i < TAMANO; i++) {
			for(int j = 0; j < TAMANO; j++) {
				this.tablero[i][j] = null;
			}
		}
		
		//Lo llenamos con las piezas correspondientes
		//Peones
		for (int i = 0; i < TAMANO; i++) {
			this.tablero[1][i] = new PiezaConColor(Pieza.PEON, false);
			this.tablero[6][i] = new PiezaConColor(Pieza.PEON, true);
		}
		
		//Le llenamos las piezas según posiciones.csv 
		//TODO
		
		//Torres negras
		this.tablero[0][0] = new PiezaConColor(Pieza.TORRE, false);
		this.tablero[0][7] = new PiezaConColor(Pieza.TORRE, false);
		
		//Caballo negro
		this.tablero[0][1] = new PiezaConColor(Pieza.CABALLO, false);
		this.tablero[0][6] = new PiezaConColor(Pieza.CABALLO, false);
		
		//Alfil negro
		this.tablero[0][2] = new PiezaConColor(Pieza.ALFIL, false);
		this.tablero[0][5] = new PiezaConColor(Pieza.ALFIL, false);
		
		//REINA NEGRA
		this.tablero[0][3] = new PiezaConColor(Pieza.REINA, false);
		
		//REY NEGRO
		this.tablero[0][4] = new PiezaConColor(Pieza.REY, false);
		
		//Torres blancas
		this.tablero[7][0] = new PiezaConColor(Pieza.TORRE, true);
		this.tablero[7][7] = new PiezaConColor(Pieza.TORRE, true);
		
		//Caballo negro
		this.tablero[7][6] = new PiezaConColor(Pieza.CABALLO, true);
		this.tablero[7][1] = new PiezaConColor(Pieza.CABALLO, true);
				
		//Alfil negro
		this.tablero[7][2] = new PiezaConColor(Pieza.ALFIL, true);
		this.tablero[7][5] = new PiezaConColor(Pieza.ALFIL, true);
				
		//REINA NEGRA
		this.tablero[7][3] = new PiezaConColor(Pieza.REINA, true);
				
		//REY NEGRO
		this.tablero[7][4] = new PiezaConColor(Pieza.REY, true);
		
	}
	
	
	public void mostrarTablero() {
		for (int i = 0; i < this.tablero.length; i++) {
			for (int j = 0; j < this.tablero[i].length; j++) {
				if (this.tablero[i][j] != null) {
	                System.out.print(String.format("%-4s", this.tablero[i][j]) + "|");
	            } else {
	                System.out.print(String.format("%-4s", " ") + "|");
	            }
			}
			System.out.println();
		}
	}
	
	/**
	 * Devuelve las posibles posiciones en donde se pueden mover la pieza dada. 
	 * En caso de o no ser ninguna pieza, o no poder moverse, se devolverá un array con dimension 0
	 * @param fila numero entre 1 and 8
	 * @param columna numero entre 1 and 8
	 * @return
	 */
	public String[] posicionesAMover(int fila, int columna) {
		if (this.tablero[fila][columna] == null) {
			return new String[0];
		}
		ArrayList<String> posicionesPosibles = new ArrayList<>();
		
		//Para hacer entre los negros y los blancos, puedo dar la vuelta el tablero momentaneamente 
		// y ahorraría codigo repetido
		switch(this.tablero[fila][columna].pieza) {
			case Pieza.PEON:
				//TODO
				if (fila == 2) {
					
				} else {
					
				}
				
				break;
			case Pieza.ALFIL:
				//TODO
				break;
			case Pieza.CABALLO:
				//TODO
				break;
			case Pieza.TORRE:
				//TODO
				break;
			case Pieza.REINA:
				//TODO
				break;
			case Pieza.REY:
				//TODO
				break;
		}
		return (String[]) posicionesPosibles.toArray();
	}
	
	/**
	 * 
	 * @param fila: numero entre 1 y 8 que indica la fila
	 * @param columna: numero entre 1 y 8 que indica la columna
	 * @param pieza: la pieza a usar en esa ubicación justa
	 */
	public void colocarPieza(int fila, int columna, PiezaConColor pieza) {
		this.tablero[fila][columna] = pieza;
	}
	
	public int calcularPuntos(Boolean isWhite) {
		int puntos = 0;		
		for (int i = 0; i < this.tablero.length; i++) {
			for (int j = 0; j < this.tablero[i].length; j++) {
				if (this.tablero[i][j] == null) {
					continue;
				} 
				if (this.tablero[i][j].isWhite == isWhite) {
					puntos += this.tablero[i][j].getPieza().getValor();
				}
			}
		}
		return puntos;
	}
	
	/**
	 * Muestra el valor de las piezas que hay en el tablero
	 */
	public void showValorTablero() {
		int puntosBlancas = 0;
		int puntosNegras = 0;
		
		for (int i = 0; i < this.tablero.length; i++) {
			for (int j = 0; j < this.tablero[i].length; j++) {
				if (this.tablero[i][j] == null) {
					continue;
				}
				if (this.tablero[i][j].isWhite()) {
					puntosBlancas += this.tablero[i][j].getPieza().getValor();
				} else {
					puntosNegras += this.tablero[i][j].getPieza().getValor();
				}
			}
		}
		System.out.println("Puntos blancas: " + puntosBlancas);
		System.out.println("Puntos negras: " + puntosNegras);
		System.out.println("Diferencia: " + (puntosBlancas - puntosNegras));
	}
	
	



}
