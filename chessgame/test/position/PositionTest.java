package position;

import pieces.Movable;
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
	
	public void testMoveDiagonal() throws Exception {
		int startX = 4;
		int startY = 5;
		Position source = new Position(startX, startY);
		assertEquals(new Position(startX + 1, startY + 1), source.moveNorthEastOne());
		assertEquals(new Position(startX - 1, startY + 1), source.moveNorthWestOne());
		assertEquals(new Position(startX + 1, startY - 1), source.moveSouthEastOne());
		assertEquals(new Position(startX - 1, startY - 1), source.moveSouthWestOne());
	}
	
	public void testFindsLinearPosition() throws Exception {
		int startX = 4;
		int startY = 5;
		Position position = new Position(startX, startY);
		Movable movable = new Movable() {
			public Position move(Position position) {
				return position.moveNorthOne();
			}
		};
		verifyPositions(position, movable, 2);
		
		movable = new Movable() {
			public Position move(Position position) {
				return position.moveSouthOne();
			}
		};
		verifyPositions(position, movable, 5);
	}
	
	public void testFindsDiagonalPosition() throws Exception {
		int startX = 4;
		int startY = 5;
		Position position = new Position(startX, startY);
		Movable movable = new Movable() {
			public Position move(Position position) {
				return position.moveNorthEastOne();
			}
		};
		verifyPositions(position, movable, 2);
		
		movable = new Movable() {
			public Position move(Position position) {
				return position.moveNorthWestOne();
			}
		};
		verifyPositions(position, movable, 2);
		
		movable = new Movable() {
			public Position move(Position position) {
				return position.moveSouthEastOne();
			}
		};
		verifyPositions(position, movable, 3);
		
		movable = new Movable() {
			public Position move(Position position) {
				return position.moveSouthWestOne();
			}
		};
		verifyPositions(position, movable, 4);
	}

	private void verifyPositions(Position position, Movable movable, int expectedSize) {
		assertEquals(expectedSize, position.findsPosition(movable).size());
	}
	
	public void testIsValid() throws Exception {
		assertTrue(new Position(0, 0).isValid());
		assertTrue(new Position(0, 7).isValid());
		assertTrue(new Position(7, 0).isValid());
		assertTrue(new Position(7, 7).isValid());
		assertFalse(new Position(0, -1).isValid());
		assertFalse(new Position(0, 8).isValid());
		assertFalse(new Position(-1, 0).isValid());
		assertFalse(new Position(8, 0).isValid());
	}
}
