package com.myjava.TextReflect;

import lombok.Data;

@Data
public class User {

	private String name;
	private Integer age;

	public void say() {
		System.out.println("大家好");
	}

	public void say(Integer age) {
		this.age = age;
		System.out.println("大家好,我今年"+age+"岁。 ");
	}

	//重写了to String的方法
	@Override
	public String toString() {
		return "我是：" + name + ", 今年=" + age + "]";
	}

	
}
