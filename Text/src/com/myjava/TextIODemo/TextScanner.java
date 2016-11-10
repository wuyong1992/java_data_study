package com.myjava.TextIODemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * 测试Scanner
 * @author Administrator
 *
 */

public class TextScanner {
	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("E:\\textScanner\\ScannerDemo.txt");
		InputStream is = new FileInputStream(f);
		Scanner s = new Scanner(f,"GBK");
		while (s.hasNextLine()) {
			System.out.println(s.nextLine());
		}
		
	}
}
