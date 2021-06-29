package tw.kevin;

import java.util.Scanner;

public class Brad12 {

	public static void main(String[] args) {
	//-------------------------------------
		Scanner rowS =new Scanner(System.in);
		System.out.println("Enter a number of row for your multiplication table: ");
		int row = rowS.nextInt();
	//-------------------------------------	
		Scanner colS = new Scanner(System.in);
		System.out.println(",then enter a number of column:  ");
		int col = colS.nextInt();
	//-------------------------------------	
		Scanner startS = new Scanner(System.in);
		System.out.println("Which number you want to start?: ");
		int start = startS.nextInt();		
		int end = row * col + start -1 ;
		
		System.out.println(String.format("\nCongratulation!! you get the multiplication table from "
				+ "\n%d x 1 to %d x %d\n"
				+ "quite easy isn't it?",start,end,end));
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
