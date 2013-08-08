package net.slipp.thread;

public class MyRunnableThread implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread Running");
	}
	
	public static void main(String[] args) {
		Thread thread = new Thread(new MyRunnableThread());
		thread.start();
	}
}
