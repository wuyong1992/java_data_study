
public class Qinghua {

	public static void main(String[] args) {
		
		Double year = 1.0,wage = 40.0,price = 200.0;
		
		while(true){
			year++;
			if (price*Math.pow(1.1, year)==wage*year){
				System.out.println(year);
			}else {
				System.out.println("买不起");
				break;
			}
		}
	}

}
