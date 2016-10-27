import java.io.PrintStream;

public class Text001 {

	public static void main(String[] args) {
		PrintStream prt = System.out;
		Byte byte1 = 1;
		Short short1 = 1;
		Integer int1 = 1;
		Long long1 = 1L;
		Long myLong = (long) (byte1 + short1 + int1 + long1);
		prt.println("所有结果相加得到：" + myLong);
		
		//char与int互相查询，以下程序可以查询Unicode表中序号与含义。
		Character char1='a',char2='b';
		int x=2001,y=1850;
		
		//(integer)char1相当于把char1=a转化成整数型，也可以直接写x，如果直接写成char1，则输出结果为a。
		prt.println("a在unicode中的位置为："+(int)char1);
		prt.println("b在Unicode中的位置为："+(int)char2);
		prt.println("Unicode表中第97位的是："+(char)x);
		prt.println("Unicode表中第97位的是："+(char)y);
		
	}

}
