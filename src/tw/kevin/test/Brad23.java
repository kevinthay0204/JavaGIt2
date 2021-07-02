package tw.kevin.test;

import tw.kevin.classes.Bradcar;
import tw.kevin.classes.Car;
import tw.kevin.classes.RacingCar;

public class Brad23 {

	public static void main(String[] args) {
		int a =10;
//		Car car1 = new Car();
		Car car2 = new Car(1);
		System.out.println("---");
		RacingCar rc1 = new RacingCar();
	//	RacingCar rc2 = new RacingCar(1); 將父類別無傳參數建構式回傳
		System.out.println("---");
		Bradcar bc1 = new Bradcar();
	}

}
