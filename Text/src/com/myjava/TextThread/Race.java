package com.myjava.TextThread;

public class Race {
	public static void main(String[] args) {
		
		new Rabbit().start();
		new Tortoise().start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("*****加油！加油！*****");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
