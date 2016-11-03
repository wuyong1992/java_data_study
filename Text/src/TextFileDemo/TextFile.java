package TextFileDemo;

import java.io.File;

public class TextFile {
	public static void main(String[] args) {
		
		//File f = new File("e:");
		File f1 = new File("e:\\testFile","newtext.txt");		//可以写成这个方式File f4 = new File("e:\testFile");
		//File f3 = new File(f, "testFile");
		
		if (f1.isFile()) {
			System.out.println("是一个文件");
		}else {
			System.out.println("没有这个文件");
		}
		
	}

}
