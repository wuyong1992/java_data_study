package com.myjava.TextRunnable;

/**
 * 利用Runnable创建多线程
 * 1.避免单继承的局限性
 * 2.便于共享资源
 * 
 * 
 * @author wuyong
 *
 */



public class TextRunnable {
	public static void main(String[] args) {

		//创建一个真是对象
		Programmer p = new Programmer();
		//创建一个代理角色+真是角色引用
		Thread t = new Thread(p);
		
		Eat e = new Eat();
		Thread tt = new Thread(e);
		
		//调用.start()方法启动线程
		t.start();
		tt.start();
		
		//main方法的线程
		for (int i = 0; i <= 10; i++) {
			System.out.println("-------------------");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
		
	}
}
