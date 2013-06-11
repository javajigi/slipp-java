package sis.report;

import java.util.Date;

import junit.framework.TestCase;
import sis.studentinfo.CourseSession;
import sis.studentinfo.DateUtil;
import sis.studentinfo.Student;

public class RosterReporterTest extends TestCase {
	public void testRosterReport() throws Exception {
		Date startDate = DateUtil.createDate(2013, 03, 22);
		CourseSession session = CourseSession.create("ENGL", "200", startDate);
		session.enroll(new Student("A b"));
		session.enroll(new Student("B c"));
		
		String rosterReport = new RosterReporter(session).getReport();
		System.out.println(rosterReport);
		assertEquals(
				RosterReporter.ROSTER_REPORT_HEADER + 
				"A b" + RosterReporter.NEWLINE + 
				"B c" + RosterReporter.NEWLINE +
				RosterReporter.ROSTER_REPORT_FOOTER + "2", 
				rosterReport);
	}
}