
public class Chicken {

	public static void main(String[] args) {
		
		int x,y,z; //x公鸡，5元；y母鸡，3元；z小鸡三只1元
		for (x = 0; x <= 20; x++) {
			for (y = 0; y <= 33; y++) {
				z=(100-x*5-y*3)*3;
				if (x+y+z==100) {
					System.out.println("公鸡"+x+"只;"+"母鸡"+y+"只;"+"小鸡"+z+"只。");
				}
			}
			
		}
		
	}

}
