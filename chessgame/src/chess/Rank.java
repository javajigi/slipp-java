package chess;

import static pieces.Piece.Color.BLACK;
import static pieces.Piece.Color.WHITE;
import static pieces.Piece.Type.BISHOP;
import static pieces.Piece.Type.KING;
import static pieces.Piece.Type.KNIGHT;
import static pieces.Piece.Type.QUEEN;
import static pieces.Piece.Type.ROOK;

import java.util.ArrayList;

import pieces.Piece;
import pieces.Piece.Color;
import pieces.Piece.Type;

public class Rank {
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

	public Piece findPiece(int xPosition) {
		return rank.get(xPosition);
	}
}
