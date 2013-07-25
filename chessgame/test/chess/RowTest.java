package chess;

import junit.framework.TestCase;

public class RowTest extends TestCase {
	static final String EMPTY_ROW = "........";
	static final String WHITE_EXCEPT_PAWN_ROW = "rnbqkbnr";
	static final String BLACK_EXCEPT_PAWN_ROW = "RNBQKBNR";
	static final String WHITE_PAWN_ROW = "pppppppp";
	static final String BLACK_PAWN_ROW = "PPPPPPPP";
	
	public void testInitializeEmpty() throws Exception {
		Row row = new Row();
		row.initializeEmpty();
		assertEquals(EMPTY_ROW, row.print());
	}
	
	public void testInitializeWhitePawn() throws Exception {
		Row row = new Row();
		row.initializeWhitePawn();
		assertEquals(WHITE_PAWN_ROW, row.print());
	}
	
	
	public void testInitializeBlackPawn() throws Exception {
		Row row = new Row();
		row.initializeBlackPawn();
		assertEquals(BLACK_PAWN_ROW, row.print());
	}
	
	public void testInitializeWhiteExceptPawn() throws Exception {
		Row row = new Row();
		row.initializeWhiteExceptPawn();
		assertEquals(WHITE_EXCEPT_PAWN_ROW, row.print());
	}
	
	public void testInitializeBlackExceptPawn() throws Exception {
		Row row = new Row();
		row.initializeBlackExceptPawn();
		assertEquals(BLACK_EXCEPT_PAWN_ROW, row.print());
	}
}
