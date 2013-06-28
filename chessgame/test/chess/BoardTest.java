package chess;

import junit.framework.TestCase;

public class BoardTest extends TestCase {
	static final String EMPTY_ROW = "........";
	
	public void testCreate() throws Exception {
		Board board = new Board();
		assertEquals("pppppppp", board.printRow(1));
		assertEquals("PPPPPPPP", board.printRow(6));
	}
	
	public void testPrint() throws Exception {
		Board board = new Board();
		String expected = 
			EMPTY_ROW + Board.NEW_LINE + 
			"PPPPPPPP" + Board.NEW_LINE +
			EMPTY_ROW + Board.NEW_LINE +
			EMPTY_ROW + Board.NEW_LINE +
			EMPTY_ROW + Board.NEW_LINE +
			EMPTY_ROW + Board.NEW_LINE +
			"pppppppp" + Board.NEW_LINE +
			EMPTY_ROW + Board.NEW_LINE;
		assertEquals(expected, board.print());
		System.out.println(board.print());
	}
}
