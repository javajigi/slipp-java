package sis.report;

import static sis.report.RosterReporter.NEWLINE;

import java.util.Date;

import sis.studentinfo.CourseSession;

import junit.framework.TestCase;

public class CourseReporterTest extends TestCase {
	public void testReport() throws Exception {
		final Date date = new Date();
		CourseReport report = new CourseReport();
		report.add(CourseSession.create("KOR", "110", date));
		report.add(CourseSession.create("ENGL", "201", date));
		report.add(CourseSession.create("CHN", "313", date));
		
		assertEquals(
				"CHN 313" + NEWLINE +
				"ENGL 201" + NEWLINE +
				"KOR 110" + NEWLINE 
				, report.text());
	}
}
