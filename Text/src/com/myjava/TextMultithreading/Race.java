package com.myjava.TextMultithreading;

public class Race extends Thread {
	
	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("兔子跑了"+i+"步");
		}
		
	}
	public static void main(String[] args) {
		new Race().start();
		new Tortoise().start();
		
	}

}

class Tortoise extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("乌龟跑了"+i+"步");
		}
	}
}
