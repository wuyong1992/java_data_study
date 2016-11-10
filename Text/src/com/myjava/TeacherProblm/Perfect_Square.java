package com.myjava.TeacherProblm;

public class Perfect_Square {

	public static void main(String[] args) {

		for (int i = 0; i <= 1000; i++) {
			if (Math.sqrt(i + 100) % 1 == 0 && Math.sqrt(i + 100 + 168) % 1 == 0) {
				System.out.println(i);
			}

		}

	}

}
