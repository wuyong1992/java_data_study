package com.myjava.TextThread;

public class Tortoise extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("乌龟跑了"+i+"步");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("乌龟到达终点！");
	}
}
