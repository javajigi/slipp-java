package studentinfo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

class CourseSession {
	private String department;
	private String number;
	private int numberOfStudents;
	private Date startDate;
	
	private ArrayList<Student> students = new ArrayList<Student>();

	CourseSession(String department, String number) {
		this.department = department;
		this.number = number;
		this.numberOfStudents = 0;
	}

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
		return students.size();
	}

	void enroll(Student student) {
		students.add(student);
		numberOfStudents = numberOfStudents + 1;
	}
	
	Student getStudent(int index) {
		return students.get(index);
	}

	Date getEndDate() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(startDate);
		int numberOfDays = 16 * 7 - 3; // weeks * days per week – 3 days
		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
		return calendar.getTime();
	}

	Date getStartDate() {
		return startDate;
	}

	public String getRosterReport() {
		StringBuilder buffer = new StringBuilder();
		
		Student student = students.get(0);
		buffer.append(student.getName());
		buffer.append('\n');
		
		student = students.get(1);
		buffer.append(student.getName());
		buffer.append('\n');
		
		return buffer.toString();
	}
}
