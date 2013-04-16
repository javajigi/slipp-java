package sis.studentinfo;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	public static Date createDate(int year, int month, int date) {
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(year, month-1, date);
		return calendar.getTime();
	}
}
