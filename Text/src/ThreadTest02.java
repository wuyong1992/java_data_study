public class ThreadTest02 {

	public static void main(String[] args) {
		Account account = new Account("123456", 2000);
		DrawMoneyRunnable drawMoneyRunnable = new DrawMoneyRunnable(account, 700);
		Thread myThread1 = new Thread(drawMoneyRunnable, "Dad");
		Thread myThread2 = new Thread(drawMoneyRunnable, "Mam");
		Thread myThread3 = new Thread(drawMoneyRunnable, "Son");
		Thread myThread4 = new Thread(drawMoneyRunnable, "Daughter");

		myThread3.setPriority(10);
		myThread1.setPriority(1);

		myThread1.start();
		myThread2.start();
		myThread3.start();
		myThread4.start();
	}

}

class DrawMoneyRunnable implements Runnable {

	//声明类的属性
	private Account account;
	private double drawAmount;

	//有参构造方法
	public DrawMoneyRunnable(Account account, double drawAmount) {
		super();
		this.account = account;
		this.drawAmount = drawAmount;
	}

	//重写父类的方法
	@Override
	public synchronized void run() {	//利用synchronized同步run方法
		if (account.getBalance() >= drawAmount) { 
			System.out.println(Thread.currentThread().getName() + "取钱成功， 取出钱数为：" + drawAmount);
			double balance = account.getBalance() - drawAmount;
			account.setBalance(balance);
			System.out.println("余额为：" + balance);
		}
	}

	
	//利用synchronized同步代码块，要注意()内的参数
	/*public void run() {
		synchronized (account) {

			if (account.getBalance() >= drawAmount) {
				System.out.println(Thread.currentThread().getName() + "取钱成功， 取出钱数为：" + drawAmount);
				double balance = account.getBalance() - drawAmount;
				account.setBalance(balance);
				System.out.println("余额为：" + balance);
			}
		}
	}*/
}


//定义一个类，类名为Account
class Account {

	//声明类的属性
	private String accountNo;
	private double balance;

	//无参构造方法
	public Account() {

	}

	//有参构造方法
	public Account(String accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}