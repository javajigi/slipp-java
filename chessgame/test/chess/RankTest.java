package chess;

import static pieces.Piece.Color.*;
import static pieces.Piece.Type.*;
import junit.framework.TestCase;

public class RankTest extends TestCase {
	static final String EMPTY_RANK = "........";
	static final String WHITE_EXCEPT_PAWN_RANK = "rnbqkbnr";
	static final String BLACK_EXCEPT_PAWN_RANK = "RNBQKBNR";
	static final String WHITE_PAWN_RANK = "pppppppp";
	static final String BLACK_PAWN_RANK = "PPPPPPPP";
	
	private Rank rank;
	
	@Override
	protected void setUp() throws Exception {
		rank = new Rank();
	}
	
	public void testInitializeEmpty() throws Exception {
		rank.initializeEmpty();
		assertEquals(EMPTY_RANK, rank.print());
	}
	
	public void testInitializeWhitePawn() throws Exception {
		rank.initializeWhitePawn();
		assertEquals(WHITE_PAWN_RANK, rank.print());
	}
	
	
	public void testInitializeBlackPawn() throws Exception {
		rank.initializeBlackPawn();
		assertEquals(BLACK_PAWN_RANK, rank.print());
	}
	
	public void testInitializeWhiteExceptPawn() throws Exception {
		rank.initializeWhiteExceptPawn();
		assertEquals(WHITE_EXCEPT_PAWN_RANK, rank.print());
	}
	
	public void testInitializeBlackExceptPawn() throws Exception {
		rank.initializeBlackExceptPawn();
		assertEquals(BLACK_EXCEPT_PAWN_RANK, rank.print());
	}
	
	public void testCountPiecesByColorAndType() throws Exception {
		rank.initializeBlackPawn();
		assertEquals(8, rank.countPiecesByColorAndType(BLACK, PAWN));
		assertEquals(0, rank.countPiecesByColorAndType(WHITE, PAWN));
		
		rank = new Rank();
		rank.initializeBlackExceptPawn();
		assertEquals(1, rank.countPiecesByColorAndType(BLACK, KING));
	}
}
