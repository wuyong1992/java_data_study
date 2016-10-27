import java.io.PrintStream;

public class UnicodeQuery {

	public static void main(String[] args) {
		PrintStream prt = System.out;

		// char与int互相查询，以下程序可以查询Unicode表中序号与含义。
		Character char1 = 'a', char2 = 'b';

		// 查找Unicode中符号对应的编码
		prt.println("a在unicode中的位置为：" + (int) char1);
		prt.println("b在Unicode中的位置为：" + (int) char2);

		// 查询Unicode中编码对应的符号
		int x = 2001, y = 1850;
		prt.println("Unicode表中第97位的是：" + (char) x);
		prt.println("Unicode表中第97位的是：" + (char) y);
	}

}
