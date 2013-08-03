package net.slipp.chessgame;

public class Piece {
	public enum Color {
		WHITE,
		BLACK,
		NOCOLOR;
	}

	public enum Type {
		PAWN('p'),
		ROOK('r'),
		KNIGHT('n'),
		BISHOP('b'),
		QUEEN('q'),
		KING('k'),
		EMPTY('.');

		private char symbol;

		private Type(char symbol) {
			this.symbol = symbol;
		}

		public char getSymbol() {
			return symbol;
		}
	}

	private Color color;
	private Type type;
	private Position position;

	Piece(Color color, Type type, Position position) {
		this.color = color;
		this.type = type;
		this.position = position;
	}

	public char getSymbol() {
		if (isBlack()) {
			return Character.toUpperCase(type.getSymbol());
		}
		return type.getSymbol();
	}

    boolean isWhite() {
        if (Color.WHITE == color) {
            return true;
        }
        
        return false;
    }

    boolean isBlack() {
        if (Color.BLACK == color) {
            return true;
        }
        
        return false;
    }
    
    public Position getPosition() {
		return position;
	}
}
