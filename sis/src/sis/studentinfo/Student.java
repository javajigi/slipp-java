package sis.studentinfo;

import java.util.ArrayList;
import java.util.List;

public class Student {
	enum Grade {
		A(4), 
		B(3), 
		C(2), 
		D(1), 
		F(0);
		
		private int points;
		
		Grade(int points) {
			this.points = points;
		}
		
		public int getPoints() {
			return points;
		}
	};

	static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;

	static final String IN_STATE = "경기도";

	private String name;

	private int credits;

	private String state;
	
	private GradingStrategy gradingStrategy = new BasicGradingStrategy();
	
	private List<Grade> grades = new ArrayList<Grade>();


	public Student(String name) {
		this.name = name;
	}
	
	void setGradingStrategy(GradingStrategy gradingStrategy) {
		this.gradingStrategy = gradingStrategy;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public String getName() {
		return name;
	}
	
	public String getFamilyName() {
		return null;
	}
	
	public String getPersonalName() {
		return null;
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
			total += gradingStrategy.gradePointsFor(grade);
		}

		return total / grades.size();
	}

	public void addGrade(Grade grade) {
		grades.add(grade);
	}
}