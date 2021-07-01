package tw.kevin.classes;

public class Scooter extends Bike {  /*extend 繼承囉inheritance */

	public void SpeedUp(){
		speed = speed <1 ? 1:speed*1.8; //speed up rate higher than Bike. 
	}

}
