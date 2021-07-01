package tw.kevin.classes;

public class Scooter extends Bike {  /*extend 繼承囉inheritance */
	//OOE 物件導向設計
	private int gear; //0 不用初始化是0

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		if (gear >= 0 && gear<=5) {
			if (Math.abs(this.gear-gear) == 1) {
				this.gear = gear;
			}
		}
	}

	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return super.getSpeed();
	}

	//overwrite 
	public void SpeedUp(){
		if (gear>0) {
		speed = speed<1 ? 1:speed + 2*gear ;} //speed up rate higher than Bike. 
	}

	
	
	
	
}
