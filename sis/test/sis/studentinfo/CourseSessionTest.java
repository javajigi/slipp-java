package sis.studentinfo;

import java.util.Date;

import junit.framework.TestCase;

public class CourseSessionTest extends TestCase {
	private static final int CREDITS = 3;
	
	private CourseSession session;
	private Date startDate;
	
	public void setUp() {
		startDate = DateUtil.createDate(2013, 3, 4);
		session = createCourseSession("ENGL", "101", startDate);
	}

	private CourseSession createCourseSession(String department, String number, Date startDate) {
		CourseSession session = CourseSession.create(department, number, startDate);
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
		Date endDate = DateUtil.createDate(2013, 6, 21);
		assertEquals(endDate, session.getEndDate());
	}
	
	public void testCount() throws Exception {
		CourseSession.resetCount();
		createCourseSession("", "", new Date());
		assertEquals(1, CourseSession.getCount());
		createCourseSession("", "", new Date());
		assertEquals(2, CourseSession.getCount());
	}
	
	public void testComparable() throws Exception {
		CourseSession sessionA = CourseSession.create("ENG", "101", startDate);
		CourseSession sessionB = CourseSession.create("KOR", "201", startDate);
		assertTrue(sessionA.compareTo(sessionB) < 0);
		assertTrue(sessionB.compareTo(sessionA) > 0);
		
		CourseSession sessionC = CourseSession.create("ENG", "101", startDate);
		assertEquals(0, sessionA.compareTo(sessionC));
		
		CourseSession sessionD = CourseSession.create("ENG", "201", startDate);
		assertTrue(sessionC.compareTo(sessionD) < 0);
		assertTrue(sessionD.compareTo(sessionC) > 0);
	}
}
