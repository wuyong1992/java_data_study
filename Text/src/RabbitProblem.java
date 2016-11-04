import java.util.Scanner;

public class RabbitProblem {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入第几个月了");
		int month = in.nextInt();

		int r;
		int r1 = 0, r2 = 0;

		for (int m = 1; m <= month; m++) {
			if (m == 1 || m == 2) {
				r = 1;
				System.out.println(r);
			} else {
				r = r1 + r2;
				System.out.println(r);
			}
			r2 = r1;
			r1 = r;
		}
	}

}
