package net.slipp.chess;

public class Position {
	private static final char COLUMN_START_CHAR = 'a';
	
	private int x;
	private int y;
	
	public Position(String position) {
		// 에러 상태에 대한 처리 필요함.
		this.x = generateColumnIndex(position.charAt(0));
		this.y = Integer.parseInt(position.substring(1)) - 1;
	}
	
	Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	private int generateColumnIndex(char columnIndex) {
		int target = Character.getNumericValue(columnIndex);
		int source = Character.getNumericValue(COLUMN_START_CHAR);
		return target - source;
	}

	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}
