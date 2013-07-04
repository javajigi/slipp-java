package chess;

import static pieces.Piece.Color.*;
import static pieces.Piece.Type.*;

import java.util.ArrayList;

import pieces.Piece;
import pieces.Piece.Color;
import pieces.Piece.Type;

public class Rank {
	private static final char COLUMN_START_CHAR = 'a';
	private ArrayList<Piece> rank = new ArrayList<Piece>();

	void initializeEmpty() {
		for (int i = 0; i < 8; i++) {
			rank.add(Piece.noPiece());
		}
	}
	
	void initializeWhitePawn() {
		for (int i = 0; i < 8; i++) {
			rank.add(Piece.createWhitePawn());
		}
	}
	
	void initializeBlackPawn() {
		for (int i = 0; i < 8; i++) {
			rank.add(Piece.createBlackPawn());
		}
	}
	
	void initializeWhiteExceptPawn() {
		rank.add(Piece.create(WHITE, ROOK));
		rank.add(Piece.create(WHITE, KNIGHT));
		rank.add(Piece.create(WHITE, BISHOP));
		rank.add(Piece.create(WHITE, QUEEN));
		rank.add(Piece.create(WHITE, KING));
		rank.add(Piece.create(WHITE, BISHOP));
		rank.add(Piece.create(WHITE, KNIGHT));
		rank.add(Piece.create(WHITE, ROOK));
	}
	

	void initializeBlackExceptPawn() {
		rank.add(Piece.create(BLACK, ROOK));
		rank.add(Piece.create(BLACK, KNIGHT));
		rank.add(Piece.create(BLACK, BISHOP));
		rank.add(Piece.create(BLACK, QUEEN));
		rank.add(Piece.create(BLACK, KING));
		rank.add(Piece.create(BLACK, BISHOP));
		rank.add(Piece.create(BLACK, KNIGHT));
		rank.add(Piece.create(BLACK, ROOK));		
	}

	String print() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			sb.append(rank.get(i).getSymbol());
		}
		return sb.toString();
	}

	int countPiecesByColorAndType(Color color, Type type) {
		int count = 0;
		
		for (int i = 0; i < 8; i++) {
			Piece piece = rank.get(i);
			if (piece.matchColorAndType(color, type)) {
				count++;
			}
		}
		
		return count;
	}

	public Piece findPiece(char columnIndex) {
		return rank.get(generateColumnIndex(columnIndex));
	}
	
	private int generateColumnIndex(char columnIndex) {
		int target = Character.getNumericValue(columnIndex);
		int source = Character.getNumericValue(COLUMN_START_CHAR);
		return target - source;
	}

	void addPiece(char columnIndex, Piece piece) {
		Piece originalPiece = findPiece(columnIndex);
		originalPiece.changePiece(piece);
	}
}
