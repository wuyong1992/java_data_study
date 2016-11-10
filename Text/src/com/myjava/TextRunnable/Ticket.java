package com.myjava.TextRunnable;

public class Ticket {
	public static void main(String[] args) {
		
		Web12306 wb = new Web12306();
		
		//声明三个黄牛（代理）抢票
		Thread t1 = new Thread(wb,"黄牛甲");
		Thread t2 = new Thread(wb,"黄牛乙");
		Thread t3 = new Thread(wb,"黄牛丙");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
