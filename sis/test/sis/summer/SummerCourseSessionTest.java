package sis.summer;

import java.util.Date;

import sis.studentinfo.DateUtil;
import sis.studentinfo.Session;
import sis.studentinfo.SessionTest;

public class SummerCourseSessionTest extends SessionTest {
	public void testEndDate() throws Exception {
		Date startDate = DateUtil.createDate(2013, 7, 1);
		SummerCourseSession session = SummerCourseSession.create("ENG", "101", startDate);
		Date eightWeeksOut = DateUtil.createDate(2013, 8, 23);
		assertEquals(eightWeeksOut, session.getEndDate());
	}

	@Override
	protected Session createCourseSession(String department, String number,
			Date startDate) {
		SummerCourseSession session = SummerCourseSession.create(department, number, startDate);
		session.setNumberOfCredits(CREDITS);
		return session;
	}
}
