package sis.summer;

import java.util.Date;

import sis.studentinfo.CourseSession;

public class SummerCourseSession extends CourseSession {
	protected SummerCourseSession(String department, String number, Date startDate) {
		super(department, number, startDate);
	}

	public static SummerCourseSession create(String department, String number, Date startDate) {
		return new SummerCourseSession(department, number, startDate);
	}

	protected int getSessionLength() {
		return 8;
	}
}
