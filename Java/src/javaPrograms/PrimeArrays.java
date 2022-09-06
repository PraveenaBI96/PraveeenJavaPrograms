package javaPrograms;

public class PrimeArrays {
public static void main(String[] args) {
	int[]a= {2,3,4,5,6,7,8,9,10};
	for (int j = 0; j < a.length; j++) 
	{
		int n = a[j];
		int i=2;
		while(i<=n)
		{
			if(n%i==0)
			{
				break;
			}
			i++;
		}
		if(n==i)
		{
			System.out.println(n);
		}
	}
}
}
