package pieces;

import junit.framework.TestCase;

public class PawnTest extends TestCase {
	public void testCreate() {
		Pawn whitePawn = new Pawn(Pawn.COLOR_WHITE, 'p');
		assertEquals(Pawn.COLOR_WHITE, whitePawn.getColor());
		assertEquals('p', whitePawn.getSymbol());

		Pawn blackPawn = new Pawn(Pawn.COLOR_BLACK, 'P');
		assertEquals(Pawn.COLOR_BLACK, blackPawn.getColor());
		assertEquals('P', blackPawn.getSymbol());
	}
}
