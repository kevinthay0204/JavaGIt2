package tw.kevin.classes;

public class Bike {
	private double speed; 
	
	public void SpeedUp(){
		speed = speed <1 ? 1:speed*1.2;
	}
	public void SlowDown() {
		speed = speed <1 ? 0:speed*0.7;
	}
	public double getSpeed() {
		return speed;
	}

}
