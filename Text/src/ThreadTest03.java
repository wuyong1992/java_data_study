public class ThreadTest03 {

    public static void main(String[] args) {

        MyRun myRunnable = new MyRun();
        Thread thread = new Thread(myRunnable);

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 30) {
                thread.start();
                try {
                    thread.join();    // main线程需要等待thread线程执行完后才能继续执行
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyRun implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}