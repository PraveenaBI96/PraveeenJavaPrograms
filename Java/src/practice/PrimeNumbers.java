package practice;

public class PrimeNumbers {
public static void main(String[] args) {
	int n=1;
	int m=100;
	for (int i = n; i <= m; i++) {
		int a=2;
		int count=1;
		while(a<i)
		{
		   if(i%a==0)
		   {
			   count++;
		   }
		   a++;
		}
		if(count==1)
		{
		    System.out.println(i);
		}
	}
}
}
