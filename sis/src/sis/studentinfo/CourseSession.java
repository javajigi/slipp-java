package sis.studentinfo;

import java.util.Date;

public class CourseSession extends Session {
	private static int count;
	
	protected CourseSession(String department, String number, Date startDate) {
		super(department, number, startDate);
	}
	
	static private void incrementCount() {
		++count;
	}
	
	static void resetCount() {
		count = 0;
	}
	
	static int getCount() {
		return count;
	}
	
	protected int getSessionLength() {
		return 16;
	}

	public static CourseSession create(String department, String number, Date startDate) {
		CourseSession.incrementCount();
		return new CourseSession(department, number, startDate);
	}
}
