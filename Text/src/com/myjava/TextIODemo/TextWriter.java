package com.myjava.TextIODemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TextWriter {
	public static void main(String[] args) throws IOException {
		
		File f = new File("E:\\textScanner\\ReaderDemo.txt");
		File f2 = new File("E:\\textScanner\\ReaderDemo_cn.txt");
		
		Writer w =new FileWriter(f, true);
		w.write("\r\n我是刚加进来了的");
		w.close();
		System.out.println("已经写入，并且已关闭流");
		
		OutputStream in = new FileOutputStream(f2,true);   //及得加入参数true，负责覆盖
		Writer w2 = new OutputStreamWriter(in, "GBK");		//向上找，直到找到构造参数里面可以setName设置编码的
		w2.write("\r\n我是刚加入的字符串");
		w2.close();
		System.out.println("字符串已添加，并且关闭流");
	}
}
