package pieces;

import junit.framework.TestCase;

public class PieceTest extends TestCase {
	public void testCreate() {
		Piece whitePawn = Piece.create(Piece.COLOR_WHITE, Piece.SYMBOL_PAWN);
		assertEquals(Piece.COLOR_WHITE, whitePawn.getColor());
		assertEquals(Piece.SYMBOL_PAWN, whitePawn.getSymbol());

		Piece blackPawn = Piece.create(Piece.COLOR_BLACK, Piece.SYMBOL_PAWN);
		assertEquals(Piece.COLOR_BLACK, blackPawn.getColor());
		assertEquals(Character.toUpperCase(Piece.SYMBOL_PAWN), blackPawn.getSymbol());
	}
	
	public void testCountWhitePieces() throws Exception {
		Piece.resetCountPieces();
		Piece.create(Piece.COLOR_WHITE, Piece.SYMBOL_PAWN);
		assertEquals(1, Piece.countWhitePieces());
	}
	
	public void testCountBlackPieces() throws Exception {
		Piece.resetCountPieces();
		Piece.create(Piece.COLOR_BLACK, Piece.SYMBOL_PAWN);
		assertEquals(1, Piece.countBlackPieces());
	}
}
