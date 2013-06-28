package chess;

import junit.framework.TestCase;

public class BoardTest extends TestCase {
	public void testCreate() throws Exception {
		Board board = new Board();
		assertEquals("pppppppp", board.printRow(1));
		assertEquals("PPPPPPPP", board.printRow(6));
	}
}
