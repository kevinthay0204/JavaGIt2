package tw.kevin;

import tw.kevin.classes.TWId;

public class Brad31 {

	public static void main(String[] args) {
		TWId id1 = new TWId();  //隨機產生一組身分證字號
		TWId id2 = new TWId(true); //產生一組男生
		TWId id3 = new TWId(7);// 桃園的男人
		TWId id4 = new TWId(true,7);//男桃園人 
		TWId id5 = TWId.createTWIdFromString("H124066179d");
		System.out.println(id1 + " + " + id2 + " + " +id3 + " + " + id4);
		System.out.println(id5);
		
		String id6 = "H123066179";
		 if (TWId.isMale(id6)){
			System.out.println("Right, "+ id6 + " He is male.");}
		 else{
			 System.out.println("She is female.");
		 }
		
		 System.out.println(TWId.getArea("h124066179"));
		 System.out.println(TWId.isMale("h220364410"));
		 System.out.println(TWId.getArea("H164308343"));
		 System.out.println("--------");
		 
		 for (int i =0;i<10;i++) {
			 TWId id10 = new TWId();
			 String id10x = id10.toString(); 
			 System.out.println(id10);
			 System.out.println(TWId.getArea(id10x) +"人");
		 }
		 
	}

}
