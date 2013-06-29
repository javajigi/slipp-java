package chess;

import java.util.ArrayList;

import pieces.Piece;

public class Row {
	private ArrayList<Piece> row = new ArrayList<Piece>();

	void initializeEmpty() {
		for (int i = 0; i < 8; i++) {
			row.add(Piece.create(Piece.Color.EMPTY, Piece.Symbol.EMPTY));
		}
	}
	
	void initializeWhitePawn() {
		for (int i = 0; i < 8; i++) {
			row.add(Piece.create(Piece.Color.WHITE, Piece.Symbol.PAWN));
		}
	}
	
	void initializeBlackPawn() {
		for (int i = 0; i < 8; i++) {
			row.add(Piece.create(Piece.Color.BLACK, Piece.Symbol.PAWN));
		}
	}
	
	void initializeWhiteExceptPawn() {
		row.add(Piece.create(Piece.Color.WHITE, Piece.Symbol.ROOK));
		row.add(Piece.create(Piece.Color.WHITE, Piece.Symbol.KNIGHT));
		row.add(Piece.create(Piece.Color.WHITE, Piece.Symbol.BISHOP));
		row.add(Piece.create(Piece.Color.WHITE, Piece.Symbol.QUEEN));
		row.add(Piece.create(Piece.Color.WHITE, Piece.Symbol.KING));
		row.add(Piece.create(Piece.Color.WHITE, Piece.Symbol.BISHOP));
		row.add(Piece.create(Piece.Color.WHITE, Piece.Symbol.KNIGHT));
		row.add(Piece.create(Piece.Color.WHITE, Piece.Symbol.ROOK));
	}
	

	void initializeBlackExceptPawn() {
		row.add(Piece.create(Piece.Color.BLACK, Piece.Symbol.ROOK));
		row.add(Piece.create(Piece.Color.BLACK, Piece.Symbol.KNIGHT));
		row.add(Piece.create(Piece.Color.BLACK, Piece.Symbol.BISHOP));
		row.add(Piece.create(Piece.Color.BLACK, Piece.Symbol.QUEEN));
		row.add(Piece.create(Piece.Color.BLACK, Piece.Symbol.KING));
		row.add(Piece.create(Piece.Color.BLACK, Piece.Symbol.BISHOP));
		row.add(Piece.create(Piece.Color.BLACK, Piece.Symbol.KNIGHT));
		row.add(Piece.create(Piece.Color.BLACK, Piece.Symbol.ROOK));		
	}

	String print() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			sb.append(row.get(i).getSymbol());
		}
		return sb.toString();
	}
}
