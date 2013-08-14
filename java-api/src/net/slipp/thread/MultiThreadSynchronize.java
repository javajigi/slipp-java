package net.slipp.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class MultiThreadSynchronize {
	private AtomicInteger atomicInt = new AtomicInteger();

	private int index = 0;
	
	MultiThreadSynchronize() {
	}

	public int getMax() {
		index++;
		System.out.println(index);
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return index;
	}

	public static void main(String[] args) {
		MultiThreadSynchronize synchronize = new MultiThreadSynchronize();
		new SyncThread(synchronize).start();
		new SyncThread(synchronize).start();
		new SyncThread(synchronize).start();
		new SyncThread(synchronize).start();
		new SyncThread(synchronize).start();
	}
}

class SyncThread extends Thread {
	private MultiThreadSynchronize synchronize;

	public SyncThread(MultiThreadSynchronize synchronize) {
		this.synchronize = synchronize;
	}

	@Override
	public void run() {
		long start = System.currentTimeMillis();
		int max = synchronize.getMax();
		while (max < 1000) {
			max = synchronize.getMax();
		}
		long end = System.currentTimeMillis();
		// System.out.println("execution time : " + (end - start));
	}
}
