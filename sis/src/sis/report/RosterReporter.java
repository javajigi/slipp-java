package sis.report;

import sis.studentinfo.CourseSession;
import sis.studentinfo.Student;

class RosterReporter {
	static final String NEWLINE = System.getProperty("line.separator");
	static final String ROSTER_REPORT_HEADER = "학생 목록" + NEWLINE + "----" + NEWLINE;
	static final String ROSTER_REPORT_FOOTER = NEWLINE + "학생 수 : ";
	
	private CourseSession session;
	
	public RosterReporter(CourseSession session) {
		this.session = session;
	}

	public String getReport() {
		StringBuilder sb = new StringBuilder();
		sb.append(ROSTER_REPORT_HEADER);
		
		for(int i=0; i < session.getNumberOfStudents(); i++) {
			Student student = session.get(i);
			sb.append(student.getName());
			sb.append(NEWLINE);
		}
		
		sb.append(ROSTER_REPORT_FOOTER + session.getNumberOfStudents());
		return sb.toString();
	}
}
