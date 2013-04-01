package studentinfo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class CourseSession {
	static final String NEWLINE = System.getProperty("line.separator");
	static final String ROSTER_REPORT_HEADER = "학생 목록" + NEWLINE + "----" + NEWLINE;
	static final String ROSTER_REPORT_FOOTER = NEWLINE + "학생 수 : ";

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
		StringBuilder sb = new StringBuilder();
		sb.append(ROSTER_REPORT_HEADER);
		
		for (Student student : students) {
			sb.append(student.getName());
			sb.append(NEWLINE);
		}
		sb.append(ROSTER_REPORT_FOOTER + students.size());
		return sb.toString();
	}
}
