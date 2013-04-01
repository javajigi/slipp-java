package studentinfo;

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
}
