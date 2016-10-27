import java.io.PrintStream;

public class Text002 {

	public static void main(String[] args) {
		PrintStream prt = System.out;
		Integer integer1 = 20, integer2 = 12;
		String x = Integer.toBinaryString(integer1);
		String y = Integer.toBinaryString(integer2);
		prt.println("integer1 二进制：" + x);
		prt.println("integer2 二进制：" + y);
		prt.println("integer1 & integer2 " + (integer1 & integer2));
		prt.println("integer1 & integer2 二进制 " + Integer.toBinaryString(integer1 & integer2));
		prt.println("integer1 & integer2 二进制   " + (x + y));// 位运算只针对数字，x.y赋值为二进制字串
		prt.println("integer1 | integer2 二进制  " + Integer.toBinaryString(integer1 | integer2));
		prt.println("integer1 ^ integer2 二进制 " + Integer.toBinaryString(integer1 + integer2));
		prt.println("integer1左移2位   " + (integer1 << 2));
		prt.println("integer1右移3位    " + (integer1 >> 3));
		prt.println("integer1右移3为补充零    " + (integer1 >>> 3));

	}

}
