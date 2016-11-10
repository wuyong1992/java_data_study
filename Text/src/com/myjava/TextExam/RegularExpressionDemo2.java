package com.myjava.TextExam;

import java.io.BufferedReader;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegularExpressionDemo2 {

	public static void main(String[] args) throws IOException {

		File f = new File("f:\\text01.txt");
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

		InputStream in = new FileInputStream(f);
		Reader r = new InputStreamReader(in, "utf-8");
		BufferedReader bReader = new BufferedReader(r);

		// 将文本中读取的内容保存在一个字符串内
		StringBuilder sb = new StringBuilder();
		String temp = null;
		while ((temp = bReader.readLine()) != null) {
			sb.append(temp);
		}
		System.out.println(sb);

		System.out.println("可用参数为：");

		// 利用正则表达式去取数字
		Pattern p = Pattern.compile("\\d+\\b");
		// Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(sb);
		// 先找后输出
		while (m.find()) {
			System.out.println(m.group());
		}

		// 完全平方数求解for循环
		for (int i = 1; i <= 1000; i++) {
			if (Math.sqrt(i + 100) % 1 == 0 && Math.sqrt(i + 100 + 168) % 1 == 0) {
				System.out.println("1000内这个数是：" + i);
				w.write("\r\n" + "答案：" + i); // 将求得值写入文本
				w.flush(); // 刷新流，循环内不能关闭
			}
		}
		System.out.println("答案已经存在与文本末尾");
		w.close();
		r.close();

		bReader.close();
	}

}
