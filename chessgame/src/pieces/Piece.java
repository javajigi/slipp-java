package pieces;

public class Piece {
	public enum Color {
		WHITE,
		BLACK,
		EMPTY;
	}
	
	public enum Symbol {
		PAWN('p'),
		ROOK('r'),
		KNIGHT('n'),
		BISHOP('b'),
		QUEEN('q'),
		KING('k'),
		EMPTY('.');
		
		private char symbol;
		
		private Symbol(char symbol) {
			this.symbol = symbol;
		}
		
		public char getSymbol() {
			return symbol;
		}
	}
	
	private static int countWhitePieces;
	private static int countBlackPieces;
	
	private Color color;
	private Symbol symbol;
	
	private Piece(Color color, Symbol symbol) {
		this.color = color;
		this.symbol = symbol;
	}

	Color getColor() {
		return this.color;
	}
	
	public char getSymbol() {
		if (isBlack()) {
			return Character.toUpperCase(symbol.getSymbol());
		}
		return symbol.getSymbol();
	}
	
	public static Piece create(Color color, Symbol symbol) {
		Piece piece = new Piece(color, symbol);
		if (piece.isWhite()) {
			countWhitePieces++;
		} else if (piece.isBlack()) {
			countBlackPieces++;
		}
		return piece;
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
}
