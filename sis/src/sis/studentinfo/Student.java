package sis.studentinfo;

import java.util.ArrayList;

public class Student {
	static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;

	static final String IN_STATE = "경기도";
	
	private String name;
	
	private int credits;

	private String state;
	
	private ArrayList<String> grades = new ArrayList<String>();

	public Student(String name) {
		this.name = name;
	}
	
	public void setState(String state) {
		this.state = state;
	}

	public String getName() {
		return name;
	}

	int getCredits() {
		return credits;
	}

	void addCredits(int credits) {
		this.credits += credits;
	}

	boolean isFullTime() {
		return credits >= CREDITS_REQUIRED_FOR_FULL_TIME;
	}

	boolean isInState() {
		return Student.IN_STATE.equals(state);
	}

	public double getGpa() {
		if (grades.isEmpty()) {
			return 0.0;
		}
		
		double total = 0.0;
		for (String grade : grades) {
			total += gradePointsFor(grade);
		}
		
		return total / grades.size();
	}
	
	int gradePointsFor(String grade) {
		if (grade.equals("A"))
			return 4;
		else if (grade.equals("B"))
			return 3;
		else if (grade.equals("C"))
			return 2;
		else if (grade.equals("D"))
			return 1;
		return 0;
	}

	public void addGrade(String grade) {
		grades.add(grade);
	}
}