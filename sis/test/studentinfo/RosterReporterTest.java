package studentinfo;

import java.util.Calendar;
import java.util.Date;

import junit.framework.TestCase;

public class RosterReporterTest extends TestCase {
	public void testRosterReport() throws Exception {
		CourseSession session = new CourseSession("ENGL", "200", createDate(2013, 03, 22));
		session.enroll(new Student("A"));
		session.enroll(new Student("B"));
		
		String rosterReport = new RosterReporter(session).getReport();
		assertEquals(
				RosterReporter.ROSTER_REPORT_HEADER + 
				"A" + RosterReporter.NEWLINE + 
				"B" + RosterReporter.NEWLINE +
				RosterReporter.ROSTER_REPORT_FOOTER + "2", 
				rosterReport);
	}
	
	Date createDate(int year, int month, int date) {
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(year, month-1, date);
		return calendar.getTime();
	}
}