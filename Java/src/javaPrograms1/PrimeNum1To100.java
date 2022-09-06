package javaPrograms1;

public class PrimeNum1To100 {
public static void main(String[] args) {
	int a=1;
	int b=100;
	
	for(int i=a;i<b;i++)
	{
	boolean prime=true;
		for(int j=2;j<i;j++)
	{
		if(i%j==0)
		{
			prime=false;
		}
	}
		if(prime)
		{
			System.out.println(i);
		}
	}
}
}
