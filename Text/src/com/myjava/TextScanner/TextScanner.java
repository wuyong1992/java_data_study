package com.myjava.TextScanner;

import java.util.Scanner;

public class TextScanner {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("请输入测试类型");

		Integer i = s.nextInt();
		System.out.println("你输入的数字是" + i);
	}
}
