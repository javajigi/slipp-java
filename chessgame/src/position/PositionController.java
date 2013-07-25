package position;

import java.util.ArrayList;
import java.util.List;

public class PositionController {
	private Position position;;

	public PositionController(Position position) {
		this.position = position;
	}

	public List<Position> findsLinearPositionAll() {
		List<Position> positions = new ArrayList<Position>();
		for (final Direction direction : Direction.linearDirection()) {
			Movable movable = new Movable() {
				public Position move(Position position) {
					return position.move(direction);
				}
			};
			positions.addAll(position.findsPosition(movable));
		}
		return positions;
	}
	
	public List<Position> findsDiagonalPositionAll() {
		List<Position> positions = new ArrayList<Position>();
		for (final Direction direction : Direction.diagonalDirection()) {
			Movable movable = new Movable() {
				public Position move(Position position) {
					return position.move(direction);
				}
			};
			positions.addAll(position.findsPosition(movable));
		}
		return positions;
	}
}
