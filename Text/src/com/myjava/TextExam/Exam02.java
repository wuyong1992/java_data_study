package com.myjava.TextExam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Exam02 {
	public static void main(String[] args) throws IOException {

		// 建立联系并创建文本，如果存在，删除重建
		File f = new File("f:\\text.txt");
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

		// 选择流并读取内容
		InputStream in = new FileInputStream(f);
		Reader r = new InputStreamReader(in, "utf-8");
		char[] b = new char[(int) f.length()];
		r.read(b);
		System.out.println("读取文本内容为：" + "\n" + new String(b));
		r.close();

		System.out.println("需要的参数有：");
		// 利用String自带的正则表达式拆分字符串
		String str = "#";
		String temp = "100#168#1000";	//如何不写死？

		// 建立数组存储数据
		String[] demo = temp.split(str);
		int[] num = new int[demo.length];
		for (int i = 0; i < demo.length; i++) {
			num[i] = Integer.valueOf(demo[i]);
			System.out.print(num[i] + "\t");
		}
		System.out.println();

		// 完全平凡数求解for循环
		for (int i = 1; i <= num[2]; i++) {
			if (Math.sqrt(i + num[0]) % 1 == 0 && Math.sqrt(i + num[0] + num[1]) % 1 == 0) {
				System.out.println("1000内这个数是：" + i);
				w.write("\r\n" + "答案：" + i); // 将求得值写入文本
				w.flush(); // 刷新流，循环内不能关闭
			}
		}
		w.close();
		System.out.println("答案已经存在与文本末尾");
	}
}
