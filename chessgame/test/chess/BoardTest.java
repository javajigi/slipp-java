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
			createEmptyRow() + 
			"PPPPPPPP" + Board.NEW_LINE +
			createEmptyRow() + 
			createEmptyRow() + 
			createEmptyRow() + 
			createEmptyRow() +
			"pppppppp" + Board.NEW_LINE +
			createEmptyRow();
		assertEquals(expected, board.print());
		System.out.println(board.print());
	}
	
	private String createEmptyRow() {
		return EMPTY_ROW + Board.NEW_LINE;
	}
}
