
public class Sanjiaoxing {

	public static void main(String[] args) {
		
		 int n=5;
		for(int i = 1; i <= n; i ++){
	            for(int j = i; j < n; j ++){
	                System.out.print(" ");
	            }
	            //左半部分
	            for(int j = 1; j <= i; j++){
	                System.out.print("*");
	            }
	            //右半部分
	            for(int j = 1; j < i; j++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}

