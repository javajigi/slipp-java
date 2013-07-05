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
    
    public void testGetPointExceptPawn() throws Exception {
    	Piece whitePawn = Piece.createWhitePawn().changeX(1).changeY(2);
    	Piece whiteQueen = Piece.createWhiteQueen().changeX(1).changeY(3);
    	assertEquals(9.0, whiteQueen.getPoint(whitePawn));
    	assertEquals(5.0, Piece.createWhiteRook().getPoint(whitePawn));
    	assertEquals(3.0, Piece.createWhiteBishop().getPoint(whitePawn));
    	assertEquals(2.5, Piece.createWhiteKnight().getPoint(whitePawn));
	}
    
    public void testGetPointPawnWhenDifferentType() throws Exception {
    	Piece whitePawn = Piece.createWhitePawn().changeX(1).changeY(2);
    	Piece whiteQueen = Piece.createWhiteQueen().changeX(1).changeY(3);
    	assertEquals(0.5, whitePawn.getPoint(whiteQueen));
	}
    
    public void testGetPointPawnWhenSameXY() throws Exception {
    	Piece origin = Piece.createBlackPawn().changeX(1).changeY(2);
    	Piece target = Piece.createBlackPawn().changeX(1).changeY(2);
    	assertEquals(PAWN.getDefaultPoint(), origin.getPoint(target));
	}
    
    public void testGetPointPawnWhenSameY() throws Exception {
    	Piece origin = Piece.createBlackPawn().changeX(1).changeY(2);
    	Piece target = Piece.createBlackPawn().changeX(3).changeY(2);
    	assertEquals(PAWN.getDefaultPoint(), origin.getPoint(target));
	}
    
    public void testGetPointPawnWhenSameX() throws Exception {
    	Piece origin = Piece.createBlackPawn().changeX(1).changeY(2);
    	Piece target = Piece.createBlackPawn().changeX(1).changeY(4);
    	assertEquals(1.0, origin.getPoint(target));
	}
    
    public void testGetPointPawnWhenDifferentXY() throws Exception {
    	Piece origin = Piece.createBlackPawn().changeX(1).changeY(2);
    	Piece target = Piece.createBlackPawn().changeX(3).changeY(4);
    	assertEquals(PAWN.getDefaultPoint(), origin.getPoint(target));
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
