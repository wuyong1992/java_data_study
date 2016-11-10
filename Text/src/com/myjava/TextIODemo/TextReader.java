package com.myjava.TextIODemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TextReader {
	public static void main(String[] args) throws IOException {

		File f = new File("E:\\textScanner\\ReaderDemo.txt");
		File f2 = new File("E:\\textScanner\\ReaderDemo_cn.txt");

		Reader reader = new FileReader(f);
		char[] b = new char[(int) f.length()];
		reader.read(b);
		System.out.println(b);
		reader.close();

		InputStream in = new FileInputStream(f2);
		Reader reader2 = new InputStreamReader(in, "gbk");
		char[] b2 = new char[(int) f2.length()];
		reader2.read(b2);
		System.out.println(b2);
		reader2.close();

	}
}
