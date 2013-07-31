package chess;

import java.util.ArrayList;
import java.util.HashMap;

import pieces.Piece;
import pieces.Piece.Color;
import pieces.Piece.Type;

class Board {
	static final String NEW_LINE = System.getProperty("line.separator");
	
	
	ArrayList<Row> rows = new ArrayList<Row>();
	
	Board() {
		initialize();
	}

	private void initialize() {
		Piece.resetCountPieces();
		for (int i = 0; i < 8; i++) {
			Row row = new Row();
			if (i==0) {
				row.initializeWhiteExceptPawn();
			} else if (i==1) {
				row.initializeWhitePawn();
			} else if (i==6) {		
				row.initializeBlackPawn();
			} else if (i==7) {
				row.initializeBlackExceptPawn();
			} else {
				row.initializeEmpty();
			}
			rows.add(row);
		}
	}

	String printRow(int rowIndex) {
		Row row = rows.get(rowIndex);
		StringBuilder sb = new StringBuilder();
		sb.append(row.print());
		return sb.toString();
	}

	String print() {
		StringBuilder sb = new StringBuilder();
		for (int i = 8; i > 0; i--) {
			sb.append(printRow(i-1) + NEW_LINE);
		}
		return sb.toString();
	}

	public int getCount(Color color, Type type) {
		int pieceCount = 0;
		
		for (Row row : rows) {
			pieceCount += row.getCount(color, type);			
		}
		return pieceCount;
	}

	public Piece getPieceByPosition(String position) {
		Position pos = new Position(position);
		Row row = rows.get(pos.getY());
		return row.getPieceByIndex(pos.getX());
	}

	public void clean() {
		rows = new ArrayList<Row>(8);
		Piece.resetCountPieces();
		for (int i = 0; i < 8; i++) {
			Row row = new Row();
			row.initializeEmpty();
			rows.add(row);
		}		
	}

	public void setPieceByPosition(Piece piece, String _position) {
		Position targetPos = new Position(_position);
		rows.get(targetPos.getY()).setPieceByIdx(targetPos.getX(), piece);
	}

	
	public double getScore(Color color) {
		HashMap<Integer,Integer> pawnMap = new HashMap<Integer,Integer>();
		double score=0;
		double pawnSameColumnScore = Type.PAWN.getPoint() * 0.5;
		
		
		for(int i=0; i<8; ++i){
			pawnMap.put(i, 0);
		}
		
		for (Row row : rows) {
			score += row.getScoreInRow(color, pawnMap);
		}
		
		for(int i=0; i<8; ++i){
			int pawnNumber = pawnMap.get(i);
			if (pawnNumber > 1)
				score = score - (pawnNumber * pawnSameColumnScore);
		}		
		
		return score;
	}
}
