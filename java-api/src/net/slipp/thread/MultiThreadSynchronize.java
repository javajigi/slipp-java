package net.slipp.thread;

public class MultiThreadSynchronize {
	private int index = 0;

	MultiThreadSynchronize() {
	}

	public int getMax() {
		index++;
		System.out.println("index : " + index);
		try {
			Thread.sleep(10);
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
		int max = synchronize.getMax();
		while (max < 1000) {
			max = synchronize.getMax();
		}
	}
}
