package TextDateDemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class TestDateFormat {
	public static void main(String[] args) {
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-DD hh:mm：ss");
		
		Date d = new Date(1514135467L);
		//System.out.println(df.format(d));
		String str = df.format(d);
		//将时间转换成格式化字符串
		System.out.println(str);
		
		String str2 = "2016-11-3";
		DateFormat df2 =new SimpleDateFormat("yyyy-MM-DD");
		try {
			Date d2 = df2.parse(str2);
			System.out.println(d2);
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
