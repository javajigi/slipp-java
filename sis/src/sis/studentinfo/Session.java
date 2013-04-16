package sis.studentinfo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public abstract class Session implements Comparable<Session> {
	private String department;
	private String number;
	private Date startDate;
	private int numberOfCredits;

	private List<Student> students = new ArrayList<Student>();

	protected Session(String department, String number, Date startDate) {
		this.department = department;
		this.number = number;
		this.startDate = startDate;
	}

	public void setNumberOfCredits(int numberOfCredits) {
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

	abstract protected int getSessionLength();

	public Date getEndDate() {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(getStartDate());
		final int daysInWeek = 7;
		final int daysFromFridayToMonday = 3;
		int numberOfDays = getSessionLength() * daysInWeek
				- daysFromFridayToMonday;
		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
		return calendar.getTime();
	}

	@Override
	public int compareTo(Session anotherSession) {
		int compare = this.getDepartment().compareTo(
				anotherSession.getDepartment());

		if (compare == 0) {
			return this.getNumber().compareTo(anotherSession.getNumber());
		}

		return compare;
	}
}
