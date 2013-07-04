package chess;

import static pieces.Piece.Color.BLACK;
import static pieces.Piece.Color.WHITE;
import static pieces.Piece.Type.BISHOP;
import static pieces.Piece.Type.KING;
import static pieces.Piece.Type.PAWN;
import junit.framework.TestCase;
import pieces.Piece;

public class BoardTest extends TestCase {
	private Board board;
	
	@Override
	protected void setUp() throws Exception {
		Piece.resetCountPieces();
		board = new Board();
	}
	
	public void testCreate() throws Exception {
		board.initialize();
		assertEquals(RankTest.WHITE_PAWN_RANK, board.printRank(1));
		assertEquals(RankTest.BLACK_PAWN_RANK, board.printRank(6));
	}
	
	public void testPrint() throws Exception {
		board.initialize();
		String expected = 
			RankTest.BLACK_EXCEPT_PAWN_RANK + Board.NEW_LINE +
			RankTest.BLACK_PAWN_RANK + Board.NEW_LINE +
			createEmptyRank() + 
			createEmptyRank() + 
			createEmptyRank() + 
			createEmptyRank() +
			RankTest.WHITE_PAWN_RANK + Board.NEW_LINE +
			RankTest.WHITE_EXCEPT_PAWN_RANK + Board.NEW_LINE;
		assertEquals(expected, board.print());
		System.out.println(board.print());
	}
	
	private String createEmptyRank() {
		return RankTest.EMPTY_RANK + Board.NEW_LINE;
	}
	
	public void testCountPieces() throws Exception {
		board.initialize();
		assertEquals(16, Piece.countWhitePieces());
		assertEquals(16, Piece.countBlackPieces());
	}
	
	public void testCountPiecesByColorAndType() throws Exception {
		board.initialize();
		assertEquals(8, board.countPiecesByColorAndType(BLACK, PAWN));
		assertEquals(8, board.countPiecesByColorAndType(WHITE, PAWN));
		assertEquals(1, board.countPiecesByColorAndType(BLACK, KING));
		assertEquals(1, board.countPiecesByColorAndType(WHITE, KING));
		assertEquals(2, board.countPiecesByColorAndType(BLACK, BISHOP));
		assertEquals(2, board.countPiecesByColorAndType(WHITE, BISHOP));
	}
	
	public void testFindPiece() throws Exception {
		board.initialize();
		assertEquals('R', board.findPiece("a8").getSymbol());
		assertEquals('k', board.findPiece("e1").getSymbol());
	}
	
	public void testInitializeEmpty() throws Exception {
		board.initializeEmpty();
		System.out.println(board.print());
	}
}
