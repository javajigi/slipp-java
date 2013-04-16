package sis.studentinfo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class CourseSession implements Comparable<CourseSession>{
	private static int count;
	
	private String department;
	private String number;
	private Date startDate;
	private int numberOfCredits;

	private List<Student> students = new ArrayList<Student>();

	protected CourseSession(String department, String number, Date startDate) {
		this.department = department;
		this.number = number;
		this.startDate = startDate;
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
	
	void setNumberOfCredits(int numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}

	public String getDepartment() {
		return department;
	}

	public String getNumber() {
		return number;
	}

	public int getNumberOfStudents() {
		return students.size();
	}

	public void enroll(Student student) {
		student.addCredits(numberOfCredits);
		students.add(student);
	}
	
	public Student get(int index) {
		return students.get(index);
	}
	
	protected Date getStartDate() {
		return this.startDate;
	}
	
	protected int getSessionLength() {
		return 16;
	}
	
	public Date getEndDate() {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(getStartDate());
		final int daysInWeek = 7;
		final int daysFromFridayToMonday = 3;
		int numberOfDays = getSessionLength() * daysInWeek - daysFromFridayToMonday;
		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
		return calendar.getTime();
	}

	public static CourseSession create(String department, String number, Date startDate) {
		CourseSession.incrementCount();
		return new CourseSession(department, number, startDate);
	}

	@Override
	public int compareTo(CourseSession anotherSession) {
		int compare = this.getDepartment().compareTo(anotherSession.getDepartment());
		
		if (compare == 0) {
			return this.getNumber().compareTo(anotherSession.getNumber());
		}
		
		return compare;
	}
}
