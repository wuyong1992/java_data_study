package com.myjava.DeadLockDemo;
/**
 * 死锁还是死循环
 * @author Administrator
 *
 */
public class DeadLockDemo02 {
	public static void main(String[] args) {
		
		Object g = new Object();
		Object m = new Object();
		
		Geiqian A = new Geiqian(g, m);
		Geihuo B = new Geihuo(m, g);
		
		Thread 	t = new Thread(A);
		Thread 	tt = new Thread(B);
		
		t.start();
		tt.start();
	}
}
