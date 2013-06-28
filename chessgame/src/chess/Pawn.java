package chess;

class Pawn {
	static final String COLOR_WHITE = "white";
	static final String COLOR_BLACK = "black";
	
	String color;

	Pawn(String color) {
		this.color = color;
	}

	String getColor() {
		return this.color;
	}

}
