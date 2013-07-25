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
			positions.addAll(position.findsPosition(direction));
		}
		return positions;
	}
	
	public List<Position> findsDiagonalPositionAll() {
		List<Position> positions = new ArrayList<Position>();
		for (final Direction direction : Direction.diagonalDirection()) {
			positions.addAll(position.findsPosition(direction));
		}
		return positions;
	}
}
