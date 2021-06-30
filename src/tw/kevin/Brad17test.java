package tw.kevin;

public class Brad17test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] a;
		
		a =new int[3][][];
		a[0]= new int[2][];
		a[1]= new int[2][];
		a[2]= new int[2][];
		a[0][0]= new int[2];
		a[0][1]= new int[2];
		a[1][0]= new int[2];
		a[1][1]= new int[2];
		a[2][0]= new int[2];
		a[2][1]= new int[2];
		
		for (int[][] v : a) {
			for(int[] vv: v) {
				for(int vvv:vv) {
				
				System.out.print(vvv +" ");
			}
			System.out.println();
		}
	}
		
		int[][] arr = {{1, 2, 3},
	               {4, 5, 6},
	               {7, 8, 9}};
	for(int[] row : arr) {
	    for(int element : row) {
	        System.out.print(element+ " ");
	}
	System.out.println();
	}
}}

