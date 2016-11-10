package com.myjava.TextReflect;

import java.lang.reflect.Method;

public class MethodDemo {

	public static void main(String[] args) throws Exception {
		
		Class<?> c = Class.forName("Reflect.User");
		Object o = c.newInstance();
		Method m = c.getDeclaredMethod("say");
		Method m1 = c.getDeclaredMethod("say", Integer.class);
		
		System.out.println(m.invoke(o, null));
		System.out.println(m1.invoke(o, 25));
		
		
		
	}

}
