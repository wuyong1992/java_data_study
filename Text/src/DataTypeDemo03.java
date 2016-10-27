import javax.print.attribute.standard.PrinterLocation;

public class DataTypeDemo03 {

	public static void main(String[] args) {
		Long long1,long2 ;
		long1=200L;
		long2=210L;
		
		Float float1,float2;
		float1=1.1F;
		float2=2.2F;
		
		float2=float2.parseFloat(""+long2);
		System.out.println(float2);
	}

}
