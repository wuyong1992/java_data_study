package com.myjava.TextReflect;

public class Reflection {
	public static void main(String[] args) {

		try {
			
			Class<?> c = Class.forName("Reflect.User");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}		//User类中不能丢了无参构造方法，否则找不到该类

		
	}
}
