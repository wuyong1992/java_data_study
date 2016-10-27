package ObjectInnerDemo.java;

public class Outer {
	Integer score = 95;
	
	void inst(){
		Inner in = new Inner();
		in.dispaly();
	}
	
	public class Inner{
		String name;
		void dispaly(){
			System.out.println("成绩:scoer="+score);
		}
	}

}
