package javaPrograms;

public class PrimeNumber {
public static void main(String[] args) {
	int n=5;
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
		System.out.println("prime");
	}else
	{
		System.out.println("not a Prime");
	}
}
}
