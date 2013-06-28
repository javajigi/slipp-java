package chess;

import java.util.ArrayList;

import pieces.Piece;

class Board {
	static final String NEW_LINE = System.getProperty("line.separator");
	
	ArrayList<ArrayList<Piece>> rows = new ArrayList<ArrayList<Piece>>();
	
	Board() {
		initialize();
	}

	private void initialize() {
		for (int i = 0; i < 8; i++) {
			ArrayList<Piece> row = new ArrayList<Piece>();
			rows.add(row);
			
			for (int j = 0; j < 8; j++) {
				if (i==1) {
					row.add(new Piece(Piece.COLOR_WHITE, Piece.SYMBOL_LOWERCASE_PAWN));
				} else if (i==6) {
					row.add(new Piece(Piece.COLOR_BLACK, Piece.SYMBOL_UPPERCASE_PAWN));
				} else {
					row.add(new Piece(Piece.COLOR_EMPTY, Piece.SYMBOL_EMPTY));
				}
			}
		}
	}

	String printRow(int rowIndex) {
		ArrayList<Piece> row = rows.get(rowIndex);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			sb.append(row.get(i).getSymbol());
		}
		return sb.toString();
	}

	String print() {
		StringBuilder sb = new StringBuilder();
		for (int i = 8; i > 0; i--) {
			sb.append(printRow(i-1) + NEW_LINE);
		}
		return sb.toString();
	}
}
