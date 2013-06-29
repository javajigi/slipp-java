package chess;

import static pieces.Piece.Color.*;
import static pieces.Piece.Symbol.*;

import java.util.ArrayList;

import pieces.Piece;

public class Row {
	private ArrayList<Piece> row = new ArrayList<Piece>();

	void initializeEmpty() {
		for (int i = 0; i < 8; i++) {
			row.add(Piece.create(NOCOLOR, EMPTY));
		}
	}
	
	void initializeWhitePawn() {
		for (int i = 0; i < 8; i++) {
			row.add(Piece.create(WHITE, PAWN));
		}
	}
	
	void initializeBlackPawn() {
		for (int i = 0; i < 8; i++) {
			row.add(Piece.create(BLACK, PAWN));
		}
	}
	
	void initializeWhiteExceptPawn() {
		row.add(Piece.create(WHITE, ROOK));
		row.add(Piece.create(WHITE, KNIGHT));
		row.add(Piece.create(WHITE, BISHOP));
		row.add(Piece.create(WHITE, QUEEN));
		row.add(Piece.create(WHITE, KING));
		row.add(Piece.create(WHITE, BISHOP));
		row.add(Piece.create(WHITE, KNIGHT));
		row.add(Piece.create(WHITE, ROOK));
	}
	

	void initializeBlackExceptPawn() {
		row.add(Piece.create(BLACK, ROOK));
		row.add(Piece.create(BLACK, KNIGHT));
		row.add(Piece.create(BLACK, BISHOP));
		row.add(Piece.create(BLACK, QUEEN));
		row.add(Piece.create(BLACK, KING));
		row.add(Piece.create(BLACK, BISHOP));
		row.add(Piece.create(BLACK, KNIGHT));
		row.add(Piece.create(BLACK, ROOK));		
	}

	String print() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			sb.append(row.get(i).getSymbol());
		}
		return sb.toString();
	}
}
