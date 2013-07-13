package net.slipp.sort;

public class Score implements MyComparable<Score> {
	private double score;

	Score(double score) {
		this.score = score;
	}
	
	double getScore() {
		return score;
	}

	@Override
	public boolean compareTo(Object target) {
		Score targetScore = (Score) target;
		return this.score < targetScore.score;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(score);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Score other = (Score) obj;
		if (Double.doubleToLongBits(score) != Double.doubleToLongBits(other.score))
			return false;
		return true;
	}
}