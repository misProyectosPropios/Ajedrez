package ajedrez;

public class PiezaConColor{
	Pieza pieza;
	boolean isWhite;
	
	public PiezaConColor(Pieza pieza, boolean isWhite) {
		this.pieza = pieza;
		this.isWhite = isWhite;
	}
	
	public Pieza getPieza() {
		return this.pieza;
	}
	
	public boolean isWhite() {
		return this.isWhite;
	}
	
	public String getPieceEmoji() {
		return this.pieza.getPieceEmoji(this.isWhite);
	}
	
	@Override
	public String toString() {
		return this.pieza.toString();
	}
}
