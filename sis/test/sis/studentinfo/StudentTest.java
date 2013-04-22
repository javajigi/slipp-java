package sis.studentinfo;

import junit.framework.TestCase;

public class StudentTest extends TestCase {
	private static final double GRADE_TOLERANCE = 0.05;
	
	public void testCreate() {
		final String firstStudentName = "박 재성";
		Student firstStudent = new Student(firstStudentName);
		assertEquals("박", firstStudent.getFamilyName());
		assertEquals("재성", firstStudent.getPersonalName());
		
		final String secondStudentName = "박 주한";
		Student secondStudent = new Student(secondStudentName);
		assertEquals(secondStudentName, secondStudent.getName());
		assertEquals("박", firstStudent.getFamilyName());
		assertEquals("주한", firstStudent.getPersonalName());		
		
		assertEquals(firstStudentName, firstStudent.getName());
	}
	
	public void testStudentStatus() throws Exception {
		Student student = new Student("a");
		assertEquals(0, student.getCredits());
		assertFalse(student.isFullTime());
		
		student.addCredits(3);
		assertEquals(3, student.getCredits());
		assertFalse(student.isFullTime());
		
		student.addCredits(4);
		assertEquals(7, student.getCredits());
		assertFalse(student.isFullTime());
		
		student.addCredits(5);
		assertEquals(Student.CREDITS_REQUIRED_FOR_FULL_TIME, student.getCredits());
		assertTrue(student.isFullTime());		
	}
	
	public void testInState() throws Exception {
		Student student = new Student("a");
		assertFalse(student.isInState());
		student.setState(Student.IN_STATE);
		assertTrue(student.isInState());
		student.setState("서울특별시");
		assertFalse(student.isInState());
	}
	
    public void testCalculateGpa() throws Exception {
        Student student = new Student("a");
        student.setGradingStrategy(new BasicGradingStrategy());
        assertGpa(student, 0.0);
        student.addGrade(Student.Grade.A);
        assertGpa(student, 4.0);
        student.addGrade(Student.Grade.B);
        assertGpa(student, 3.5);
        student.addGrade(Student.Grade.C);
        assertGpa(student, 3.0);
        student.addGrade(Student.Grade.D);
        assertGpa(student, 2.5);
        student.addGrade(Student.Grade.F);
        assertGpa(student, 2.0);
    }
    
    private void assertGpa(Student student, double expectedGpa) {
        assertEquals(expectedGpa, student.getGpa(), GRADE_TOLERANCE);
    }
    
    public void testCalculateHonorStudentGpa() throws Exception {
        assertGpa(createHonorStudent(Student.Grade.A), 5.0);
        assertGpa(createHonorStudent(Student.Grade.B), 4.0);
        assertGpa(createHonorStudent(Student.Grade.C), 3.0);
        assertGpa(createHonorStudent(Student.Grade.D), 2.0);
        assertGpa(createHonorStudent(Student.Grade.F), 0.0);
    }

	private Student createHonorStudent(Student.Grade grade) {
		Student student = new Student("a");
		student.setGradingStrategy(new HonorsGradingStrategy());
		student.addGrade(grade);
		return student;
	} 
}