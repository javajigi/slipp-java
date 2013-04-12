package sis.studentinfo;

import sis.studentinfo.Student.Grade;

public class HonorsGradingStrategy extends BasicGradingStrategy {
	public int gradePointsFor(Grade grade) {
		int points = super.gradePointsFor(grade);
		if (points > 0) {
			points += 1;
		}
		return points;
	}
}