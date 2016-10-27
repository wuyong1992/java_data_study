import java.io.PrintStream;
import java.util.Scanner;// 调用Scanner

public class Equation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);// 声明一个Scanner并赋值给in

		PrintStream out = System.out;// 简化System.out

		out.println("请输入变量a的值：");
		double a = in.nextDouble();// 输出变量a的值并收集

		out.println("请输入变量b的值：");
		double b = in.nextDouble();// 输出变量b的值并收集

		out.println("请输入常量c的值");// 输出常量c的值并收集
		double c = in.nextDouble();

		out.println("原方程式为：  " + a + "x*x+" + b + "x+" + c + "=0");

		double m = (b * b - 4 * a * c), n = (a + a);// 将Δ的值赋给m，将2a的值赋给n，将b*b的值赋给s。
		double x1, x2;

		x1 = (-b + Math.sqrt(m)) / n; // x1,x2为方程的两个解
		x2 = (-b - Math.sqrt(m)) / n;

		// 计算公式拆解
		out.println("解： 已知a = " + a + "\t" + "b = " + b + "\t"+ "c = " + c);//c前面的"\t"为什么没起作用
		out.println("\t" + "Δ = b*b-4ac = " + m);
		out.println("\t" + "2a = " + n);

		//当Δ存在不同情况时，所对应的解也不同，if else if else 语句来判断执行哪一个
		if (m < 0) {
			out.println("\t" + "因为Δ<0,所以该方程无解");

		} else if (m == 0) {
			out.println("\t" + "因为Δ=0，所以有两个相同的解: " + "x1 = x2 = " + x1);

		} else {
			out.println("\t" + "x1 = " + x1 + "\t" + "x2 = " + x2);

		}

	}
}