package studentinfo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class CourseSession {
	private String department;
	private String number;
	private int numberOfStudents = 0;
	private Date startDate;

	private ArrayList<Student> students = new ArrayList<Student>();

	CourseSession(String department, String number, Date startDate) {
		this.department = department;
		this.number = number;
		this.startDate = startDate;
	}

	String getDepartment() {
		return department;
	}

	String getNumber() {
		return number;
	}

	int getNumberOfStudents() {
		return numberOfStudents;
	}

	void enroll(Student student) {
		numberOfStudents += 1;
		students.add(student);
	}
	
	Student get(int index) {
		return students.get(index);
	}
	
	Date getStartDate() {
		return this.startDate;
	}
	
	Date getEndDate() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(startDate);
		final int sessionLength = 16;
		final int daysInWeek = 7;
		final int daysFromFridayToMonday = 3;
		int numberOfDays = sessionLength * daysInWeek - daysFromFridayToMonday;
		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
		return calendar.getTime();
	}

	public String getRosterReport() {
		return null;
	}
}
