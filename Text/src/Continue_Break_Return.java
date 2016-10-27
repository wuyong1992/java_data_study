import java.io.PrintStream;

import jdk.internal.dynalink.support.AbstractCallSiteDescriptor;

public class Continue_Break_Return {

	public static void main(String[] args) {
		PrintStream out = System.out;

		int all = 0;
		for (int i = 0; i <= 100; i++) {
			if (i == 10) {
				out.println("x=10,so continue" + i);
				continue;
			}
			if (i == 20) {
				out.println("i=20,so break" + i);
				break;
			}
			all = all + i;

		}
		out.println(all);

	}

}
