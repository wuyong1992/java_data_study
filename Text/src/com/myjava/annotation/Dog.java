package com.myjava.annotation;

public class Dog {
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	
	@Val
	String name;
	Integer age;
	
}
