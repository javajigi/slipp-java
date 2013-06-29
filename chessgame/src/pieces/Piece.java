package pieces;

public class Piece {
	public enum Color {
		WHITE,
		BLACK,
		EMPTY;
	}
	
	public static final char SYMBOL_PAWN = 'p';
	public static final char SYMBOL_ROOK = 'r';
	public static final char SYMBOL_KNIGHT = 'n';
	public static final char SYMBOL_BISHOP = 'b';
	public static final char SYMBOL_QUEEN = 'q';
	public static final char SYMBOL_KING = 'k';
	public static final char SYMBOL_EMPTY = '.';
	
	private static int countWhitePieces;
	private static int countBlackPieces;
	
	private Color color;
	private char symbol;
	
	private Piece(Color color, char symbol) {
		this.color = color;
		this.symbol = symbol;
	}

	Color getColor() {
		return this.color;
	}
	
	public char getSymbol() {
		if (isBlack()) {
			return Character.toUpperCase(this.symbol);
		}
		return symbol;
	}

	public static Piece create(Color color, char symbol) {
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
