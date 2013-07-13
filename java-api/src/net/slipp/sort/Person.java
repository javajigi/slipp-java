package net.slipp.sort;

public class Person {
	private int age;

	Person(int age) {
		this.age = age;
	}
	
	int getAge() {
		return age;
	}
	
	boolean isYounger(Person target) {
		return this.age < target.age;
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		return true;
	}
}
