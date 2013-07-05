package chess;

import java.util.ArrayList;
import java.util.Collections;

import pieces.Piece;
import pieces.Piece.Color;
import pieces.Piece.Type;

class Board {
	static final String NEW_LINE = System.getProperty("line.separator");
	
	ArrayList<Rank> ranks = new ArrayList<Rank>();
	
	Board() {
	}

	void initialize() {
		Piece.resetCountPieces();
		for (int i = 0; i < 8; i++) {
			Rank rank = new Rank(i);
			if (i==0) {
				rank.initializeWhiteExceptPawn();
			} else if (i==1) {
				rank.initializeWhitePawn();
			} else if (i==6) {	
				rank.initializeBlackPawn();
			} else if (i==7) {
				rank.initializeBlackExceptPawn();
			} else {
				rank.initializeEmpty();
			}
			ranks.add(rank);
		}
	}
	
	void initializeEmpty() {
		Piece.resetCountPieces();
		for (int i = 0; i < 8; i++) {
			Rank rank = new Rank(i);
			rank.initializeEmpty();
			ranks.add(rank);
		}
	}

	String printRank(int rankIndex) {
		Rank rank = ranks.get(rankIndex);
		StringBuilder sb = new StringBuilder();
		sb.append(rank.print());
		return sb.toString();
	}

	String print() {
		StringBuilder sb = new StringBuilder();
		for (int i = 8; i > 0; i--) {
			sb.append(printRank(i-1) + NEW_LINE);
		}
		return sb.toString();
	}

	int countPiecesByColorAndType(Color color, Type type) {
		int count = 0;
		for (int i = 0; i < 8; i++) {
			Rank rank = ranks.get(i);
			count += rank.countPiecesByColorAndType(color, type);
		}
		return count;
	}

	Piece findPiece(String xy) {
		Position position = new Position(xy);
		Rank rank = ranks.get(position.getY());
		return rank.findPiece(position.getX());
	}

	void addPiece(String xy, Piece targetPiece) {
		Position position = new Position(xy);
		Rank rank = ranks.get(position.getY());
		rank.changePiece(position.getX(), targetPiece);
	}

	ArrayList<Piece> findsPieceByColor(Color color) {
		ArrayList<Piece> pieces = new ArrayList<Piece>();
		for (Rank rank : ranks) {
			pieces.addAll(rank.findsPieceByColor(color));
		}
		Collections.sort(pieces);
		return pieces;
	}

	public double getTotalPointPerColor(Color color) {
		ArrayList<Piece> pieces = findsPieceByColor(color);
		double totalPoint = 0.0;
		for (Piece piece : pieces) {
			totalPoint += piece.getPoint();
		}
		return totalPoint;
	}
}
