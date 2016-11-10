package com.myjava.TextReflect;

import java.lang.reflect.Field;

public class FieldtDemo2 {

	public static void main(String[] args) throws Exception {
		
		Class<?> c = Class.forName("Reflect.User");		//User类中不能丢了无参构造方法，否则找不到该类
		
		
		Field namef = c.getDeclaredField("name");
		
		Object o = c.newInstance();
		
		namef.setAccessible(true);
		
		namef.set(o, "zhang");
		
		System.out.println(namef.get(o));
		
	}

}
