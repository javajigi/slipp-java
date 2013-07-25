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
	
	public void testMoveOneRoom() throws Exception {
		int startX = 4;
		int startY = 5;
		Position source = new Position(startX, startY);
		assertEquals(new Position(startX, startY + 1), source.moveNorthOne());
		assertEquals(new Position(startX, startY - 1), source.moveSouthOne());
		assertEquals(new Position(startX + 1, startY), source.moveEastOne());
		assertEquals(new Position(startX - 1, startY), source.moveWestOne());
	}
}
