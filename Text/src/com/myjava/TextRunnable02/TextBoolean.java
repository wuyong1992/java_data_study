package com.myjava.TextRunnable02;

public class TextBoolean implements Runnable {

	private boolean stop;

	@Override
	public void run() {
		for (int i = 0; i < 20 && !stop; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void onoff() {
		this.stop = true;
	}

}
