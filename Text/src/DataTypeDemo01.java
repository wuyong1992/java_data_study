import java.io.PrintStream;

public class DataTypeDemo01 {
	PrintStream prt = System.out;

	public static void main(String[] args) {
		PrintStream prt = System.out;

		// Integer
		prt.println("Integer.MAX_VALUE:" + Integer.MAX_VALUE);
		prt.println("Integer.MIN_VALUE:" + Integer.MIN_VALUE);
		prt.println("Integer.BYTES:"+Integer.BYTES);
		prt.println("Integer.MAX_VALUE + 1 = "+(Integer.MAX_VALUE+1));
	}

}
