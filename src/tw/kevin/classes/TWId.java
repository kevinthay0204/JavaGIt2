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
	if(id.length()==10) {
		
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String id1 = id.toUpperCase(); 
		char c1 = id1.charAt(0);	
		if (letters.indexOf(c1)>=0) {
			char c2= id.charAt(1);
			if(c2 =='1' || c2 == '2') {
				
				if(id1.matches("[A-Z][12][0-9]{8}")) {  //用正規表示法就可以了
				ret = true;
				}
			}
		}
	}
		return ret;	
	}
	
	
	
	
	@Override
	public String toString() {
		
		return id;}
	
	
	

}
