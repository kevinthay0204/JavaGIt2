package tw.kevin.classes;

public class Bike {
	// has a member (屬性、方法) 
	//has-a speed, speedup(),
	protected double speed; /*屬性 也可以1.不寫 2.private 限制級 3.protected 保護級(繼承的其他程式可以做更改) 
	public 全世界*/
	public void SpeedUp(){  
		speed = speed <1 ? 1:speed*1.2;
	}
	// Overload 覆載
	public void SpeedUp(boolean isUphill){ 
		if(isUphill) {
		speed = speed <1 ? 1:speed*1.1;
		}else {
		speed = speed <1 ? 1:speed*1.4; 
		}
	}
	
	
	public void SlowDown() {
		speed = speed <1 ? 0:speed*0.7;
	}
	public double getSpeed() {
		return speed;
	}

}
