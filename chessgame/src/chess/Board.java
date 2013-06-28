package chess;

import java.util.ArrayList;

import pieces.Pawn;

class Board {
	ArrayList<ArrayList<Pawn>> rows = new ArrayList<ArrayList<Pawn>>();
	
	Board() {
		initialize();
	}

	private void initialize() {
		ArrayList<Pawn> firstRow = new ArrayList<Pawn>();
		rows.add(firstRow);
		ArrayList<Pawn> secondRow = new ArrayList<Pawn>();
		for (int i = 0; i < 8; i++) {
			secondRow.add(new Pawn(Pawn.COLOR_WHITE, Pawn.SYMBOL_LOWERCASE_PAWN));
		}
		rows.add(secondRow);
		ArrayList<Pawn> thirdRow = new ArrayList<Pawn>();
		rows.add(thirdRow);
		ArrayList<Pawn> fourthRow = new ArrayList<Pawn>();
		rows.add(fourthRow);
		ArrayList<Pawn> fifthRow = new ArrayList<Pawn>();
		rows.add(fifthRow);
		ArrayList<Pawn> sixthRow = new ArrayList<Pawn>();
		rows.add(sixthRow);
		ArrayList<Pawn> seventhRow = new ArrayList<Pawn>();
		for (int i = 0; i < 8; i++) {
			seventhRow.add(new Pawn(Pawn.COLOR_BLACK, Pawn.SYMBOL_UPPERCASE_PAWN));
		}
		rows.add(seventhRow);
		ArrayList<Pawn> eighthRow = new ArrayList<Pawn>();
		rows.add(eighthRow);
	}

	String printRow(int rowIndex) {
		ArrayList<Pawn> row = rows.get(rowIndex);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			sb.append(row.get(i).getSymbol());
		}
		return sb.toString();
	}
}
