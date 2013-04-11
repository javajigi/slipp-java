package sis.studentinfo;

import sis.studentinfo.Student.Grade;

public class HonorsGradingStrategy implements GradingStrategy {
	public int gradePointsFor(Grade grade) {
		int points = basicGradePointsFor(grade);
		if (points > 0) {
			points += 1;
		}
		return points;
	}

	private int basicGradePointsFor(Grade grade) {
		if (grade == Grade.A)
			return 4;
		else if (grade == Grade.B)
			return 3;
		else if (grade == Grade.C)
			return 2;
		else if (grade == Grade.D)
			return 1;
		return 0;
	}
}
