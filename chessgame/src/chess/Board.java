package chess;

import java.util.ArrayList;

import pieces.Piece;

class Board {
	static final String NEW_LINE = System.getProperty("line.separator");
	static final String EMPTY_ROW = "........";
	
	ArrayList<ArrayList<Piece>> rows = new ArrayList<ArrayList<Piece>>();
	
	Board() {
		initialize();
	}

	private void initialize() {
		for (int i = 0; i < 8; i++) {
			ArrayList<Piece> row = new ArrayList<Piece>();
			
			if (i==1) {
				for (int j = 0; j < 8; j++) {
					row.add(new Piece(Piece.COLOR_WHITE, Piece.SYMBOL_LOWERCASE_PAWN));
				}
			}
			
			if (i==6) {
				for (int j = 0; j < 8; j++) {
					row.add(new Piece(Piece.COLOR_BLACK, Piece.SYMBOL_UPPERCASE_PAWN));
				}
			}			
			
			rows.add(row);
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
			if (i==7) {
				sb.append(printRow(i-1) + NEW_LINE);
				continue;
			}
			
			if (i==2) {
				sb.append(printRow(i-1) + NEW_LINE);
				continue;
			}
			
			sb.append(EMPTY_ROW + NEW_LINE);
		}
		return sb.toString();
	}
}
