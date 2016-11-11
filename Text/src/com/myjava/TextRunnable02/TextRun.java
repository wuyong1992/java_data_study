package com.myjava.TextRunnable02;

public class TextRun {
	public static void main(String[] args) {

		TextBoolean b = new TextBoolean();
		Thread t = new Thread(b, "开关测试");

		for (int i = 0; i < 30; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			if (i == 5) {
				t.start();
			}
			if (i == 15) {
				b.onoff();
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
