package position;

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
		assertEquals(new Position(startX, startY + 1), source.move(Direction.NORTH));
		assertEquals(new Position(startX, startY - 1), source.move(Direction.SOUTH));
		assertEquals(new Position(startX + 1, startY), source.move(Direction.EAST));
		assertEquals(new Position(startX - 1, startY), source.move(Direction.WEST));
	}
	
	public void testMoveDiagonal() throws Exception {
		int startX = 4;
		int startY = 5;
		Position source = new Position(startX, startY);
		assertEquals(new Position(startX + 1, startY + 1), source.move(Direction.NORTHEAST));
		assertEquals(new Position(startX - 1, startY + 1), source.move(Direction.NORTHWEST));
		assertEquals(new Position(startX + 1, startY - 1), source.move(Direction.SOUTHEAST));
		assertEquals(new Position(startX - 1, startY - 1), source.move(Direction.SOUTHWEST));
	}
	
	public void testFindsLinearPosition() throws Exception {
		int startX = 4;
		int startY = 5;
		Position position = new Position(startX, startY);
		Movable movable = new Movable() {
			public Position move(Position position) {
				return position.move(Direction.NORTH);
			}
		};
		verifyPositions(position, movable, 2);
		
		movable = new Movable() {
			public Position move(Position position) {
				return position.move(Direction.SOUTH);
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
				return position.move(Direction.NORTHEAST);
			}
		};
		verifyPositions(position, movable, 2);
		
		movable = new Movable() {
			public Position move(Position position) {
				return position.move(Direction.NORTHWEST);
			}
		};
		verifyPositions(position, movable, 2);
		
		movable = new Movable() {
			public Position move(Position position) {
				return position.move(Direction.SOUTHEAST);
			}
		};
		verifyPositions(position, movable, 3);
		
		movable = new Movable() {
			public Position move(Position position) {
				return position.move(Direction.SOUTHWEST);
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
