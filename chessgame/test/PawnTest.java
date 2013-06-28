import junit.framework.TestCase;

public class PawnTest extends TestCase {
	public void testCreate() {
		String white = "white";
		Pawn whitePawn = new Pawn(white);
		assertEquals(white, whitePawn.getColor());
		
		String black = "black";
		Pawn blackPawn = new Pawn(black);
		assertEquals(black, blackPawn.getColor());
	}
}
