package chess;

import java.util.ArrayList;

import pieces.Piece;
import pieces.Piece.Color;
import pieces.Piece.Type;

public class Rank {
	private ArrayList<Piece> rank = new ArrayList<Piece>();
	
	private int y;
	
	public Rank(int yPosition) {
		this.y = yPosition;
	}

	void initializeEmpty() {
		for (int i = 0; i < 8; i++) {
			rank.add(Piece.noPiece().changeX(i).changeY(y));
		}
	}
	
	void initializeWhitePawn() {
		for (int i = 0; i < 8; i++) {
			rank.add(Piece.createWhitePawn().changeX(i).changeY(y));
		}
	}
	
	void initializeBlackPawn() {
		for (int i = 0; i < 8; i++) {
			rank.add(Piece.createBlackPawn().changeX(i).changeY(y));
		}
	}
	
	void initializeWhiteExceptPawn() {
		rank.add(Piece.createWhiteRook().changeX(0).changeY(y));
		rank.add(Piece.createWhiteKnight().changeX(1).changeY(y));
		rank.add(Piece.createWhiteBishop().changeX(2).changeY(y));
		rank.add(Piece.createWhiteQueen().changeX(3).changeY(y));
		rank.add(Piece.createWhiteKing().changeX(4).changeY(y));
		rank.add(Piece.createWhiteBishop().changeX(5).changeY(y));
		rank.add(Piece.createWhiteKnight().changeX(6).changeY(y));
		rank.add(Piece.createWhiteRook().changeX(7).changeY(y));
	}
	

	void initializeBlackExceptPawn() {
		rank.add(Piece.createBlackRook().changeX(0).changeY(y));
		rank.add(Piece.createBlackKnight().changeX(1).changeY(y));
		rank.add(Piece.createBlackBishop().changeX(2).changeY(y));
		rank.add(Piece.createBlackQueen().changeX(3).changeY(y));
		rank.add(Piece.createBlackKing().changeX(4).changeY(y));
		rank.add(Piece.createBlackBishop().changeX(5).changeY(y));
		rank.add(Piece.createBlackKnight().changeX(6).changeY(y));
		rank.add(Piece.createBlackRook().changeX(7).changeY(y));
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

	ArrayList<Piece> findsPieceByColor(Color color) {
		ArrayList<Piece> pieces = new ArrayList<Piece>();
		for (Piece piece : rank) {
			if (piece.matchColor(color)) {
				pieces.add(piece);
			}
		}
		return pieces;
	}
}
