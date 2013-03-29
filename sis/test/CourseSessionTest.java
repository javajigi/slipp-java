import java.util.ArrayList;

import junit.framework.TestCase;

public class CourseSessionTest extends TestCase {
	public void testCreate() throws Exception {
		CourseSession session = new CourseSession("ENGL", "101");
		assertEquals("ENGL", session.getDepartment());
		assertEquals("101", session.getNumber());
		assertEquals(0, session.getNumberOfStudents());
	}
	
	public void testEnrollStudents() throws Exception {
		CourseSession session = new CourseSession("ENGL", "101");
		Student firstStudent = new Student("재성");
		session.enroll(firstStudent);
		assertEquals(1, session.getNumberOfStudents());
		ArrayList<Student> allStuents = session.getAllStudents();
		assertEquals(1, allStuents.size());
		assertEquals(firstStudent, allStuents.get(0));
		
		Student secondStudent = new Student("주한");
		session.enroll(secondStudent);
		assertEquals(2, session.getNumberOfStudents());
		assertEquals(2, allStuents.size());
		assertEquals(firstStudent, allStuents.get(0));
		assertEquals(secondStudent, allStuents.get(1));
	}
}
