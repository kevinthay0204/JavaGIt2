package tw.kevin;

public class Brad16b {

	public static void main(String[] args) {
		int[] b =new int[] {1,2,3,4};
		int[][] a = new int [3][4];
		for (int v : b ) {  // for-each
			System.out.println(v + " ");
		}
		System.out.println();
		System.out.println("-----");
		
		
		
		for(int[] v: a) {
			for(int vv: v) {
				System.out.println( vv +" ");
		}
			System.out.println("");
	}
	}
}
