package tw.kevin.classes;

public class Car extends Object{
	private int color;
	
	//建構式/ Constructor 一定有建構式 沒訂java也會幫我們訂成extend Object
//	public Car() {
//		// 針對物件實體進行初始化的任務
//	System.out.println("Car()");
//	}
//	
	public Car(int color) {
	this.color =color; 
	System.out.println("Car(1)");
	}
	
	
	public int getColor() {
	return color;
	}
	
	public void setColor(int color) {
	this.color = color;
	}
	
}
