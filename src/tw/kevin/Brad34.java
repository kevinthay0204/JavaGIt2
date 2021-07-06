package tw.kevin;

public class Brad34 {
//看Java.awt.Graphics (API) 看視窗程式的外觀
	public static void main(String[] args) { // 抽象類別無法直接建構出物件實體 要執行的話只要再把abstract的部分實作
		Brad341 obj1 = new Brad341() {
		void m1() {System.out.println("m1()");}
		void m2() {System.out.println("m2()");}
		};
		
		obj1.m1();
		obj1.m2();
		
	}
}
abstract class Brad341{
	abstract void m1();
	abstract void m2();
}