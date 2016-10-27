import java.io.PrintStream;

public class DataTypeDemo {

	public static void main(String[] args) {
		PrintStream prt = System.out;
		// int demo
		int a, b;
		a = 1;
		b = 2;
		prt.println("a + b = " + (a + b) + ";");
		prt.println("a % b = " + (a % b) + ";");

		// boolean demo
		boolean c, d;
		c = true;
		d = false;
		prt.println();
		prt.println("c && d = " + (c && d) + ";");
		prt.println("c || d = " + (c || d) + ";");
		prt.println("!c=" + !c + ";");

		// double
		double e, f;
		e = 1.1;
		f = 2.2;
		prt.println();
		prt.println(" e + f = " + (e + f) + ";");
		prt.println(" e - f = " + (e - f) + ";");

		// char
		char g, h;
		g = 'x';
		h = 'y';
		prt.println();
		prt.println(" g + h =  " + (g + h) + ";");

		// String
		String i, j;
		i = "Hello Java ";
		j = "Hello Everyone ";
		prt.println();
		prt.println(" i + j = " + (i + j) + ";");
		prt.println(" g + h = " + String.valueOf(g) + String.valueOf(h) + ";");

	}

}
