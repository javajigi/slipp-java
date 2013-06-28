package chess;

import java.util.ArrayList;

import pieces.Pawn;

class Board {
	ArrayList<ArrayList<Pawn>> rows = new ArrayList<ArrayList<Pawn>>();
	
	Board() {
		initialize();
	}

	private void initialize() {
		for (int i = 0; i < 8; i++) {
			ArrayList<Pawn> row = new ArrayList<Pawn>();
			
			if (i==1) {
				for (int j = 0; j < 8; j++) {
					row.add(new Pawn(Pawn.COLOR_WHITE, Pawn.SYMBOL_LOWERCASE_PAWN));
				}
			}
			
			if (i==6) {
				for (int j = 0; j < 8; j++) {
					row.add(new Pawn(Pawn.COLOR_BLACK, Pawn.SYMBOL_UPPERCASE_PAWN));
				}
			}			
			
			rows.add(row);
		}
	}

	String printRow(int rowIndex) {
		ArrayList<Pawn> row = rows.get(rowIndex);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			sb.append(row.get(i).getSymbol());
		}
		return sb.toString();
	}

	String print() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			sb.append(printRow(i));
		}
		return sb.toString();
	}
}
