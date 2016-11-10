package com.myjava.TeacherProblm;

import java.io.File;
import java.io.IOException;

public class SetFile {
	public static void main(String[] args) throws IOException {
		
		File f = new File("e:\\Text.txt");
		if (f.exists()) {
			System.out.println("已存在，请使用");
		}else {
			f.createNewFile();
			System.out.println("创建Text.txt文件完成");
		}
		
		
	}
}
