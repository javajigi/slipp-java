package pieces;

import static pieces.Piece.Color.*;
import static pieces.Piece.Type.*;

import junit.framework.TestCase;

public class PieceTest extends TestCase {
	public void testCreate() {
		verifyCreation(Piece.createWhitePawn(), Piece.createBlackPawn(), PAWN);
		verifyCreation(Piece.createWhiteRook(), Piece.createBlackRook(), ROOK);
		verifyCreation(Piece.createWhiteKnight(), Piece.createBlackKnight(), KNIGHT);
		verifyCreation(Piece.createWhiteBishop(), Piece.createBlackBishop(), BISHOP);
		verifyCreation(Piece.createWhiteQueen(), Piece.createBlackQueen(), QUEEN);
		verifyCreation(Piece.createWhiteKing(), Piece.createBlackKing(), KING);
		Piece piece = Piece.noPiece();
		assertEquals(NOCOLOR, piece.getColor());
		assertEquals(EMPTY.getSymbol(), piece.getSymbol());
	}
	
	private void verifyCreation(Piece whitePiece, Piece blackPiece, Piece.Type type) {
		assertEquals(WHITE, whitePiece.getColor());
		assertEquals(type.getSymbol(), whitePiece.getSymbol());
		assertEquals(BLACK, blackPiece.getColor());
		assertEquals(Character.toUpperCase(type.getSymbol()), blackPiece.getSymbol());
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
    
    public void testGetPoint() throws Exception {
    	assertEquals(9.0, Piece.createWhiteQueen().getPoint());
    	assertEquals(5.0, Piece.createWhiteRook().getPoint());
    	assertEquals(3.0, Piece.createWhiteBishop().getPoint());
    	assertEquals(2.5, Piece.createWhiteKnight().getPoint());
	}
    
    public void testChangeX() throws Exception {
		Piece pawn = Piece.createWhitePawn();
		int x = 3;
		
		pawn.changeX(x);
		assertEquals(x, pawn.getX());
	}
    
    public void testChangeY() throws Exception {
		Piece pawn = Piece.createWhitePawn();
		int y = 3;
		
		pawn.changeY(y);
		assertEquals(y, pawn.getY());
	}
}
