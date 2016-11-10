package com.myjava.ood02;

public class Huma {
	String name;
	Character sex;
	Integer age;
	
	void main01(){
		System.out.println("姓名："+name+"\t"+"性别："+sex+"\t"+"年龄："+age);
	}

	@Override
	public String toString() {
		return "Huma [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}

}
