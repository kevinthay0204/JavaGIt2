package tw.kevin.classes;



//規劃設計類別的建構式 :身分證 https://zh.wikipedia.org/wiki/%E4%B8%AD%E8%8F%AF%E6%B0%91%E5%9C%8B%E5%9C%8B%E6%B0%91%E8%BA%AB%E5%88%86%E8%AD%89
public class TWId {
	private static final Integer Charter = null;
	private static String letters = "ABCDEFGHJKLMNOPQRSTUVXYWZI";
	private String id; //屬性
//用建構式完成屬性初始化 
	public TWId() {
		this((int)(Math.random()*2)==0);
	}
	
	public TWId(boolean isMale) {
		this(isMale, (int)(Math.random()*26));
	}

	public TWId(int area) {
		this((int)(Math.random()*2)==0,area);
	}
	public TWId(boolean isMale,int area) {  //身分證字號隨機產生器
		StringBuffer sb = new StringBuffer(letters.substring(area,area +1));
		sb.append(isMale?"1":"2");
		sb.append((int)(Math.random()*10)).append((int)(Math.random()*10)).append((int)(Math.random()*10))
		.append((int)(Math.random()*10)).append((int)(Math.random()*10)).append((int)(Math.random()*10))
		.append((int)(Math.random()*10));
		
		String temp = sb.toString();
		for(int i =0 ;i<10;i++) {
			if(isRightID(temp + i)) {
				id = temp +i;
				break;	
			}
		}	
	}
	private TWId(String id) {
		this.id =id;
	}
	
	public static TWId createTWIdFromString(String id) {
		if (isRightID(id)) {
			return new TWId(id);  // 對應到Brad31
		}
		return null;
	}

	public static boolean isRightID(String id) {		
//第一馬 英文 2~10 位數字
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
	
	
	public static boolean isMale(String id) {
		if (id.charAt(1)=='1') {
		return true; 
		}else
		return false;}
	
	
	public static String getArea(String id) {
		String ret =null;
		if (isRightID(id)) {
			String letters = "ABCDEFGHJKLMNOPQRSTUVXYWZI";
			int Location =letters.indexOf(id.toUpperCase().charAt(0))+10;
			switch(Location) {
			case 10: ret = "臺北市"; break;
			case 11: ret = "臺中市"; break;
			case 12: ret = "基隆市"; break;
			case 13: ret = "臺南市"; break;
			case 14: ret = "高雄市"; break;
			case 15: ret = "新北市"; break;
			case 16: ret = "宜蘭縣"; break;
			case 17: ret = "桃園市"; break;
			case 18: ret = "新竹縣"; break;
			case 19: ret = "苗栗縣"; break;
			case 20: ret = "臺中縣"; break;
			case 21: ret = "南投縣"; break;
			case 22: ret = "彰化縣"; break;
			case 23: ret = "雲林縣"; break;
			case 24: ret = "嘉義縣"; break;
			case 25: ret = "臺南縣"; break;
			case 26: ret = "高雄縣"; break;
			case 27: ret = "屏東縣"; break;
			case 28: ret = "花蓮縣"; break;
			case 29: ret = "臺東縣"; break;
			case 30: ret = "澎湖縣"; break;
			case 31: ret = "陽明山管理局"; break;
			case 32: ret = "金門縣"; break;
			case 33: ret = "連江縣"; break;
			case 34: ret = "嘉義市"; break;
			}}		
			return ret;
		}
	
	
	
	
	@Override
	public String toString() {
		
		return id;}
	
	
	

}
