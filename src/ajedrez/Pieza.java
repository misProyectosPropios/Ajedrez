package ajedrez;

public enum Pieza {
	PEON(1, "P"), 
	TORRE(2, "T"), 
    CABALLO(3, "C"), 
    ALFIL(4, "A"), 
    REINA(5, "Q"), 
    REY(6, "K");
	
	private int valor;
	private String abreviatura;

	private Pieza(int valor, String abreviatura) {
		this.valor = valor;
		this.abreviatura = abreviatura;
	}

	public int getValor() {
		return this.valor;
	}

	@Override
	public String toString() {
		return this.abreviatura;
	}
}
