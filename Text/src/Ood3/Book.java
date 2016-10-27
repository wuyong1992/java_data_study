package Ood3;

public class Book {

	String title;
	Integer page;

	public void print() {
		System.out.println("我是第一本书，书名是：" + title + "\t" + "总共有：" + page + "页");
	};

	public String print1() {
		String str = "我是第二本书，书名是：" + title + "\t" + "总共有：" + page + "页";
		return str;
	}

}
