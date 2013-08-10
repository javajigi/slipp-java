package net.slipp.thread;

public class MultiThreadSingleInstance2 {
	public static void main(String[] args) {
		Student2 student = new Student2();
		MultiThread2 thread1 = new MultiThread2("재성", student);
		thread1.start();
		MultiThread2 thread2 = new MultiThread2("주한", student);
		thread2.start();
	}
}

class MultiThread2 extends Thread {
	private String studentName;
	private Student2 student;

	public MultiThread2(String studentName, Student2 student) {
		super(studentName);
		this.studentName = studentName;
		this.student = student;
	}
	
	@Override
	public void run() {
		System.out.println("return message : " + student.getMessage(studentName));
	}
}

class Student2 {
	public String getMessage(String name) {
		String message = name + " Hello World!";
		return message;
	}
}