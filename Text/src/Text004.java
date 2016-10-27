import java.io.PrintStream;

public class Text004 {

	public static void main(String[] args) {
		PrintStream out = System.out;
		
		//for循环 01
		out.println();
		out.println("for 循环  demo ");
		for (int i = 0; i < 10; i++) {
			out.println("i = "+i);
		}
		
		//foreach循环
		out.println();
		out.println("foreach 循环  demo ");
		int[] arry={11,22,33,44,55,66,};//[]在语句中的含义？
		for (int i : arry) {
			out.println("i = "+i);
		}
		
		//for循环02
		out.println();
		out.println("for 循环  demo02 ");
		for (int i = 0; i < arry.length; i++) {
			out.println("i = "+arry[i]);//arry[i]代表什么含义？
		}
	}

}
