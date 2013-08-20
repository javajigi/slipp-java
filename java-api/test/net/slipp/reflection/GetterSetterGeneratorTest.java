package net.slipp.reflection;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

public class GetterSetterGeneratorTest {
	@Test
	public void generate() throws Exception {
		Class<Student> clazz = Student.class;
		
		File file = new File("resources/Student.java");
		assertTrue(file.exists());
	}
}
