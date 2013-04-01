package sis.studentinfo;

import java.util.Date;

import junit.framework.TestCase;

public class CourseSessionTest extends TestCase {
	private CourseSession session;
	private Date startDate;
	
	public void setUp() {
		int year = 2013;
		int month = 3;
		int date = 4;
		startDate = new DateUtil().createDate(year, month, date);
		session = new CourseSession("ENGL", "101", startDate);
	}

	public void testCreate() throws Exception {
		assertEquals("ENGL", session.getDepartment());
		assertEquals("101", session.getNumber());
		assertEquals(0, session.getNumberOfStudents());
		assertEquals(startDate, session.getStartDate());
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
		int year = 2013;
		int month = 6;
		int date = 21;
		Date endDate = new DateUtil().createDate(year, month, date);
		assertEquals(endDate, session.getEndDate());
	}
}
