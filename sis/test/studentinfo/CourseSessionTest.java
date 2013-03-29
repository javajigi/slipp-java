package studentinfo;

import java.util.Calendar;
import java.util.Date;

import junit.framework.TestCase;

public class CourseSessionTest extends TestCase {
	private CourseSession session;
	private Date startDate;

	@Override
	protected void setUp() throws Exception {
		startDate = createDate(2013, 3, 4);
		session = new CourseSession("ENGL", "200", startDate);
	}
	
	Date createDate(int year, int month, int date) {
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(year, month-1, date);
		return calendar.getTime();
	}
	
	public void testCreate() throws Exception {
		assertEquals("ENGL", session.getDepartment());
		assertEquals("200", session.getNumber());
		assertEquals(0, session.getNumberOfStudents());
		assertEquals(startDate, session.getStartDate());
	}
	
	public void testEnrollStudents() {
		Student student1 = new Student("재성");
		session.enroll(student1);
		assertEquals(1, session.getNumberOfStudents());
		
		assertEquals(student1, session.getStudent(0));
		
		Student student2 = new Student("주한");
		session.enroll(student2);
		assertEquals(2, session.getNumberOfStudents());
		assertEquals(student1, session.getStudent(0));
		assertEquals(student2, session.getStudent(1));
	}
	
	public void testCourseDates() {
		session = new CourseSession("ABCD", "200", startDate);
		
		Date sixteenWeeksOut = createDate(2013, 6, 21);
		assertEquals(sixteenWeeksOut, session.getEndDate());
	}
	
	public void testRoasterReport() throws Exception {
		session.enroll(new Student("A"));
		session.enroll(new Student("B"));
		
		String rosterReport = session.getRosterReport();
		assertEquals("A\nB\n", rosterReport);
	}
}
