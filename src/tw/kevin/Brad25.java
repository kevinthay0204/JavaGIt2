package tw.kevin;

import tw.kevin.classes.Bike;

public class Brad25 {

	public static void main(String[] args) {
		// String 物件 
		// 基本型別就是值，物件型別是位置
		// 	複數型別
		char c1 = "Brad".charAt(0);
		char c2 = "Brad".charAt(0);
		String s1 = "Brad";
		String s2 = "Brad";
		int a = 10, b = 10 ;
		
		System.out.println(c1 == c2);
		System.out.println(s1 == s2);
		System.out.println(a == b);
		
		Bike b1 =new Bike();
		Bike b2 =new Bike();
		System.out.println(b1 == b2);
		System.out.println(b1);
		System.out.println(b2);
		
	}

}
