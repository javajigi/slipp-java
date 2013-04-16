package sis.studentinfo;

import java.util.Date;

public class CourseSessionTest extends SessionTest {
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
	
	protected Session createCourseSession(String department, String number, Date startDate) {
		CourseSession session = CourseSession.create(department, number, startDate);
		session.setNumberOfCredits(CREDITS);
		return session;
	}
}
