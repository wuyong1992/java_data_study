package com.myjava.TextReflect;

public class InstantiateDemo {
	public static void main(String[] args) throws Exception {
		
		Class<?> c = Class.forName("Reflect.User");
		User u = (User) c.newInstance();
		
		u.setName("jianguo");
		u.setAge(25);
		
		System.out.println(u);		
		
	}

}
