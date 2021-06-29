package tw.kevin;

public class Brad16 {

	public static void main(String[] args) {
		int [] p = new int[7]; //p[0]=0, ....p[6]=0
		
		for (int i=0; i<10000; i++) {
			int point = (int)(Math.random()*9)+1;
			if (point>=1 && point<=9) {	
				p[point>6?point-3:point]++; //三元運算式 應用在array裡面
			}else {
				p[0]++;
			}
			}
		if (p[0] == 0) {
			String diceFormat= "point %d shows %d times.";
			for(int i=1; i<p.length ;i++) {
			System.out.println(String.format(diceFormat, i, p[i]));
			}
		}else {  System.out.println("Error"+p[0]);}
		
//		System.out.println(p.length);
		}
		
	}


