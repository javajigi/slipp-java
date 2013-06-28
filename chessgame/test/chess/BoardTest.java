package chess;

import junit.framework.TestCase;

public class BoardTest extends TestCase {
	public void testCreate() throws Exception {
		Board board = new Board();
		assertEquals("pppppppp", board.printRow(1));
		assertEquals("PPPPPPPP", board.printRow(6));
	}
	
	public void testPrint() throws Exception {
		Board board = new Board();
		String expected = 
			Board.EMPTY_ROW + Board.NEW_LINE + 
			"PPPPPPPP" + Board.NEW_LINE +
			Board.EMPTY_ROW + Board.NEW_LINE +
			Board.EMPTY_ROW + Board.NEW_LINE +
			Board.EMPTY_ROW + Board.NEW_LINE +
			Board.EMPTY_ROW + Board.NEW_LINE +
			"pppppppp" + Board.NEW_LINE +
			Board.EMPTY_ROW + Board.NEW_LINE;
		assertEquals(expected, board.print());
		System.out.println(board.print());
	}
}
