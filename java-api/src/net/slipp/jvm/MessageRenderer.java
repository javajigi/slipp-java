package net.slipp.jvm;

public class MessageRenderer {
	public void callByReference(Student student) {
		student.name = "예은";
	}
	
	public static void main(String[] args) {
		Student student = new Student("주한");
		MessageRenderer mr = new MessageRenderer();
		mr.callByReference(student);
		System.out.println("Name : " + student.name);
	}
}
