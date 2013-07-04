package chess;

import java.util.ArrayList;

import pieces.Piece;
import pieces.Piece.Color;
import pieces.Piece.Type;

class Board {
	static final String NEW_LINE = System.getProperty("line.separator");
	
	ArrayList<Rank> ranks = new ArrayList<Rank>();
	
	Board() {
		initialize();
	}

	private void initialize() {
		Piece.resetCountPieces();
		for (int i = 0; i < 8; i++) {
			Rank rank = new Rank();
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

	Piece findPiece(String position) {
		char columnIndex = position.substring(0, 1).toCharArray()[0];
		int rowIndex = Integer.parseInt(position.substring(1));
		Rank rank = ranks.get(rowIndex-1);
		return rank.findPiece(columnIndex);
	}
}
