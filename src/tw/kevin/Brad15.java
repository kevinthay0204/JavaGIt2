package tw.kevin;

public class Brad15 {

	public static void main(String[] args) {
		int [] p = new int[7]; //p[0]=0, ....p[6]=0
		
		for (int i=0; i<100; i++) {
			int point = (int)(Math.random()*6)+1;
			if (point>=1 && point<=6) {	
				p[point]++;
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


