package net.slipp.thread;

public class MyThread extends Thread {
	public MyThread() {
		super("mythread");
	}

	@Override
	public void run() {
		System.out.println(getName() + " Thread Running");
	}

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
	}
}
