package chess;

import java.util.ArrayList;

import junit.framework.TestCase;
import pieces.Pawn;

public class BoardTest extends TestCase {
	public void testCreate() throws Exception {
		Pawn whitePawn = new Pawn(Pawn.COLOR_WHITE, 'p');
		Board board = new Board();
		assertEquals(2, board.countPawnSize());
		board.addPawn(whitePawn);
		assertEquals(3, board.countPawnSize());
		ArrayList<Pawn> pawns = board.getPawns();
		assertTrue(pawns.contains(whitePawn));
		
		Pawn blackPawn = new Pawn(Pawn.COLOR_BLACK, 'P');
		board.addPawn(blackPawn);
		assertEquals(4, board.countPawnSize());
		pawns = board.getPawns();
		assertTrue(pawns.contains(whitePawn));
		assertTrue(pawns.contains(blackPawn));
	}
}
