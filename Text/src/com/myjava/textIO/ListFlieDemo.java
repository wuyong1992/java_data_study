package com.myjava.textIO;

import java.io.File;

public class ListFlieDemo {
	
	//利用static修饰这个方法，所以可以直接利用类.方法，不需要再new一个实例化对象
	public static void listF(File dir) {
		
		File[] files = dir.listFiles();
		
		if (files!=null && files.length>0) {
			for (File file : files) {
				if (file.isDirectory()) {
					listF(file);
				}else {
					System.out.println(file);
				}
			}
		}		
		
		
	}
}
