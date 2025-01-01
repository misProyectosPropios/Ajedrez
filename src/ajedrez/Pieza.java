package ajedrez;

public enum Pieza {
	PEON(1, "PEON", 1), 
	TORRE(2, "TORRE", 5), 
    CABALLO(3, "CABALLO", 3), 
    ALFIL(4, "ALFIL", 3), 
    REINA(5, "REINA", 9), 
    REY(6, "REY", 0);
	
	
	private int valor;
	private String abreviatura;
	private int chessValue;

	private Pieza(int valor, String abreviatura, int chessValue) {
		this.valor = valor;
		this.abreviatura = abreviatura;
		this.chessValue = chessValue;
	}

	public int getValor() {
		return this.valor;
	}
	
	public int getChessValue() {
		return this.chessValue;
	}

	@Override
	public String toString() {
		return this.abreviatura;
	}
}
