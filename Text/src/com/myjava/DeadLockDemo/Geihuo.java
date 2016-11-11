package com.myjava.DeadLockDemo;

public class Geihuo implements Runnable {

	Object goods;
	Object money;

	@Override
	public void run() {
		while (true) {
			synchronized (money) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (goods) {

				}
			}
			System.out.println("先给我货");
		}
	}

	public Geihuo(Object goods, Object money) {
		this.goods = goods;
		this.money = money;
	}

}
