package sis.studentinfo;

import sis.studentinfo.Student.Grade;

public class RegularGradingStrategy extends BasicGradingStrategy implements GradingStrategy {
	public int gradePointsFor(Grade grade) {
		return basicGradePointsFor(grade);
	}
}
