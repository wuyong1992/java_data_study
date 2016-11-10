package com.myjava.TextThread;

public class Rabbit extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("兔子跑了" + i + "步");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("兔子到达终点！");

	}
}
