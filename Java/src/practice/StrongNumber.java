package practice;

public class StrongNumber {
public static void main(String[] args) {
	for (int i = 0; i < 1000; i++) {
		int num=i;
		int tempNum=num;
		int sum=0;
		while(num>0)
		{
			int fact=1;
			int rem = num%10;
			while(rem>0)
			{
				fact=fact*rem;
				rem--;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(tempNum==sum)
		{
		   System.out.println(tempNum+" is Strong Number");
		}
	}
	
}
}
