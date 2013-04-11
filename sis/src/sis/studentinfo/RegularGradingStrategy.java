package sis.studentinfo;

import sis.studentinfo.Student.Grade;

public class RegularGradingStrategy implements GradingStrategy {
	@Override
	public int gradePointsFor(Grade grade) {
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
