package tw.kevin;

import tw.kevin.classes.TWId;

public class Brad29 {

	public static void main(String[] args) {
		String a = "abcdefg";
		String b = a.concat("1234567");
		System.out.println(a);
		System.out.println(b);
		System.out.println("------");
		String c = a.replace('a', 'A');
		System.out.println(c);
		System.out.println("------");
		a =a.toUpperCase();
		System.out.println(a);
		System.out.println("------");
		StringBuffer sb = new StringBuffer();
		sb.append("abcdefg");
		sb.append("1234567").replace(1, 3, "OK");
		System.out.println(sb);
		//StringBuffer 和 StringBuilder 功能幾乎一樣前者慢安全 後者反之
		TWId id1 = new TWId();
		System.out.println(id1);
		
		
	}

}
