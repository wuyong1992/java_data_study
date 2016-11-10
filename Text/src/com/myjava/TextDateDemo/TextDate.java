package com.myjava.TextDateDemo;

import java.util.Date;

/**
 *测试时间类Date
 * @author Administrator
 *
 */
public class TextDate {

	public static void main(String[] args) {

		Date d = new Date();
		//long t =System.currentTimeMillis();
		System.out.println(d);
		
		//参数以毫秒表示，横杆表示不推荐使用，已过时
		Date d2 = new Date(1000);
		System.out.println(d2.toGMTString());
		
		
	}

}
