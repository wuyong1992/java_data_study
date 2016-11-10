package com.myjava.TextReflect;

import java.lang.reflect.Field;

public class Snippet {
	public static void main(String[] args) throws Exception{  
	              
	//<span style="white-space:pre">  </span>//以前的方式：  
	    /* 
	    User u = new User(); 
	    u.age = 12; //set 
	    System.out.println(u.age); //get 
	    */  
	              
	    //获取类  
	    Class c = Class.forName("Reflect.User");  
	    //获取id属性  
	    Field idF = c.getDeclaredField("age");  
	    //实例化这个类赋给o  
	    Object o = c.newInstance();  
	    //打破封装  
	    idF.setAccessible(true); //使用反射机制可以打破封装性，导致了java对象的属性不安全。  
	    //给o对象的id属性赋值"110"  
	    idF.set(o, "110"); //set  
	    //get  
	    System.out.println(idF.get(o));  
	} 
}

