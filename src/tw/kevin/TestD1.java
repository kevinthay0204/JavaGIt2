package tw.kevin;

public class TestD1 {

	public static void main(String[] args) {
		int r = fxy(3,4);
		System.out.println(r);
		System.out.println("--------");
		
		System.out.println("b = " + kevin301.b); // 類別中的 Static 產生幾個物件實體也就是幾個new 就會執行幾次
		kevin301 k1 =new kevin301();
		System.out.println("b = " + kevin301.b);
		System.out.println("k1 b= "+k1.a);
		kevin301 k2 =new kevin301();
		
		System.out.println(k1.a);
		System.out.println(k2.a);

		System.out.println(k1.b);
		System.out.println(k2.b);
		
		System.out.println("b = " + kevin301.b);
	}

	static int fxy(int x, int y) {
		return 2*x + y;
	}
	
	
	
}

class kevin301{
	int a;
	static int b; 
	
	kevin301(){
		a++;
		b++;
	}}	
	
	
