package com.myjava.TextExam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RDemo {
	
	public static void readout(String file) throws IOException {
		
		File f = new File(file);
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
		
	}

}
