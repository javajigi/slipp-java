package sis.studentinfo;

import static sis.studentinfo.DateUtil.createDate;

import java.util.Date;

import junit.framework.TestCase;

public class CourseSessionTest extends TestCase {
	private CourseSession session;
	private Date startDate;
	
	public void setUp() {
		startDate = createDate(2013, 3, 4);
		session = CourseSession.create("ENGL", "101", startDate);
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
		Date endDate = createDate(2013, 6, 21);
		assertEquals(endDate, session.getEndDate());
	}
	
	public void testCount() throws Exception {
		CourseSession.resetCount();
		createCourseSession();
		assertEquals(1, CourseSession.getCount());
		createCourseSession();
		assertEquals(2, CourseSession.getCount());
	}
	
	private CourseSession createCourseSession() {
		return CourseSession.create("ENG", "101", startDate);
	}
}
