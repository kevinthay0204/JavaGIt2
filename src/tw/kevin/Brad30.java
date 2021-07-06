package tw.kevin;

import tw.kevin.classes.TWId;

public class Brad30 {

	public static void main(String[] args) {
		TWId id1 = new TWId();  //隨機產生一組身分證字號
		TWId id2 = new TWId(true); //產生一組男生
		TWId id3 = new TWId(7);// 桃園的男人
		TWId id4 = new TWId(true,7);//男桃園人 
		System.out.println(id1 + " + " + id2 + " + " +id3 + " + " + id4);
	}

}
