import junit.framework.TestCase;

public class PawnTest extends TestCase {
	public void testCreate() {
		Pawn whitePawn = new Pawn("white");
		assertEquals("white", whitePawn.getColor());
		
		Pawn blackPawn = new Pawn("black");
		assertEquals("black", blackPawn.getColor());
	}
}
