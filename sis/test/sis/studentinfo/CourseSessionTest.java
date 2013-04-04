package sis.studentinfo;

import java.util.Date;

import junit.framework.TestCase;

public class CourseSessionTest extends TestCase {
	private static final int CREDITS = 3;
	
	private CourseSession session;
	private Date startDate;
	
	public void setUp() {
		startDate = new DateUtil().createDate(2013, 3, 4);
		session = createCourseSession();
	}

	private CourseSession createCourseSession() {
		CourseSession session = new CourseSession("ENGL", "101", startDate);
		session.setNumberOfCredits(CREDITS);
		return session;
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
		assertEquals(CREDITS, firstStudent.getCredits());
		assertEquals(1, session.getNumberOfStudents());
		assertEquals(firstStudent, session.get(0));

		Student secondStudent = new Student("주한");
		session.enroll(secondStudent);
		assertEquals(CREDITS, firstStudent.getCredits());
		assertEquals(2, session.getNumberOfStudents());
		assertEquals(firstStudent, session.get(0));
		assertEquals(secondStudent, session.get(1));
	}
	
	public void testCourseDates() {
		Date endDate = new DateUtil().createDate(2013, 6, 21);
		assertEquals(endDate, session.getEndDate());
	}
}