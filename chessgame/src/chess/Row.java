package chess;

import java.util.ArrayList;

import pieces.Piece;

public class Row {
	private ArrayList<Piece> row = new ArrayList<Piece>();

	void initializeEmpty() {
		for (int i = 0; i < 8; i++) {
			row.add(new Piece(Piece.COLOR_EMPTY, Piece.SYMBOL_EMPTY));
		}
	}
	
	void initializeWhitePawn() {
		for (int i = 0; i < 8; i++) {
			row.add(new Piece(Piece.COLOR_WHITE, Piece.SYMBOL_PAWN));
		}
	}
	
	void initializeBlackPawn() {
		for (int i = 0; i < 8; i++) {
			row.add(new Piece(Piece.COLOR_BLACK, Piece.SYMBOL_PAWN));
		}
	}

	String print() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			sb.append(row.get(i).getSymbol());
		}
		return sb.toString();
	}
}
