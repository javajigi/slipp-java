package chess;

import junit.framework.TestCase;

public class BoardTest extends TestCase {
	static final String EMPTY_ROW = "........";
	
	public void testCreate() throws Exception {
		Board board = new Board();
		assertEquals(RowTest.WHITE_PAWN_ROW, board.printRow(1));
		assertEquals(RowTest.BLACK_PAWN_ROW, board.printRow(6));
	}
	
	public void testPrint() throws Exception {
		Board board = new Board();
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
}
