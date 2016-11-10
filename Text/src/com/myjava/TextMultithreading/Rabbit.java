package com.myjava.TextMultithreading;

public class Rabbit extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("兔子跑了"+i+"步");
		}
	}
}
