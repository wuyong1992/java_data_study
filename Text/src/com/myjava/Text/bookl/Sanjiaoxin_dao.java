package com.myjava.Text.bookl;

public class Sanjiaoxin_dao {
	
	Integer a = 5;  //a为三角形的行数
	
	
	public void printDaosanjiao() {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2*(a-i)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	
	
}



