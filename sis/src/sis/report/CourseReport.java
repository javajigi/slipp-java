package sis.report;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import sis.studentinfo.CourseSession;

public class CourseReport {
	private List<CourseSession> sessions = new ArrayList<CourseSession>();

	public void add(CourseSession session) {
		sessions.add(session);
	}

	public String text() {
		Collections.sort(sessions);
		StringBuilder builder = new StringBuilder();
		for (CourseSession session : sessions) {
			builder.append(session.getDepartment() + " " + session.getNumber()
					+ RosterReporter.NEWLINE);
		}
		return builder.toString();
	}
}
