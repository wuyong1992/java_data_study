package com.myjava.Text.bookl;

public class Sanjiaoxin_dao01 {

	public static void printS(int m) {
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

	}
}


	