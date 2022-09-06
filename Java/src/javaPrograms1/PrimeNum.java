package javaPrograms1;

public class PrimeNum {
public static void main(String[] args) {
	int start=1;
	int end = 100;
	for (int i = start; i <=end ; i++) {
		int a=2;
		while(a<=i)
		{
			if(i%a==0)
			{
				break;
			}
			a++;
		}
		if(i==a)
		{
			System.out.println(i);
		}
		
	}
}
}
