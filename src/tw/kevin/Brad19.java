package tw.kevin;

public class Brad19 {

	public static void main(String[] args) {
		//1+2+3+...+n
		int i=1;
		int n=10;
		int sum=0;
		
		while(i<n+1) {
			sum += i++;
		}
		System.out.println(String.format("1 + 2 + ... + %d = %d",n,sum));
	}

}
