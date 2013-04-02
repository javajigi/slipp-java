package sis.report;

import static sis.report.ReportConstant.NEWLINE;

import java.util.Date;

import junit.framework.TestCase;
import sis.studentinfo.CourseSession;
import sis.studentinfo.DateUtil;
import sis.studentinfo.Student;

public class RosterReporterTest extends TestCase {
	public void testRosterReport() throws Exception {
		Date startDate = DateUtil.createDate(2013, 03, 22);
		CourseSession session = new CourseSession("ENGL", "200", startDate);
		session.enroll(new Student("A"));
		session.enroll(new Student("B"));
		
		String rosterReport = new RosterReporter(session).getReport();
		System.out.println(rosterReport);
		assertEquals(
				RosterReporter.ROSTER_REPORT_HEADER + 
				"A" + NEWLINE + 
				"B" + NEWLINE +
				RosterReporter.ROSTER_REPORT_FOOTER + "2", 
				rosterReport);
	}
}