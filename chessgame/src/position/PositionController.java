package position;

import java.util.ArrayList;
import java.util.List;

public class PositionController {
	private static List<Movable> linearMovables = new ArrayList<Movable>();
	private static List<Movable> diagonalMovables = new ArrayList<Movable>();
	static {
		initializeLinearMovables();
		initializeDiagonalMovables();		
	}

	private static void initializeDiagonalMovables() {
		diagonalMovables.add(new Movable() {
			public Position move(Position position) {
				return position.move(Direction.NORTHEAST);
			}
		});
		diagonalMovables.add(new Movable() {
			public Position move(Position position) {
				return position.move(Direction.NORTHWEST);
			}
		});
		diagonalMovables.add(new Movable() {
			public Position move(Position position) {
				return position.move(Direction.SOUTHEAST);
			}
		});
		diagonalMovables.add(new Movable() {
			public Position move(Position position) {
				return position.move(Direction.SOUTHWEST);
			}
		});
	}

	private static void initializeLinearMovables() {
		linearMovables.add(new Movable() {
			public Position move(Position position) {
				return position.move(Direction.NORTH);
			}
		});
		linearMovables.add(new Movable() {
			public Position move(Position position) {
				return position.move(Direction.SOUTH);
			}
		});
		linearMovables.add(new Movable() {
			public Position move(Position position) {
				return position.move(Direction.EAST);
			}
		});
		linearMovables.add(new Movable() {
			public Position move(Position position) {
				return position.move(Direction.WEST);
			}
		});
	}

	private Position position;;

	public PositionController(Position position) {
		this.position = position;
	}

	public List<Position> findsLinearPositionAll() {
		List<Position> positions = new ArrayList<Position>();
		for (Movable movable : linearMovables) {
			positions.addAll(position.findsPosition(movable));
		}
		return positions;
	}
	
	public List<Position> findsDiagonalPositionAll() {
		List<Position> positions = new ArrayList<Position>();
		for (Movable movable : diagonalMovables) {
			positions.addAll(position.findsPosition(movable));
		}
		return positions;
	}
}
