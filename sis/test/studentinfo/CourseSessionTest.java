package studentinfo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;

public class CourseSessionTest extends TestCase {
	private CourseSession session;
	private Date startDate;
	
	public void setUp() {
		int year = 2013;
		int month = 3;
		int date = 4;
		startDate = createDate(year, month, date);
		session = new CourseSession("ENGL", "101", startDate);
	}

	private Date createDate(int year, int month, int date) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month - 1);
		calendar.set(Calendar.DAY_OF_MONTH, date);
		return calendar.getTime();
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
		Date endDate = createDate(year, month, date);
		assertEquals(endDate, session.getEndDate());
	}
	
	public void testRoasterReport() throws Exception {
		session.enroll(new Student("A"));
		session.enroll(new Student("B"));
		
		String rosterReport = session.getRosterReport();
		assertEquals(
			"학생 목록\n----\n" + 
			"A\nB\n" + 
			"\n학생 수 : 2", 
			rosterReport);
	}
}
