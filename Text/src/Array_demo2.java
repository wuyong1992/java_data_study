import java.io.PipedInputStream;
import java.io.PrintStream;
import java.util.Arrays;

import sun.net.www.content.audio.x_aiff;

public class Array_demo2 {

	public static void main(String[] args) {

		PrintStream out = System.out;

		int[] intarray01 = { 8, 11, 7, 25, 36, 41 };
		int[] intarray02;
		intarray02 = new int[4];

		// copy intarray01 第二位原色开始共两个元素，至intarray02中自第二位开始。
		System.arraycopy(intarray01, 1, intarray02, 1, 2);

		// 利用for循环输出intarray02中的元素
		for (int i = 0; i < 4; i++) {
			out.println(intarray02[i]);
		}

		// 给intarray01排序
		out.println();
		out.println("intarray01排序结果为：");
		Arrays.sort(intarray01);
		for (int j = 0; j < intarray01.length; j++) {
			out.println(intarray01[j]);
		}

		// max  min
		out.println();
		out.println("取最大值，最小值");

		out.println("intarray01中最大值为： " + intarray01[intarray01.length - 1]);
		out.println("intarray01中最小值为： " + intarray01[0]);
		
		//max min 方法02
		out.println();
		out.println("取最大值，最小值方法02");
		
		int max = 0;
		for (int x = 0; x < intarray01.length; x++) {
			if (intarray01[x]>max) {
				max=intarray01[x];
			} 
		}
		out.println(max);

	}

}
