package sis.studentinfo;

public class Student {
	static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;

	static final String IN_STATE = "경기도";
	
	private String name;
	
	private int credits;

	private String state;

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
}
