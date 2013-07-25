package chess;

import static pieces.Piece.Type.*;
import static pieces.Piece.Color.*;
import pieces.Piece;
import junit.framework.TestCase;

public class BoardTest extends TestCase {
	static final String EMPTY_ROW = "........";
	
	private Board board;
	
	@Override
	protected void setUp() throws Exception {
		Piece.resetCountPieces();
		board = new Board();
	}
	
	public void testCreate() throws Exception {
		assertEquals(RowTest.WHITE_PAWN_ROW, board.printRow(1));
		assertEquals(RowTest.BLACK_PAWN_ROW, board.printRow(6));
	}
	
	public void testPrint() throws Exception {
		String expected = 
			RowTest.BLACK_EXCEPT_PAWN_ROW + Board.NEW_LINE +
			RowTest.BLACK_PAWN_ROW + Board.NEW_LINE +
			createEmptyRow() + 
			createEmptyRow() + 
			createEmptyRow() + 
			createEmptyRow() +
			RowTest.WHITE_PAWN_ROW + Board.NEW_LINE +
			RowTest.WHITE_EXCEPT_PAWN_ROW + Board.NEW_LINE;
		assertEquals(expected, board.print());
		System.out.println(board.print());
	}
	
	private String createEmptyRow() {
		return EMPTY_ROW + Board.NEW_LINE;
	}
	
	public void testCountPieces() throws Exception {
		assertEquals(16, Piece.countWhitePieces());
		assertEquals(16, Piece.countBlackPieces());
	}
	
	public void testCount() throws Exception {
		assertEquals(8, board.getCount(WHITE,PAWN));
	}
	
	public void testGetPieceByPosition() throws Exception {
		assertEquals(Piece.createBlackRook(), board.getPieceByPosition("h8"));
	}
	
}
