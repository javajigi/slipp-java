package pieces;

public class Pawn {
	public static final String COLOR_WHITE = "white";
	public static final String COLOR_BLACK = "black";
	
	public static final char SYMBOL_LOWERCASE_PAWN = 'p';
	public static final char SYMBOL_UPPERCASE_PAWN = 'P';
	
	String color;
	char symbol;

	public Pawn(String color, char symbol) {
		this.color = color;
		this.symbol = symbol;
	}

	String getColor() {
		return this.color;
	}
	
	char getSymbol() {
		return symbol;
	}
}
