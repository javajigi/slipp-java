package pieces;

import junit.framework.TestCase;

public class PawnTest extends TestCase {
	public void testCreate() {
		Pawn whitePawn = new Pawn(Pawn.COLOR_WHITE, Pawn.SYMBOL_LOWERCASE_PAWN);
		assertEquals(Pawn.COLOR_WHITE, whitePawn.getColor());
		assertEquals(Pawn.SYMBOL_LOWERCASE_PAWN, whitePawn.getSymbol());

		Pawn blackPawn = new Pawn(Pawn.COLOR_BLACK, Pawn.SYMBOL_UPPERCASE_PAWN);
		assertEquals(Pawn.COLOR_BLACK, blackPawn.getColor());
		assertEquals(Pawn.SYMBOL_UPPERCASE_PAWN, blackPawn.getSymbol());
	}
}
