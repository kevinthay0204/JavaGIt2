package tw.kevin;

public class Brad33 {

	public static void main(String[] args) {
//		Brad331 obj1 =new Brad331();
		Brad331 obj2 =new Brad332();
		obj2.m1();
		obj2.m2();
		
		
	}
}

abstract class Brad331 {  // 沒有實作的抽象abstract方法.的類別也必須為抽象類別
	void m1() {System.out.println("Brad331:m1()");}
	abstract void m2() ;	
 }
//多形
class Brad332 extends Brad331{
	void m2() {System.out.println("Brad332:m2()");}
}

abstract class Brad333 extends Brad331{
	void m3() {System.out.println("Brad333:m3()");}
}

