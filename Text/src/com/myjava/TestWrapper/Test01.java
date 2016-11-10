package com.myjava.TestWrapper;

public class Test01 {
	public static void main(String[] args) {
		
		//Integer i = 1000;编译器自动装箱
		Integer i = new Integer(1000);
		
		//Integer j = new Integer(10000).intValue()
		Integer j = 1000;
		
		//Integer c = i.intValue();
		//Integer c = i;
		
		
		
		System.out.println(i==j);
		System.out.println(i.equals(j));
	}
}


