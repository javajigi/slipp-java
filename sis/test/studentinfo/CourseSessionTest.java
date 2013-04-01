package studentinfo;

import java.util.Date;

import junit.framework.TestCase;

public class CourseSessionTest extends TestCase {
	private CourseSession session;
	
	public void setUp() {
		session = new CourseSession("ENGL", "101");
	}
	
	public void testCreate() throws Exception {
		assertEquals("ENGL", session.getDepartment());
		assertEquals("101", session.getNumber());
		assertEquals(0, session.getNumberOfStudents());
	}

	public void testEnrollStudents() throws Exception {
		Student firstStudent = new Student("재성");
		session.enroll(firstStudent);
		assertEquals(1, session.getNumberOfStudents());
		assertEquals(firstStudent, session.get(0));

		Student secondStudent = new Student("주한");
		session.enroll(secondStudent);
		assertEquals(2, session.getNumberOfStudents());
		assertEquals(firstStudent, session.get(0));
		assertEquals(secondStudent, session.get(1));
	}
	
	public void testCourseDates() {
		int year = 113;
		int month = 2;
		int date = 4;
		Date startDate = new Date(year, month, date);
		
		CourseSession session = new CourseSession("ENGL", "101", startDate);
		
		year = 113;
		month = 5;
		date = 21;
		Date endDate = new Date(year, month, date);
		assertEquals(endDate, session.getEndDate());
	}
}
