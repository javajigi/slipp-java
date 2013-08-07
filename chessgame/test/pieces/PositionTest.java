package pieces;

import junit.framework.TestCase;

public class PositionTest extends TestCase {
	public void testCreate() throws Exception {
		Position position = new Position("a8");
		assertEquals(0, position.getX());
		assertEquals(7, position.getY());
		
		position = new Position("e2");
		assertEquals(4, position.getX());
		assertEquals(1, position.getY());
	}
	
    public void testCreateWhenIllegalArgument() throws Exception {
        try {
            new Position("a");
            fail("Position 인자가 형식에 맞지 않아 Exception이 발생해야 한다.");
        } catch (IllegalArgumentException e) {
            
        }
    }
}
