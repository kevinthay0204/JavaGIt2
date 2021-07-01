package tw.kevin.test;

import tw.kevin.classes.Bike;

public class Scooter1 extends Bike{

	//overwrite 
	
	public void SpeedUp(){
		speed = speed <1 ? 1:speed*1.8;
		}
}
