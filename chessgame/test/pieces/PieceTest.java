package pieces;

import junit.framework.TestCase;

public class PieceTest extends TestCase {
	public void testCreate() {
		Piece whitePawn = Piece.create(Piece.Color.WHITE, Piece.Symbol.PAWN);
		assertEquals(Piece.Color.WHITE, whitePawn.getColor());
		assertEquals(Piece.Symbol.PAWN.getSymbol(), whitePawn.getSymbol());

		Piece blackPawn = Piece.create(Piece.Color.BLACK, Piece.Symbol.PAWN);
		assertEquals(Piece.Color.BLACK, blackPawn.getColor());
		assertEquals(Character.toUpperCase(Piece.Symbol.PAWN.getSymbol()), blackPawn.getSymbol());
	}
	
	public void testCountWhitePieces() throws Exception {
		Piece.resetCountPieces();
		Piece.create(Piece.Color.WHITE, Piece.Symbol.PAWN);
		assertEquals(1, Piece.countWhitePieces());
	}
	
	public void testCountBlackPieces() throws Exception {
		Piece.resetCountPieces();
		Piece.create(Piece.Color.BLACK, Piece.Symbol.PAWN);
		assertEquals(1, Piece.countBlackPieces());
	}
	
    public void testIsWhite() throws Exception {
        Piece whitePawn = Piece.create(Piece.Color.WHITE, Piece.Symbol.PAWN);
        assertTrue(whitePawn.isWhite());
    }
    
    public void testIsBlack() throws Exception {
        Piece blackPawn = Piece.create(Piece.Color.BLACK, Piece.Symbol.PAWN);
        assertTrue(blackPawn.isBlack());
    }
}
