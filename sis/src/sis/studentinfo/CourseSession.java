package sis.studentinfo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CourseSession {
	private static int count;
	
	private String department;
	private String number;
	private Date startDate;

	private ArrayList<Student> students = new ArrayList<Student>();

	private CourseSession(String department, String number, Date startDate) {
		this.department = department;
		this.number = number;
		this.startDate = startDate;
		CourseSession.incrementCount();
	}
	
	private static void incrementCount() {
		count += 1;
	}

	static void resetCount() {
		count = 0;
	}
	
	static int getCount() {
		return count;
	}

	String getDepartment() {
		return department;
	}

	String getNumber() {
		return number;
	}

	public int getNumberOfStudents() {
		return students.size();
	}

	public void enroll(Student student) {
		students.add(student);
	}
	
	public Student get(int index) {
		return students.get(index);
	}
	
	Date getStartDate() {
		return this.startDate;
	}
	
	Date getEndDate() {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(startDate);
		final int sessionLength = 16;
		final int daysInWeek = 7;
		final int daysFromFridayToMonday = 3;
		int numberOfDays = sessionLength * daysInWeek - daysFromFridayToMonday;
		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
		return calendar.getTime();
	}

	public static CourseSession create(String department, String number, Date startDate) {
		return new CourseSession(department, number, startDate);
	}
}
