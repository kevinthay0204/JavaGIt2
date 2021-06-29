package tw.kevin;
//ASCIII
//Array

public class Brad13 {

	public static void main(String[] args) {
		int[] a;
		a = new int[3]; //index =>0~2
		System.out.println(a.length);
		System.out.println(a[2]);
		System.out.println("-------");
		
		a[0]= 1111111;
		a[1]= 1231323;
		a[2]= 123412;
		
		for(int i = 0; i<a.length;i++) {
			System.out.println(a[i]);
			}
				

	}

}
