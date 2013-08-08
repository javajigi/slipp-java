package net.slipp.thread;

public class MyMultiThread extends Thread {
	public MyMultiThread(int index) {
		super("mythread" + index);
	}

	@Override
	public void run() {
		System.out.println(getName() + " Thread Running");
	}

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			MyMultiThread thread = new MyMultiThread(i);
			thread.run();
		}
	}
}
