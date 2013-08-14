package net.slipp.reflection;

import org.junit.Test;

public class ReflectionTest {
	@Test
	public void showClass() {
		Class<Employee> clazz = Employee.class;
		System.out.println(clazz.getName());
		
	}

}
