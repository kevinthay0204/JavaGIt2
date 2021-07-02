package tw.kevin;

import tw.kevin.classes.Bike;

public class Brad20 {

	public static void main(String[] args) {
		Bike mybike = new Bike(); //創造一台新的腳踏車物件
		Bike yourbike = new Bike(); 
		System.out.println("the speed of my bike was " + mybike.getSpeed()+".");//tw.kevin.classes.Bike Bike()物件有被導入 起始速度0
		System.out.println("the speed of my bike was " + yourbike.getSpeed()+".");;
	
		int up = 0;
		do {	
			yourbike.SpeedUp();
			up++;
		}while( yourbike.getSpeed() < 5);
		System.out.println("The speed of your bike is "+yourbike.getSpeed()+". and you have to speed up "+ up +" times.");
		
		 // 看看加速到多快 
		
		System.out.println(mybike.getSpeed());
		System.out.println(yourbike.getSpeed());
		
		System.out.println("--------");
		
		do {
		yourbike.SpeedUp(true);
		}while (yourbike.getSpeed()< 80);
		System.out.println("yourbike speed: "+yourbike.getSpeed()+ " KM");
		System.out.println("--------");

		for (int i =0;i<=10; i++) {
			switch(i) {
			case 1:case 3:case 5:yourbike.SlowDown();break;
			default:yourbike.SlowDown(5,3);break;
			}
		}
		System.out.println("yourbike speed: "+yourbike.getSpeed()+ " KM");
	}
}


