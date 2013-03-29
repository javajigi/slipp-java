package studentinfo;

public class RosterReporter {
	static final String NEWLINE = System.getProperty("line.separator");
	static final String ROSTER_REPORT_HEADER = "학생 목록\n----\n";
	static final String ROSTER_REPORT_FOOTER = "\n학생 수 : ";
	
	private CourseSession session;

	RosterReporter(CourseSession session) {
		this.session = session;
	}

	String getReport() {
		return null;
	}
}