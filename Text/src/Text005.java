import java.io.PrintStream;

public class Text005 {

	public static void main(String[] args) {
		PrintStream out = System.out;
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				out.print(j+"*"+i+"="+j*i+"\t");
			}
			out.println();
		}
	}

}
