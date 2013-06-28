package pieces;

public class Pawn {
	public static final String COLOR_WHITE = "white";
	public static final String COLOR_BLACK = "black";
	
	String color;

	public Pawn(String color) {
		this.color = color;
	}

	String getColor() {
		return this.color;
	}

}
