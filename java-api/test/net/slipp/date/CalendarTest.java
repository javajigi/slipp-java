package net.slipp.date;

import java.util.Calendar;

import junit.framework.TestCase;

public class CalendarTest extends TestCase {
	public void testCalendar() throws Exception {
		Calendar now = Calendar.getInstance();
		System.out.println("현재 시간 : " + now.getTime());
		System.out.println("현재 밀리초 : " + now.getTimeInMillis());
		
		now.set(2013,1,23);
		System.out.println("2013-01-23 : " + now.getTime());
		
		now.set(2013, 1, 22, 11, 23, 33);
		System.out.println("2013-01-23 : " + now.getTime());
	}
	
    public void testCalendar2() throws Exception {
        Calendar date = Calendar.getInstance();
        date.set(2013,1,23);
        printDate("현재 시간 : ", date);
        
        date.add(Calendar.WEEK_OF_YEAR, -1);
        printDate("1주일 전 : ", date);
        
        date.add(Calendar.DATE, 1);
        printDate("1일 후 : ", date);
        
        date.add(Calendar.MONTH, -6);
        printDate("6개월 전 : ", date);
 
        date.roll(Calendar.YEAR, -1);
        printDate("1년 전 : ", date);
    }
    
    static void printDate(String message, Calendar date) {
    	System.out.println(message + toString(date));
    }
 
    static String toString(Calendar date) {
        return date.get(Calendar.YEAR)+"년 "
                + (date.get(Calendar.MONTH)+1) + "월 "
                + date.get(Calendar.DATE) + "일";
    }
}
