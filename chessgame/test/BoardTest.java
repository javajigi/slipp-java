import java.util.ArrayList;

import junit.framework.TestCase;

public class BoardTest extends TestCase {
	public void testCreate() throws Exception {
		Pawn whitePawn = new Pawn(Pawn.COLOR_WHITE);
		
		Board board = new Board();
		board.addPawn(whitePawn);
		assertEquals(1, board.countPawnSize());
		ArrayList<Pawn> pawns = board.getPawns();
		assertTrue(pawns.contains(whitePawn));
		
		Pawn blackPawn = new Pawn(Pawn.COLOR_BLACK);
		board.addPawn(blackPawn);
		assertEquals(2, board.countPawnSize());
		pawns = board.getPawns();
		assertTrue(pawns.contains(whitePawn));
		assertTrue(pawns.contains(blackPawn));		
	}
}
