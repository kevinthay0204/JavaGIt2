package tw.kevin.test;

import tw.kevin.classes.Scooter;

public class Brad21 {

	public static void main(String[] args) {
		Scooter s1 = new Scooter();
		System.out.println(s1.getGear());
		s1.setGear(1); //升檔 
		System.out.println(s1.getGear());
		s1.setGear(2); //升檔 
		System.out.println(s1.getGear());
		s1.setGear(4); // 一次只能升一檔 
		System.out.println(s1.getGear());
	}

}
