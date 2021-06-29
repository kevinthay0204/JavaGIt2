package tw.kevin;

public class Brad16a {

	public static void main(String[] args) {
		//矩陣 Matrix =>空間
		//陣列 Array =>記憶體資料 =>線性 永遠都用一維  觀念用樹狀圖方式可以表達出n維
		int[][] a = new int [3][4];
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(a[1].length);
		System.out.println(a[2].length);
		System.out.println("---");
		
		for (int i =0; i<a.length;i++) {
			for (int j = 0; j<a[i].length; j++ ) {
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
			}
	}
}
