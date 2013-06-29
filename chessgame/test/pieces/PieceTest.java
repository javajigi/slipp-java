package pieces;

import static pieces.Piece.Color.*;
import static pieces.Piece.Symbol.*;

import junit.framework.TestCase;

public class PieceTest extends TestCase {
	public void testCreate() {
		Piece whitePawn = Piece.create(WHITE, PAWN);
		assertEquals(WHITE, whitePawn.getColor());
		assertEquals(Piece.Symbol.PAWN.getSymbol(), whitePawn.getSymbol());

		Piece blackPawn = Piece.create(BLACK, PAWN);
		assertEquals(BLACK, blackPawn.getColor());
		assertEquals(Character.toUpperCase(Piece.Symbol.PAWN.getSymbol()), blackPawn.getSymbol());
	}
	
	public void testCountWhitePieces() throws Exception {
		Piece.resetCountPieces();
		Piece.create(WHITE, PAWN);
		assertEquals(1, Piece.countWhitePieces());
	}
	
	public void testCountBlackPieces() throws Exception {
		Piece.resetCountPieces();
		Piece.create(BLACK, PAWN);
		assertEquals(1, Piece.countBlackPieces());
	}
	
    public void testIsWhite() throws Exception {
        Piece whitePawn = Piece.create(WHITE, PAWN);
        assertTrue(whitePawn.isWhite());
    }
    
    public void testIsBlack() throws Exception {
        Piece blackPawn = Piece.create(BLACK, PAWN);
        assertTrue(blackPawn.isBlack());
    }
}
