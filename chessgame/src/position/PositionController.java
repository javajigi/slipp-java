package position;

import java.util.ArrayList;
import java.util.List;

import pieces.Movable;

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
				return position.moveNorthEastOne();
			}
		});
		diagonalMovables.add(new Movable() {
			public Position move(Position position) {
				return position.moveNorthWestOne();
			}
		});
		diagonalMovables.add(new Movable() {
			public Position move(Position position) {
				return position.moveSouthEastOne();
			}
		});
		diagonalMovables.add(new Movable() {
			public Position move(Position position) {
				return position.moveSouthWestOne();
			}
		});
	}

	private static void initializeLinearMovables() {
		linearMovables.add(new Movable() {
			public Position move(Position position) {
				return position.moveNorthOne();
			}
		});
		linearMovables.add(new Movable() {
			public Position move(Position position) {
				return position.moveSouthOne();
			}
		});
		linearMovables.add(new Movable() {
			public Position move(Position position) {
				return position.moveEastOne();
			}
		});
		linearMovables.add(new Movable() {
			public Position move(Position position) {
				return position.moveWestOne();
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
