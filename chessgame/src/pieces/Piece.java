package pieces;

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
	
	private static int countWhitePieces;
	private static int countBlackPieces;
	
	private Color color;
	private Type type;
	
	private Piece(Color color, Type type) {
		this.color = color;
		this.type = type;
	}

	Color getColor() {
		return this.color;
	}
	
	public char getSymbol() {
		if (isBlack()) {
			return Character.toUpperCase(type.getSymbol());
		}
		return type.getSymbol();
	}
	
	public static int countWhitePieces() {
		return countWhitePieces;
	}

	public static int countBlackPieces() {
		return countBlackPieces;
	}

	public static void resetCountPieces() {
		countWhitePieces = 0;
		countBlackPieces = 0;
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
    
	public static Piece create(Color color, Type symbol) {
		Piece piece = new Piece(color, symbol);
		if (piece.isWhite()) {
			countWhitePieces++;
		} else if (piece.isBlack()) {
			countBlackPieces++;
		}
		return piece;
	}

	public static Piece createWhitePawn() {
		countWhitePieces++;
		return new Piece(Color.WHITE, Type.PAWN);
	}

	public static Piece createBlackPawn() {
		countBlackPieces++;
		return new Piece(Color.BLACK, Type.PAWN);
	}

	public static Piece createEmpty() {
		return new Piece(Color.NOCOLOR, Type.EMPTY);
	}
}
