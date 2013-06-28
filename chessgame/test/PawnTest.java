import junit.framework.TestCase;

public class PawnTest extends TestCase {
	public void testCreate() {
		Pawn whitePawn = new Pawn(Pawn.COLOR_WHITE);
		assertEquals(Pawn.COLOR_WHITE, whitePawn.getColor());
		
		Pawn blackPawn = new Pawn(Pawn.COLOR_BLACK);
		assertEquals(Pawn.COLOR_BLACK, blackPawn.getColor());
	}
}
