import junit.framework.TestCase;

public class PawnTest extends TestCase {
	public void testCreate() {
		Pawn pawn = new Pawn();
		assertEquals("white", pawn.getColor());
	}
}
