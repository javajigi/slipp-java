package sis.studentinfo;

import java.util.ArrayList;

public class Student {
	enum Grade {
		A, B, C, D, F
	};

	static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;

	static final String IN_STATE = "경기도";

	private String name;

	private int credits;

	private String state;
	
	private boolean isHonors = false;

	private ArrayList<Grade> grades = new ArrayList<Grade>();

	public Student(String name) {
		this.name = name;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	void setHonors() {
		isHonors = true;
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

	double getGpa() {
		if (grades.isEmpty()) {
			return 0.0;
		}

		double total = 0.0;
		for (Grade grade : grades) {
			total += gradePointsFor(grade);
		}

		return total / grades.size();
	}

	int gradePointsFor(Grade grade) {
		int points = basicGradePointsFor(grade);
		if(isHonors) {
			if (points > 0) {
				points += 1;
			}
		}
		return points;
	}

	private int basicGradePointsFor(Grade grade) {
		if (grade == Grade.A)
			return 4;
		else if (grade == Grade.B)
			return 3;
		else if (grade == Grade.C)
			return 2;
		else if (grade == Grade.D)
			return 1;
		return 0;
	}

	public void addGrade(Grade grade) {
		grades.add(grade);
	}
}