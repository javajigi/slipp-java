package sis.summer;

import java.util.Date;

import junit.framework.TestCase;
import sis.studentinfo.DateUtil;

public class SummerCourseSessionTest extends TestCase {
	public void testEndDate() throws Exception {
		Date startDate = DateUtil.createDate(2013, 7, 1);
		SummerCourseSession session = SummerCourseSession.create("ENG", "101", startDate);
		Date eightWeeksOut = DateUtil.createDate(2013, 8, 23);
		assertEquals(eightWeeksOut, session.getEndDate());
	}
}
