package tw.kevin;

public class Brad14 {

	public static void main(String[] args) {
		int p0,p1, p2, p3, p4, p5, p6;
		p0= p1= p2= p3= p4= p5= p6= 0;
		
		for (int i=0; i<100; i++) {
			int point = (int)(Math.random()*6)+1;
			switch(point) {
			case 1:p1++; break;
			case 2:p2++; break;
			case 3:p3++; break;
			case 4:p4++; break;
			case 5:p5++; break;
			case 6:p6++; break;
			default:p0++; break;		
			}
			}
		if (p0 == 0) {
			String diceFormat= "point %d shows %d times.";
			System.out.println(String.format(diceFormat, 1, p1));
			System.out.println(String.format(diceFormat, 2, p2));
			System.out.println(String.format(diceFormat, 3, p3));
			System.out.println(String.format(diceFormat, 4, p4));
			System.out.println(String.format(diceFormat, 5, p5));
			System.out.println(String.format(diceFormat, 6, p6));
		}else {  System.out.println("Error");}
		
		}
		
	}


