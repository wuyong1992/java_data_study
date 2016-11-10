package com.myjava.TextExam;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WDemo {
	
	public static void writein(String file) throws IOException {
		
		File f = new File(file);
		if (f.exists()) {
			f.delete();
			System.out.println("原文件已删除，建立新文件");
		}
		f.createNewFile();
		System.out.println("成功创建text文件夹");

		// 选择流，根据字符编码写入字符串并保存
		OutputStream out = new FileOutputStream(f, true);
		Writer w = new OutputStreamWriter(out, "utf-8");

		String str1 = "这是一个java上机试题的文档文件";
		String str2 = "\r\n一个正整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？";
		String str3 = "\r\n需要的参数如下：通过解析下面的字符串得到需要的参数值";
		String str4 = "\r\n100#168#1000";
		w.write(str1);
		w.write(str2);
		w.write(str3);
		w.write(str4);
		w.flush(); // 刷新流，但是不能关闭，否则后面的结果无法写入
		System.out.println("题目写入完毕");
		
	}

}
