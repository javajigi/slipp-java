package sis.studentinfo;

import sis.studentinfo.Student.Grade;

public class BasicGradingStrategy implements GradingStrategy {
	public int gradePointsFor(Grade grade) {
		return grade.getPoints();
	}
}
