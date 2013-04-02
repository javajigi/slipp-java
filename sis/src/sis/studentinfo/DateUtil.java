package sis.studentinfo;

import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil {
	private DateUtil() {}
	
	public static Date createDate(int year, int month, int date) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.clear();
		calendar.set(year, month-1, date);
		return calendar.getTime();
	}
}
