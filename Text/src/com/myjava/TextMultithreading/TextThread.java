package com.myjava.TextMultithreading;

@SuppressWarnings("all")
public class TextThread {
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread();
		
		System.out.println(t);
		System.out.println(t.activeCount());
		System.out.println(t.currentThread());
		System.out.println(t.getAllStackTraces());
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.interrupted());
		System.out.println("将休眠3s，当前时间的毫秒数："+System.currentTimeMillis());
		Thread.sleep(3000);
		System.out.println("休眠结束，当前时间的好眠数："+System.currentTimeMillis());
	}
}
