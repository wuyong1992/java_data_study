package com.myjava.textIO;

/**
 *测试以绝对路径和相对路径构建File对象 
 */
import java.io.File;

public class TextFilePath {
	public static void main(String[] args) {
		
		String parent = "e:\\TextFilePath";
		String child = "ChildPath.txt";
		
		File f = new File(parent,child);
		System.out.println(f.getPath());
		
		f = new File(parent);
		System.out.println(f);
		
		//以相对路径来构建实例化对象
		f = new File(child);
		System.out.println(f);
		//相对路径，没有盘符，以当前该工作环境构建
		System.out.println(f.getAbsolutePath());
		
		
	}
}
