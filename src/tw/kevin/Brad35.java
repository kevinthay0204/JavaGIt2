package tw.kevin;

public class Brad35 {

	public static void main(String[] args) {
		Circle c1 = new Circle(3);
		System.out.println("Circle: ");
		System.out.println("Length : " + c1.getLength());
		System.out.println("Area : " + c1.getArea());
		System.out.println("--------------------------");
		Triangle t1 = new Triangle(3,4,5,2);
		System.out.println("Triangle: ");
		System.out.println("Length : " + t1.getLength());
		System.out.println("Area : " + t1.getArea());
		System.out.println("--------------------------");
		System.out.println(sumArea(c1, t1));
	}
	
	static String sumArea(Shape s1, Shape s2) {
		return "Sum of 兩個形狀的面積為: "+ (s1.getArea()+s2.getArea()) ;
		
	}

}

// interface 定義介面 => 定義規格
interface Shape{
	double getLength();
	double getArea();
}

//多形
class Circle implements Shape {
	double r;
	Circle(double r){
		this.r=r;
	}
	public double getLength() {
		return 2*Math.PI*r;
	};
	
	public double getArea() {
		return Math.PI*Math.pow(r, 2);
	};
}
	
class Triangle implements Shape {
	double len1,len2, len3, Hight;
	Triangle(double len1,double len2,double len3,double Hight){
		this.len1=len1;
		this.len2=len2;
		this.len3=len3;
		this.Hight=Hight;
	}
	public double getLength() {
		return len1+len2+len3;
	};
		
	public double getArea() { 
		return len1*Hight;
	};
			
	
}

