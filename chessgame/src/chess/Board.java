package chess;

import java.util.ArrayList;

import pieces.Pawn;

class Board {
	ArrayList<Pawn> pawns = new ArrayList<Pawn>();
	
	Board() {
		addPawn(new Pawn(Pawn.COLOR_WHITE, Pawn.SYMBOL_LOWERCASE_PAWN));
		addPawn(new Pawn(Pawn.COLOR_BLACK, Pawn.SYMBOL_UPPERCASE_PAWN));
	}

	void addPawn(Pawn pawn) {
		pawns.add(pawn);
	}

	int countPawnSize() {
		return pawns.size();
	}

	ArrayList<Pawn> getPawns() {
		return pawns;
	}

}
