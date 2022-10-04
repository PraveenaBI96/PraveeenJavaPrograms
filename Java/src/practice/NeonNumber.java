package practice;

public class NeonNumber {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			int n=i;
			int square= n*n;
			int sum=0;
			while(square>0)
			{
				int rem = square%10;
				sum=sum+rem;
				square=square/10;
			}
			if(n==sum)
			{
				System.out.println(n+" Is Neon Number");
			}
//				System.out.println(n+" Is Not a Neon Number");
		}
	}
}
