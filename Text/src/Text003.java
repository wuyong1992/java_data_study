import java.io.PrintStream;

public class Text003 {

	public static void main(String[] args) {
		PrintStream out = System.out;
		/*
		 * 让args【0】加上“”空串形成字符串，再将字符串强制转型为整形。
		 * 记得给args赋值，run configuration里面赋值
		 */
		int x = Integer.valueOf(args[0]+"");
		
		//if demo
		if (x >= 5) {
			out.println("x在大于等于5的时候输出:  "+x);
			out.println();
		}
		
		//if else demo
		if (x <=5) {
			out.println("x小于等于5的时候输出:   "+x);//当x的值《=5的时候输出x的值
			out.println();
		} else {
			out.println("x大于5:   "+x);//当x的值大于5的时候输出x的值
			out.println();
		}
		
		// if else if else demo
		if (x>5) {
			out.println("x大于的时候值为：   "+x);
		} else if (x<5) {
			out.println("x小于5的时候值为：   "+x);
		}else if (x==5) {
			out.println("x等于5的时候值为：    "+x);
		}
		out.println();
		
		//switch
		switch (x) {
		case 5:
			out.println("x的值为：   "+5);
			break;
		case 4:
			out.println("x的值为：    "+4);
			break;
		default:out.println("x的默认值为：   "+3);
			break;
		}
		out.println();
	}

}
