package pieces;

import java.util.ArrayList;

import position.Position;



public class Piece implements Comparable<Piece> {
	public enum Color {
		WHITE,
		BLACK,
		NOCOLOR;
	}
	
	public enum Type {
		PAWN('p', 0.5),
		ROOK('r', 5.0),
		KNIGHT('n', 2.5),
		BISHOP('b', 3.0),
		QUEEN('q', 9.0),
		KING('k', 0.0),
		EMPTY('.', 0.0);
		
		private char symbol;
		private double defaultPoint;
		
		private Type(char symbol, double defaultPoint) {
			this.symbol = symbol;
			this.defaultPoint = defaultPoint;
		}
		
		public char getSymbol() {
			return symbol;
		}
		
		public double getDefaultPoint() {
			return defaultPoint;
		}
	}
	
	private static int countWhitePieces;
	private static int countBlackPieces;
	
	private Color color;
	private Type type;
	
	private int x;
	private int y;
	private double point;
	
	private Piece(Color color, Type type) {
		this.color = color;
		this.type = type;
		this.point = type.getDefaultPoint();
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
    
	public static Piece noPiece() {
		return new Piece(Color.NOCOLOR, Type.EMPTY);
	}
	
	private static Piece createWhite(Type type) {
		countWhitePieces++;
		return new Piece(Color.WHITE, type);
	}

	private static Piece createBlack(Type type) {
		countBlackPieces++;
		return new Piece(Color.BLACK, type);
	}
	
	public static Piece createWhitePawn() {
		return createWhite(Type.PAWN);
	}

	public static Piece createBlackPawn() {
		return createBlack(Type.PAWN);
	}

	public static Piece createWhiteRook() {
		return createWhite(Type.ROOK);
	}

	public static Piece createBlackRook() {
		return createBlack(Type.ROOK);
	}

	public static Piece createWhiteKnight() {
		return createWhite(Type.KNIGHT);
	}

	public static Piece createBlackKnight() {
		return createBlack(Type.KNIGHT);
	}

	public static Piece createWhiteBishop() {
		return createWhite(Type.BISHOP);
	}

	public static Piece createBlackBishop() {
		return createBlack(Type.BISHOP);
	}

	public static Piece createWhiteQueen() {
		return createWhite(Type.QUEEN);
	}

	public static Piece createBlackQueen() {
		return createBlack(Type.QUEEN);
	}

	public static Piece createWhiteKing() {
		return createWhite(Type.KING);
	}
	
	public static Piece createBlackKing() {
		return createBlack(Type.KING);
	}

	public boolean matchColorAndType(Color color, Type type) {
		if (matchColor(color) && this.type == type) {
			return true;
		}
		
		return false;
	}
	
	public boolean matchColor(Color color) {
		return this.color == color ? true : false;
	}

	public void changePiece(Piece targetPiece) {
		this.color = targetPiece.color;
		this.type = targetPiece.type;
		this.point = type.getDefaultPoint();
	}
	
	public double getPoint() {
		return this.point;
	}
	
	private double getDefaultPoint() {
		return type.getDefaultPoint();
	}
	
	public double calculate(Piece target) {
		if (this.type != Type.PAWN) {
			return this.point;
		}
		
		if (this.x != target.x) {
			return this.point;
		}
		
		if (this.y == target.y) {
			return this.point;
		}
		
		if (this.type == target.type) {
			this.point = 1.0;
			return this.point;
		}
		
		return this.point;
	}
	
	public Piece changeX(int x) {
		this.x = x;
		return this;
	}
	
	public int getX() {
		return this.x;
	}
	
	public Piece changeY(int y) {
		this.y = y;
		return this;
	}
	
	public int getY() {
		return this.y;
	}
	
	ArrayList<Position> getPossibleMoves() {
		ArrayList<Position> positions = new ArrayList<Position>();
		for (int i = 1; i < 8; i++) {
			positions.add(new Position(x + i, y));
			positions.add(new Position(x, y + i));
		}
		
		return positions;
	}
	
	@Override
	public int compareTo(Piece target) {
		if (getDefaultPoint() > target.getDefaultPoint()) {
			return -1;
		}
		
		if (getDefaultPoint() < target.getDefaultPoint()) {
			return 1;
		}
		
		return 0;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Piece other = (Piece) obj;
		if (color != other.color)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Piece [color=" + color + ", type=" + type + "]";
	}
}
