package sis.studentinfo;

public enum Grade {
	A(4.0, 2), B(3.0, 1), C(2.0), D(1.0), F(0.0);
	
	private double value;

	private Grade(double value, int value2) {
		this.value = value;
	}
	
	public double getValue() {
		return value;
	}
}
