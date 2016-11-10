package com.myjava.TextRunnable;

public class Web12306 implements Runnable {

	private int num = 50;

	@Override
	public void run() {
		while (true) {
			if (num <= 0) {
				break;
			}
			System.out.println(Thread.currentThread().getName() + "钱到了" + num--);
		}
		
		//这两种循环为什么结果不一样？

		/*for (int i = 50; i > 0 ; i--) {
			System.out.println(Thread.currentThread().getName()+"抢到了"+i);
		}*/
	}

}
