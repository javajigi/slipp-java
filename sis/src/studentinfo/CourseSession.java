package studentinfo;

import java.util.ArrayList;
import java.util.Date;

public class CourseSession {
	private String department;
	private String number;
	private int numberOfStudents = 0;
	private Date startDate;

	private ArrayList<Student> students = new ArrayList<Student>();

	CourseSession(String department, String number) {
		this.department = department;
		this.number = number;
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
		return numberOfStudents;
	}

	void enroll(Student student) {
		numberOfStudents += 1;
		students.add(student);
	}
	
	Student get(int index) {
		return students.get(index);
	}
	
	Date getEndDate() {
		return null;
	}
}
