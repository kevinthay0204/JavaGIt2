package tw.kevin.classes;

public class Bradcar extends RacingCar{
	//1.所有類別一定有建構式
	//	1.1如果沒有定義，編譯氣會幫忙.指定父親無參數的建構子
	//	1.2其他就要自己想辦法
	//2.所有建構子的第一道敘述句，在其祖宗八代依直到Object給進行初始化
	//	2.1 不寫就是 sup		er()
	
	public Bradcar() {
		System.out.println("Bradcar()");
	}

}
