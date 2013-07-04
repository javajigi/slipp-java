package chess;

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
		rank.add(Piece.createWhiteRook());
		rank.add(Piece.createWhiteKnight());
		rank.add(Piece.createWhiteBishop());
		rank.add(Piece.createWhiteQueen());
		rank.add(Piece.createWhiteKing());
		rank.add(Piece.createWhiteBishop());
		rank.add(Piece.createWhiteKnight());
		rank.add(Piece.createWhiteRook());
	}
	

	void initializeBlackExceptPawn() {
		rank.add(Piece.createBlackRook());
		rank.add(Piece.createBlackKnight());
		rank.add(Piece.createBlackBishop());
		rank.add(Piece.createBlackQueen());
		rank.add(Piece.createBlackKing());
		rank.add(Piece.createBlackBishop());
		rank.add(Piece.createBlackKnight());
		rank.add(Piece.createBlackRook());
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

	Piece findPiece(int xPosition) {
		return rank.get(xPosition);
	}

	void changePiece(int xPosition, Piece targetPiece) {
		Piece piece = findPiece(xPosition);
		piece.changePiece(targetPiece);
	}
}
