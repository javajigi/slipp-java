package pieces;

import junit.framework.TestCase;

public class PieceTest extends TestCase {
	public void testCreate() {
		Piece whitePawn = new Piece(Piece.COLOR_WHITE, Piece.SYMBOL_LOWERCASE_PAWN);
		assertEquals(Piece.COLOR_WHITE, whitePawn.getColor());
		assertEquals(Piece.SYMBOL_LOWERCASE_PAWN, whitePawn.getSymbol());

		Piece blackPawn = new Piece(Piece.COLOR_BLACK, Piece.SYMBOL_UPPERCASE_PAWN);
		assertEquals(Piece.COLOR_BLACK, blackPawn.getColor());
		assertEquals(Piece.SYMBOL_UPPERCASE_PAWN, blackPawn.getSymbol());
	}
}
