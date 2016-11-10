package com.myjava.TextReflect;

public class ClassDemo {

	public static void main(String[] args) throws Exception {
		
		Class<?> c1 = Class.forName("Reflect.User");
		Class<?> c2 = com.myjava.TextReflect.User.class;
		Class<?> c3 = new User().getClass();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3
				);
	}

}
