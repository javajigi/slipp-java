package net.slipp.chessgame;

import net.slipp.chessgame.Piece.Color;
import net.slipp.chessgame.Piece.Type;
import junit.framework.TestCase;

public class RankTest extends TestCase {
	private static final int COLUMN_SIZE = 8;

	public void testInitializeWhitePawn() throws Exception {
		int rowNo = 1;
		Rank rank = new Rank(rowNo);
		rank.initializeWhitePawn();

		for (int i = 0; i < COLUMN_SIZE; i++) {
			Piece expected = new Piece(Color.WHITE, Type.PAWN, new Position(i, rowNo));
			assertTrue(rank.contains(expected));
		}
	}
	
	public void testAddPiece() throws Exception {
		int rowNo = 3;
		
		Rank rank = new Rank(rowNo);
		rank.initializeEmpty();
		rank.addPiece(new Piece(Color.WHITE, Type.KNIGHT, new Position(1, rowNo)));
		rank.addPiece(new Piece(Color.WHITE, Type.QUEEN, new Position(2, rowNo)));
		
		assertEquals(3, rank.countOfPieceKinds());
	}
	
	public void testFindPiece() throws Exception {
		int rowNo = 3;
		
		Rank rank = new Rank(rowNo);
		rank.initializeEmpty();
		Piece kinght = new Piece(Color.WHITE, Type.KNIGHT, new Position(1, rowNo));
		rank.addPiece(kinght);
		rank.addPiece(new Piece(Color.WHITE, Type.QUEEN, new Position(2, rowNo)));
		
		assertEquals(kinght, rank.findPiece(new Position(1, rowNo)));
	}
}
