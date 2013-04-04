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
	
	public void testStudentStatus() throws Exception {
		Student student = new Student("a");
		assertEquals(0, student.getCredits());
		assertFalse(student.isFullTime());
		
		student.addCredits(3);
		assertEquals(3, student.getCredits());
		assertFalse(student.isFullTime());
		
		student.addCredits(4);
		assertEquals(7, student.getCredits());
		assertFalse(student.isFullTime());
		
		student.addCredits(5);
		assertEquals(Student.CREDITS_REQUIRED_FOR_FULL_TIME, student.getCredits());
		assertTrue(student.isFullTime());		
	}
	
	public void testInState() throws Exception {
		Student student = new Student("a");
		assertFalse(student.isInState());
		student.setState(Student.IN_STATE);
		assertTrue(student.isInState());
		student.setState("서울특별시");
		assertFalse(student.isInState());
	}
}
