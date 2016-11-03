package Ood3;

public class Javahexin extends Book {
	
	//被注释的部分为改写父类的方法
	public void print() {
		System.out.println("我是子类");
	}
	
	public String print1(){
		String str = "我是子方法";
		return str;
	}

	public static void main(String[] args) {

		Book j = new Javahexin();
		j.title = "Javahexin";
		j.page = 105;
		
		j.print();
		System.out.println(j.print1());
	}

	
	

}
