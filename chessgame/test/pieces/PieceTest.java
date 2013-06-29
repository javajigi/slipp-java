package pieces;

import static pieces.Piece.Color.*;
import static pieces.Piece.Symbol.*;

import junit.framework.TestCase;

public class PieceTest extends TestCase {
	public void testCreate() {
		Piece whitePawn = Piece.createWhitePawn(); 
		assertEquals(WHITE, whitePawn.getColor());
		assertEquals(PAWN.getSymbol(), whitePawn.getSymbol());

		Piece blackPawn = Piece.createBlackPawn();
		assertEquals(BLACK, blackPawn.getColor());
		assertEquals(Character.toUpperCase(PAWN.getSymbol()), blackPawn.getSymbol());
	}
	
	public void testCountWhitePieces() throws Exception {
		Piece.resetCountPieces();
		Piece.createWhitePawn(); 
		assertEquals(1, Piece.countWhitePieces());
	}
	
	public void testCountBlackPieces() throws Exception {
		Piece.resetCountPieces();
		Piece.createBlackPawn(); 
		assertEquals(1, Piece.countBlackPieces());
	}
	
    public void testIsWhite() throws Exception {
        Piece whitePawn = Piece.createWhitePawn();
        assertTrue(whitePawn.isWhite());
    }
    
    public void testIsBlack() throws Exception {
        Piece blackPawn = Piece.createBlackPawn();
        assertTrue(blackPawn.isBlack());
    }
}
