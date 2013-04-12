package sis.studentinfo;

import sis.studentinfo.Student.Grade;

public class HonorsGradingStrategy extends BasicGradingStrategy implements GradingStrategy {
	public int gradePointsFor(Grade grade) {
		int points = basicGradePointsFor(grade);
		if (points > 0) {
			points += 1;
		}
		return points;
	}
}
