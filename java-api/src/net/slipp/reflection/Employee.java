package net.slipp.reflection;

public class Employee {
	protected String firstName;
	public String lastName;
	private int salary;

	public Employee() {
		this("John", "Smith", 50000);
	}

	public Employee(String fn, String ln, int salary) {
		this.firstName = fn;
		this.lastName = ln;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	protected String getFirstName() {
		return this.firstName;
	}

	public String toString() {
		return "Employee: " + firstName + " " + lastName + " " + salary;
	}
}
