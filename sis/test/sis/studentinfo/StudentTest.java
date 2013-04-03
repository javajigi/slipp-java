package sis.studentinfo;

import junit.framework.TestCase;

public class StudentTest extends TestCase {
	public void testCreate() {
		final String firstStudentName = "재성";
		Student firstStudent = new Student(firstStudentName);
		assertEquals(firstStudentName, firstStudent.getName());
		
		final String secondStudentName = "주한";
		Student secondStudent = new Student(secondStudentName);
		assertEquals(secondStudentName, secondStudent.getName());
		
		
		assertEquals(firstStudentName, firstStudent.getName());
	}
	
	public void testCredits() throws Exception {
		Student student = new Student("a");
		assertEquals(0, student.getCredits());
		student.addCredits(3);
		assertEquals(3, student.getCredits());
		student.addCredits(4);
		assertEquals(7, student.getCredits());
	}
}
