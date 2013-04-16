package sis.studentinfo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


import junit.framework.TestCase;

public class DateUtilTest extends TestCase {
	public void testCreateDate() throws Exception {
		Date date = DateUtil.createDate(2013, 1, 1);
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		
		assertEquals(2013, calendar.get(Calendar.YEAR));
		assertEquals(0, calendar.get(Calendar.MONTH));
		assertEquals(1, calendar.get(Calendar.DAY_OF_YEAR));
	}
}
