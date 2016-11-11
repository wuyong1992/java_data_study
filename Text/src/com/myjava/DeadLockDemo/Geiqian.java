package com.myjava.DeadLockDemo;

public class Geiqian implements Runnable {

	Object goods;
	Object money;

	@Override
	public void run() {
		while (true) {
			synchronized (goods) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (money) {

				}
			}
			System.out.println("先给我钱");
		}
	}

	public Geiqian(Object goods, Object money) {
		this.goods = goods;
		this.money = money;
	}

}
