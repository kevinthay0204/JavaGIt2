package tw.kevin;

public class PokerV3 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int nums =52;
		int[] poker = new int[nums];  //宣告array 把格子預留
		for (int i =0; i<poker.length; i++) { poker[i]=i;}   //把nums張牌擺好，原本array裡面都是0 System.out.println(i);} 
		
		for (int i=nums-1; i>0 ;i--) {
			int rand = (int)(Math.random()*(i+1)); // 這一步是亂數洗牌，所以會創造重複的排 System.out.println(rand);
			/////////////////////////
			int temp = poker[i];
			poker[i]=poker[rand];
			poker[rand]=temp; // System.out.println(temp); 洗牌交換
	
		}
			for (int v:poker) {
				System.out.println(v);
			}
			System.out.println("System.currentTimeMillis()");
		System.out.println(System.currentTimeMillis()-start);
		
		//------------------------------ 發排到四堆
		int[][] players = new int[4][13];
		for (int i=0; i<poker.length; i++) {
			players[i%4][i/4] = poker[i];
		}
		
		for (int[] player :players) {
			for (int card :player) {				
				System.out.print(card+ " ");
			}
			System.out.println();
			}
			
		
	}

}

//for (int i=1; i<5;i++) {
//	System.out.println("玩家"+i);