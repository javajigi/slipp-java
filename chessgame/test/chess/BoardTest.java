package chess;

import static pieces.Piece.Color.BLACK;
import static pieces.Piece.Color.WHITE;
import static pieces.Piece.Type.PAWN;
import junit.framework.TestCase;
import pieces.Piece;

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
	
	public void testCleanBoard() throws Exception {
		board.clean();
		for (int i=0; i<8; i++) {
			assertEquals(EMPTY_ROW, board.printRow(i));
		}
		System.out.println(board.print());
	}
	
	public void testSetPieceByPosition() throws Exception {
		board.clean();
		Piece piece = Piece.createBlackKing();
		String targetPos = "b6";
		board.setPieceByPosition(piece, targetPos);
		assertEquals(piece, board.getPieceByPosition(targetPos));
		assertEquals(1, Piece.countBlackPieces());
	}
	
	public void testGetScoreOnePawnInColumn() {
		board.clean();
		board.setPieceByPosition(Piece.createBlackBishop(), "a1");
		board.setPieceByPosition(Piece.createBlackQueen(), "b2");
		board.setPieceByPosition(Piece.createBlackKnight(), "c3");
		board.setPieceByPosition(Piece.createBlackPawn(), "f3");
		board.setPieceByPosition(Piece.createBlackRook(), "g4");
		
		assertEquals(20.5, board.getScore(BLACK));
	}
	public void testGetScoreMoreThanOnePawnInColumn() {
		board.clean();
		board.setPieceByPosition(Piece.createBlackBishop(), "a1");
		board.setPieceByPosition(Piece.createBlackQueen(), "b2");
		board.setPieceByPosition(Piece.createBlackKnight(), "c3");
		board.setPieceByPosition(Piece.createBlackPawn(), "f3");
		board.setPieceByPosition(Piece.createBlackPawn(), "f4");
		board.setPieceByPosition(Piece.createBlackPawn(), "f5");
		board.setPieceByPosition(Piece.createBlackRook(), "g4");
		
		assertEquals(21.0, board.getScore(BLACK));
	}
}
