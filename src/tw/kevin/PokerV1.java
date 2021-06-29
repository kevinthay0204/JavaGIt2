package tw.kevin;
// 發牌 deal with card
// 1. 洗牌
// 2. 發排
// 3. 攤牌 -> 理排
public class PokerV1 {

	public static void main(String[] args) {
		int[] poker = new int[52];
		for (int i =0; i < poker.length; i++) {
			int rand = (int)(Math.random()*52); // 0~51
			
			//檢查機制
			boolean isRepeat =false;
				for (int j=0; j<i;j++) {
					if (poker[j] == rand) {
					//重複	
					isRepeat = true;
					break;
					}
				}
				
				if (!isRepeat) {
					poker[i] = rand;
					System.out.println(poker[i]);
				}else {
					i--;
				}
				}
				
				
			
		}

	}


