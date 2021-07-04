package tw.kevin;

import tw.kevin.classes.Mytest2;

public class Brad26 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = obj1;
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1 == obj3);
		System.out.println(obj1.equals(obj3));				
		System.out.println(obj1);
		System.out.println(obj2);		
		System.out.println(obj3);
		System.out.println("----------");
		
		Mytest2 mt1 = new Mytest2(18);
		Mytest2 mt2 = new Mytest2(19);
		System.out.println(mt1 == mt2);
		
		System.out.println(mt1.equals(mt2) );
		System.out.println("---");
		String s1 = new String("Kevin");
		String s2 = new String("Kevin");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println("---");
		System.out.println(mt1);  //在test2 改寫Object類別下的 Tostring 的return值 
	}

}
