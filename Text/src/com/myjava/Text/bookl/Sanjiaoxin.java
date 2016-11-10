package com.myjava.Text.bookl;

public class Sanjiaoxin {

	public static int printS(int m) {
		if (m > 21 || m < 3)
			return 1;

		for (int i = 0; i < m; i++) {
			if ((m - i) % 2 == 0)
				System.out.println("");
			else {
				for (int k = 0; k < i; k = k + 2) {
					System.out.print(" ");
				}
				for (int j = m; j > i; j--) {
					System.out.print("*");
				}
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		int s = printS(10);
		if (s == 1)
			System.out.println("非法行数!");
	}

}
