package com.myjava.Ood;

public class Human {
	
	private String name;
	private String id;
	private Integer age;
	
	public Human() {
		super();
		System.out.println("这是Hman的无参构造方法，我的作用是创建一个Human的实例");
	}
	
	public Human(String name, String id, Integer age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		System.out.println("这是Huma的有参构造方法，我的作用是创建一个Human的实例");
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	
	
	
}
