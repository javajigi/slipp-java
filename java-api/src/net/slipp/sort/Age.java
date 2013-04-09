package net.slipp.sort;

public class Age {
	private int age;

	public Age(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
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
		Age other = (Age) obj;
		if (age != other.age)
			return false;
		return true;
	}
}
