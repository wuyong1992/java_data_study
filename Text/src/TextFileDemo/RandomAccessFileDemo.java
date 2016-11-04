package TextFileDemo;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		
		File f = new File("e:"+File.separator+"testFile"+File.separator+"RandomAccessFileDemo"+File.separator+"newFileDemo.txt");
		RandomAccessFile r =new RandomAccessFile(f, "rw");
		
		String name;
		Integer age;
		
		name = "lisi";
		age = 25;
		r.writeBytes(name);
		r.skipBytes(8);
		r.writeInt(age);
		System.out.println("已经写入，请查看");
	}
}
