package chess;

import static pieces.Piece.Color.*;
import static pieces.Piece.Type.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import pieces.Piece;
import pieces.PieceComparator;
import pieces.Piece.Color;
import pieces.Piece.Type;

public class Row {
	private ArrayList<Piece> row = new ArrayList<Piece>();

	void initializeEmpty() {
		for (int i = 0; i < 8; i++) {
			row.add(Piece.noPiece());
		}
	}
	
	void initializeWhitePawn() {
		for (int i = 0; i < 8; i++) {
			row.add(Piece.createWhitePawn());
		}
	}
	
	void initializeBlackPawn() {
		for (int i = 0; i < 8; i++) {
			row.add(Piece.createBlackPawn());
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

	public int getCount(Color color, Type type) {
		int pieceCount = 0;
		
		for (Piece piece : row) {
			if (piece.equals(Piece.create(color, type))) {
				pieceCount++;
			}
		}
		return pieceCount;
	}

	public Piece getPieceByIndex(int index) {
		
		return row.get(index);
	}

	public void setPieceByIdx(int index, Piece piece) {
		row.set(index, piece);
	}
	
	
	public double getScoreInRow(Color color, HashMap<Integer, Integer> pawnMap) {
		double score=0;
		int colIndex = 0;
		for (Piece piece : row) {
			int pawnCount = pawnMap.get(colIndex);
			if (piece.getColor() == color) {
				score += piece.getType().getPoint();
				if(piece.getType() == PAWN) {
					pawnMap.put(colIndex, ++pawnCount);
				}
			}
			++colIndex;
		}
		return score;
	}

	public ArrayList<Piece> getBlackPieces() {
		ArrayList<Piece> blackPieces = new ArrayList<Piece>();
		for (Piece piece : row) {
			if (piece.getColor() == Color.BLACK) {
				blackPieces.add(piece);
			}
		}
		Collections.sort(blackPieces, new PieceComparator());
		return blackPieces;
	}
	
	public ArrayList<Piece> getWhitePieces() {
		ArrayList<Piece> whitePieces = new ArrayList<Piece>();
		for (Piece piece : row) {
			if (piece.getColor() == Color.WHITE) {
				whitePieces.add(piece);
			}
		}
		return whitePieces;
	}
	
}
