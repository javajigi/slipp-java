package sis.studentinfo;

import java.util.Date;

import junit.framework.TestCase;

public abstract class SessionTest extends TestCase {
	protected static final int CREDITS = 3;
	
	protected Session session;
	protected Date startDate;
	
	public void setUp() {
		startDate = DateUtil.createDate(2013, 3, 4);
		session = createCourseSession("ENGL", "101", startDate);
	}

	abstract protected Session createCourseSession(String department, String number, Date startDate);

	public void testCreate() throws Exception {
		assertEquals("ENGL", session.getDepartment());
		assertEquals("101", session.getNumber());
		assertEquals(0, session.getNumberOfStudents());
		assertEquals(startDate, session.getStartDate());
	}

	public void testEnrollStudents() throws Exception {
		Student firstStudent = new Student("박 재성");
		session.enroll(firstStudent);
		assertEquals(CREDITS, firstStudent.getCredits());
		assertEquals(1, session.getNumberOfStudents());
		assertEquals(firstStudent, session.get(0));

		Student secondStudent = new Student("박 주한");
		session.enroll(secondStudent);
		assertEquals(CREDITS, firstStudent.getCredits());
		assertEquals(2, session.getNumberOfStudents());
		assertEquals(firstStudent, session.get(0));
		assertEquals(secondStudent, session.get(1));
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
	
	public void testAverageGpaForPartTimeStudents() throws Exception {
		session.enroll(createFullTimeStudent());
		Student partTimer1 = new Student("a b");
		partTimer1.addGrade(Student.Grade.A);
		session.enroll(partTimer1);
		
		session.enroll(createFullTimeStudent());
		
		Student partTimer2 = new Student("c d");
		partTimer2.addGrade(Student.Grade.B);
		session.enroll(partTimer2);		
		
		assertEquals(3.5, session.averageGpaForPartTimeStudents(), 0.05);
	}

	private Student createFullTimeStudent() throws Exception {
		Student student = new Student("a b");
		student.addCredits(Student.CREDITS_REQUIRED_FOR_FULL_TIME);
		return student;
	}
}
