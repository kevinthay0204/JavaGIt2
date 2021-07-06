package tw.kevin;
//多形的概念
public class Brad32 {

	public static void main(String[] args) {
		
		Brad321 obj1 = new Brad321();
		System.out.println("--------");
		Brad322 obj2 = new Brad322();
		System.out.println("--------");
		Brad323 obj3 = new Brad323();
		System.out.println("--------XXXXXXXXXX");
		obj1.m1();
		obj2.m1();
		obj3.m1();
		System.out.println("-------------");
		Brad321 obj4 = new Brad322(); //重要
		System.out.println("-------------");
		obj4.m1();
		System.out.println("-------------");
		Brad321 obj5 = new Brad323(); 
		System.out.println("-------------");
		obj5.m1();
		
		
	}
}
class Brad321{ //祖父物件
	Brad321(){
		System.out.println("Brad321()");
	}
	void m1() {System.out.println("Brad321:m1()");} //方法
}
class Brad322 extends Brad321{
	//super();
	Brad322(){
		System.out.println("Brad322()");
	}
	void m1() {
	super.m1();						// super.m1 是父類別的物件實體
	System.out.println("Brad322:m1()");   // void m1()是對爸爸進行改寫 
	
	}
	void m2() {System.out.println("Brad322:m2()"); }
}
class Brad323 extends Brad322{
	//super();
	Brad323(){
		System.out.println("Brad323()");
	}
	void m1() {
		super.m1();
		System.out.println("Brad323:m1()");
		super.m1();}
	void m2() {System.out.println("Brad323:m2()");}
}
//繼承是發生在物件的屬性跟方法
//建構式 做物件初始化