package tw.kevin;

public class Brad12 {

	public static void main(String[] args) {
		
		int row	= 4;
		int col = 3;
		int start = 2;
		int end = row * col + start -1 ;
				
		System.out.println("------------------------------------------------------------");
		for (int k = 0; k < row; k++) {
			for (int j = 1; j <= end ; j++) {
				for (int i = start; i < start+ col ; i++) {
					int newi = i +k* col;
					int r = newi * j ;
					System.out.print(String.format("%d x %d = %d \t ", newi,j,r ));
					}
				System.out.println();
			}
			System.out.println("------------------------------------------------------------");
		}
	}
}
