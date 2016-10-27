import java.io.PrintStream;

public class Array_demo {
	public static void main(String[] args) {
		PrintStream out = System.out;

		int[] intarray;

		intarray = new int[4];

		intarray[0] = 1;
		intarray[1] = 3;
		intarray[2] = 5;
		intarray[3] = 7;

		int j = 0;
		for (int i : intarray) {

			j++;
			out.println("第" + j + "位为：" + i);

		}

		out.println();
		out.println("求和");

		for (int i = 0; i < 4; i++) {

			j = j + intarray[i];

		}
		out.println("求和结果为: " + j);
	}
}
