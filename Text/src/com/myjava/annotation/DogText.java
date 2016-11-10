package com.myjava.annotation;

import java.lang.reflect.Field;

public class DogText {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		
		Class<Dog> c = Dog.class;
		Dog d = c.newInstance();
		Field f = c.getDeclaredField("name");
		
		
		
	}
	
}
