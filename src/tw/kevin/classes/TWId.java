package tw.kevin.classes;
//規劃設計類別的建構式 :身分證 https://zh.wikipedia.org/wiki/%E4%B8%AD%E8%8F%AF%E6%B0%91%E5%9C%8B%E5%9C%8B%E6%B0%91%E8%BA%AB%E5%88%86%E8%AD%89
public class TWId {
	private String id; //屬性
//用建構式完成屬性初始化 
	public TWId() {}
	public TWId(boolean isMale) {}
	public TWId(int area) {}
	public TWId(boolean isMale,int area) {}
//方便 寫起來好看 但是維護性不好 + => ?
//	private TWId(String id) {}
//
	public static boolean isRightID(String id) {
		
//第一馬 英文 2~10馬位數字
//第二馬 1or 2
//只能 10馬
	

	boolean ret = false;
		String letters = "ABCDEFGHJKLMNOPQRSTUVXYWZI";
		String id1 = id.toUpperCase(); 	
		if(id1.matches("[A-Z][12][0-9]{8}")) {  //用正規表示法就可以了
			char c1 = id1.charAt(0);
			int n12 =letters.indexOf(c1)+10;
			int n1= n12/10;
			int n2 = n12%10;
			int n3 = Integer.parseInt(id1.substring(1,2));
			int n4 = Integer.parseInt(id1.substring(2,3));
			int n5 = Integer.parseInt(id1.substring(3,4));
			int n6 = Integer.parseInt(id1.substring(4,5));
			int n7 = Integer.parseInt(id1.substring(5,6));
			int n8 = Integer.parseInt(id1.substring(6,7));
			int n9 = Integer.parseInt(id1.substring(7,8));
			int n10 = Integer.parseInt(id1.substring(8,9));
			int n11 = Integer.parseInt(id1.substring(9,10));
			int additup = n1+ 9*n2 + 8*n3 + 7*n4 + 6*n5 + 5*n6 +  4*n7 + 3*n8 + 2*n9 + n10 + n11;
			if(additup%10 == 0 ) {
				ret = true;}
				}
		return ret;	
	}
	
	
	
	
	@Override
	public String toString() {
		
		return id;}
	
	
	

}
