package com.myjava.DeadLockDemo;

public class DeadLock {
	static String knife = "刀", fork = "叉";

	static class A extends Thread {
		@Override
		public void run() {
			synchronized (knife) {
				System.out.println("甲拥有" + knife + "，等这乙给他" + fork);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (fork) {
					System.out.println("甲又拿起了" + fork);
				}
			}

		}
	}

	static class B extends Thread {
		@Override
		public void run() {
			synchronized (fork) {
				System.out.println("乙拥有" + fork + "，等着甲给他" + knife);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (knife) {
					System.out.println("甲又拿起了" + knife);
				}
			}
		}
	}

	static class C extends Thread {
		public C() {
			this.setDaemon(true);
		}

		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("守护线程：程序正在运行中...");
			}
		}
	}

	public static void main(String[] args) {
		new A().start();
		new B().start();
		new C().start();
	}
}
