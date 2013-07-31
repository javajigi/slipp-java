package pieces;

import java.util.Comparator;

public class PieceComparator implements Comparator<Piece> {

	@Override
	public int compare(Piece o1, Piece o2) {
		if (o1.getType().getPoint() < o2.getType().getPoint())
			return 1;
		return -1;
	}
}
